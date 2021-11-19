
package com.natanduarte.temosvagas.actions;

import com.natanduarte.temosvagas.model.DataBase;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeleteJob implements Action {

    @Override
    public String run(HttpServletRequest request, HttpServletResponse response)
            throws ServletException {

        int id = Integer.parseInt(request.getParameter("id"));

        DataBase db = new DataBase();
        db.DELETE_JOB_WHERE_ID(id);

        return "redirect:CompanyArea";
    }
}
