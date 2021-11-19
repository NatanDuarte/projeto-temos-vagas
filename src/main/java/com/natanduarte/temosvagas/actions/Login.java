
package com.natanduarte.temosvagas.actions;

import com.natanduarte.temosvagas.model.Company;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Login implements Action {

    @Override
    public String run(HttpServletRequest request, HttpServletResponse response)
            throws ServletException {

        HttpSession session = request.getSession();
        Company company = (Company) session.getAttribute("loggedCompany");

        if (company != null)
            return "redirect:CompanyArea";

        return "forward:forms/login.jsp";
    }
}
