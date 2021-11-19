
package com.natanduarte.temosvagas.actions;

import com.natanduarte.temosvagas.model.Company;
import com.natanduarte.temosvagas.model.DataBase;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ValidateLogin implements Action {

    @Override
    public String run(HttpServletRequest request, HttpServletResponse response)
            throws ServletException {

        String login = request.getParameter("login");
        String password = request.getParameter("password");

        // check if the credentials match in the DataBase
        DataBase db = new DataBase();
        Company company = db.SELECT_COMPANY(login, password);

        if (company == null)
            return "redirect:Login";

        // hooks user information into the session request
        HttpSession session = request.getSession();
        session.setAttribute("loggedCompany", company);

        return "redirect:CompanyArea";
    }
}
