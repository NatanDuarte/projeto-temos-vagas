
package com.natanduarte.temosvagas.model;

public class JobData {
    private int courseSemester;
    private int graduationYear;
    private String minimumRequirements;
    private int availableDays;

    private String benefits;

    public JobData() {
        this.courseSemester = 0;
        this.graduationYear = 0;
        this.availableDays = 0;
        this.minimumRequirements = null;
        this.benefits = null;
    }

    public int getCourseSemester() {
        return courseSemester;
    }

    public void setCourseSemester(int courseSemester) {
        this.courseSemester = courseSemester;
    }

    public int getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(int graduationYear) {
        this.graduationYear = graduationYear;
    }

    public String getMinimumRequirements() {
        return minimumRequirements;
    }

    public void setMinimumRequirements(String minimumRequirements) {
        this.minimumRequirements = minimumRequirements;
    }

    public String getBenefits() {
        return benefits;
    }

    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }

    public int getAvailableDays() {
        return availableDays;
    }

    public void setAvailableDays(int availableDays) {
        this.availableDays = availableDays;
    }
}
