
package com.natanduarte.temosvagas.actions;

import com.natanduarte.temosvagas.model.DataBase;
import com.natanduarte.temosvagas.model.Job;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Update implements Action {

    @Override
    public String run(HttpServletRequest request, HttpServletResponse response)
            throws ServletException {

        String title = request.getParameter("title");
        String description = request.getParameter("description");

        int id = Integer.parseInt(request.getParameter("id"));

        DataBase db = new DataBase();
        Job job = db.SELECT_JOB_WHERE_ID(id);

        job.setDescription(description);
        job.setTitle(title);

        return "redirect:CompanyArea";
    }
}
