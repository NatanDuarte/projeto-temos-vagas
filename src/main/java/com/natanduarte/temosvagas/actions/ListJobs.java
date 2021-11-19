
package com.natanduarte.temosvagas.actions;

import com.natanduarte.temosvagas.model.DataBase;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ListJobs implements Action {

    @Override
    public String run(HttpServletRequest request, HttpServletResponse response)
            throws ServletException {

        DataBase db = new DataBase();
        request.setAttribute("jobs", db.SELECT_ALL_JOBS());

        return "forward:pages/jobs.jsp";
    }
}
