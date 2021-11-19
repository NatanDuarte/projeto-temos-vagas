
package com.natanduarte.temosvagas.model;

public class Job {

    private String title;
    private String description;
    private int id;
    private String type;
    private int companyId;
    private JobData metadata;

    public Job(String title, String requirements,
            String type, int companyId) {
        this.title = title;
        this.description = requirements;
        this.type = type;
        this.companyId = companyId;
        this.metadata = new JobData();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public JobData getMetadata() {
        return metadata;
    }

    public void setMetadata(JobData metadata) {
        this.metadata = metadata;
    }
}
