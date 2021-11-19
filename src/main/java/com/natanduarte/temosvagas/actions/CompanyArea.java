
package com.natanduarte.temosvagas.actions;

import com.natanduarte.temosvagas.model.Company;
import com.natanduarte.temosvagas.model.DataBase;
import com.natanduarte.temosvagas.model.Job;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CompanyArea implements Action {

    @Override
    public String run(HttpServletRequest request, HttpServletResponse response)
            throws ServletException {

        HttpSession session = request.getSession();
        Company company = (Company) session.getAttribute("loggedCompany");

        DataBase db = new DataBase();
        List<Job> companyJobs = db.getJobsFromCompany(company.getId());

        request.setAttribute("companyJobs", companyJobs);

        return "forward:pages/company-area.jsp";
    }
}
