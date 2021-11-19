
package com.natanduarte.temosvagas.actions;

import com.natanduarte.temosvagas.model.DataBase;
import com.natanduarte.temosvagas.model.Job;
import java.util.Arrays;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UpdateJob implements Action {

    @Override
    public String run(HttpServletRequest request, HttpServletResponse response)
            throws ServletException {

        int id = Integer.parseInt(request.getParameter("id"));

        DataBase db = new DataBase();
        Job job = db.SELECT_JOB_WHERE_ID(id);
        String importPath = getImportPath(job.getType());

        request.setAttribute("job", job);
        request.setAttribute("id", id);
        request.setAttribute("importPath", importPath);

        if ((job.getType() == null) || (importPath == null))
            return "redirect:CreateNewJob";

        return "forward:forms/update-job.jsp";
    }

    private String getImportPath(String type) {
        List<String> formNames = Arrays.asList(
            "regular", "internship",
            "trainee", "freelancer"
        );

        for (String name : formNames)
            if (type.equals(name))
                return "../forms/form-"+name+".jsp";

        return null;
    }
}
