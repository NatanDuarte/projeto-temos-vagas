
// Banco de dados simulado
// TO-DO: substituir essa classe por uma integração com Banco real

package com.natanduarte.temosvagas.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataBase {

    private static List<Company> companies = new ArrayList<>();
    private static List<Job> jobs = new ArrayList<>();
    private static int jobId = 0;
    private static int companyId = 0;

    static {
        Company testCompany = new Company("admin", "admin", "12.332.112/0001-97");

        Job job1 = new Job("Engenheiro de dados",
                "Linguagens SQL e Python, Soluções de dados em Cloud AWS.",
                "internship", testCompany.getId());
        job1.getMetadata().setBenefits("plano de saúde;");
        job1.getMetadata().setMinimumRequirements("Boa comunicação oral/escrita");
        job1.getMetadata().setCourseSemester(4);

        Job job2 = new Job("Designer de produto",
                "Definir métodos e normas de padrões de qualidade. Aprovar e analisar testes e relatórios de aprovação do produto final.",
                "trainee", testCompany.getId());
        job2.getMetadata().setBenefits("plano de saúde;");
        job2.getMetadata().setMinimumRequirements("Boa comunicação oral/escrita");
        job2.getMetadata().setGraduationYear(2021);

        Job job3 = new Job("Cientista de Dados (Visão Computacional)",
                "Excelentes habilidades analíticas, pensamento crítico e de diagnóstico de hipóteses.", 
                "regular", testCompany.getId());
        job3.getMetadata().setBenefits("plano de saúde;");
        job3.getMetadata().setMinimumRequirements("Boa comunicação oral/escrita");

        DataBase.jobs.add(0, job1);
        job1.setId(DataBase.jobId++);

        DataBase.jobs.add(0, job2);
        job2.setId(DataBase.jobId++);

        DataBase.jobs.add(0, job3);
        job3.setId(DataBase.jobId++);

        DataBase.companies.add(testCompany);
        testCompany.setId(DataBase.companyId++);
    }

    public void INSERT_JOB(Job job) {
        job.setId(DataBase.jobId++);
        DataBase.jobs.add(0, job);
    }

    public void INSERT_COMPANY(Company company) {
        DataBase.companies.add(company);
        company.setId(DataBase.companyId++);
    }

    public List<Job> SELECT_ALL_JOBS() {
        return DataBase.jobs;
    }

    public void DELETE_JOB_WHERE_ID(int id) {
        for (Iterator<Job> iterator = DataBase.jobs.iterator(); iterator.hasNext();) {
            Job job = iterator.next();

            if (job.getId() == id)
                iterator.remove();
        }
    }

    public Job SELECT_JOB_WHERE_ID(int id) {
        for (Job job : DataBase.jobs)
            if (job.getId() == id)
                return job;

        return null;
    }

    public Company SELECT_COMPANY(String login, String password) {
        for (Company company : DataBase.companies)
            if (company.validate(login, password))
                return company;

        return null;
    }

    public List<Job> getJobsFromCompany(int id) {
        List<Job> companyJobs = new ArrayList<>();

        for (Job job : DataBase.jobs)
            if (job.getCompanyId() == id)
                companyJobs.add(job);

        return companyJobs.isEmpty() ? null : companyJobs;
    }

}
