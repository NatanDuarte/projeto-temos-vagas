
package com.natanduarte.temosvagas.actions;

import com.natanduarte.temosvagas.model.DataBase;
import com.natanduarte.temosvagas.model.Job;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ApplyForJob implements Action {

    @Override
    public String run(HttpServletRequest request, HttpServletResponse response)
            throws ServletException {

        int id = Integer.parseInt(request.getParameter("id"));

        DataBase db = new DataBase();
        Job job = db.SELECT_JOB_WHERE_ID(id);

        request.setAttribute("job", job);

        return "forward:forms/apply-for-job.jsp";
    }
}
