
package com.natanduarte.temosvagas.actions;

import com.natanduarte.temosvagas.model.Company;
import com.natanduarte.temosvagas.model.DataBase;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ValidateCadaster implements Action {

    @Override
    public String run(HttpServletRequest request, HttpServletResponse response)
            throws ServletException {

        String login = request.getParameter("new-login");
        String password = request.getParameter("new-password");
        String cnpj = request.getParameter("cnpj");

        Company company = new Company(login, password, cnpj);

        DataBase db = new DataBase();

        // TODO: checar se as credenciais ja existem

        db.INSERT_COMPANY(company);

        HttpSession session = request.getSession();
        session.setAttribute("loggedCompany", company);

        return "redirect:CompanyArea";
    }
}
