
package com.natanduarte.temosvagas.actions;

import com.natanduarte.temosvagas.model.DataBase;
import com.natanduarte.temosvagas.model.Job;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Create implements Action {

    @Override
    public String run(HttpServletRequest request, HttpServletResponse response)
            throws ServletException {

        String title = request.getParameter("title");
        String description = request.getParameter("description");
        String type = request.getParameter("jobType");
        int companyId = Integer.parseInt(request.getParameter("companyId"));

        Job job = new Job(title, description, type, companyId);

        job = setMetadata(job, request);

        DataBase db = new DataBase();
        db.INSERT_JOB(job);

        return "redirect:CompanyArea";
    }

    private Job setMetadata(Job job, HttpServletRequest request)
            throws ServletException {

        String benefits = request.getParameter("benefits");
        String minimumRequirements = request.getParameter("minimum-requirements");

        job.getMetadata().setBenefits(benefits);
        job.getMetadata().setMinimumRequirements(minimumRequirements);

        switch (job.getType()) {
            case "internship":
                int courseSemester = Integer.parseInt(request.getParameter("course-semester"));
                job.getMetadata().setCourseSemester(courseSemester);
                break;
            case "trainee":
                int graduationYear = Integer.parseInt(request.getParameter("graduation-year"));
                job.getMetadata().setGraduationYear(graduationYear);
                break;
            case "freelancer":
                int availableDays = Integer.parseInt(request.getParameter("available-days"));
                job.getMetadata().setAvailableDays(availableDays);
                break;
            default:
                break;
        }

        return job;
    }
}
