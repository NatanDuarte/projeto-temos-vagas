
package com.natanduarte.temosvagas.actions;

import com.natanduarte.temosvagas.model.DataBase;
import com.natanduarte.temosvagas.model.Job;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class JobPage implements Action {

    @Override
    public String run(HttpServletRequest request, HttpServletResponse response)
            throws ServletException {

        int id = Integer.parseInt(request.getParameter("id"));

        DataBase db = new DataBase();
        Job job = db.SELECT_JOB_WHERE_ID(id);

        System.out.println(job.getDescription());
        System.out.println(job.getMetadata().getMinimumRequirements());

        request.setAttribute("job", job);

        return "forward:pages/job-page.jsp";
    }
}
