
package com.natanduarte.temosvagas.actions;

import java.util.Arrays;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EvaluateJobType implements Action {

    @Override
    public String run(HttpServletRequest request, HttpServletResponse response)
            throws ServletException {

        String type = request.getParameter("jobType");
        String importPath = getImportPath(type);

        if ((type == null) || (importPath == null))
            return "redirect:CreateNewJob";

        request.setAttribute("importPath", importPath);
        request.setAttribute("jobType", type);

        return "forward:forms/create-job.jsp";
    }

    private String getImportPath(String type) {
        List<String> formNames = Arrays.asList(
            "regular", "internship", "trainee", "freelancer"
        );

        for (String name : formNames)
            if (type.equals(name))
                return "../forms/form-"+name+".jsp";

        return null;
    }
}
