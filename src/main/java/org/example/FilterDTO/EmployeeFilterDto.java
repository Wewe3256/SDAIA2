package org.example.FilterDTO;

import jakarta.ws.rs.QueryParam;

public class EmployeeFilterDto {
    private @QueryParam("job_id") Integer job_id;
    private @QueryParam("hire_date") String hire_date;

    public EmployeeFilterDto() {
    }

    public EmployeeFilterDto(Integer job_id, String hire_date) {
        this.job_id = job_id;
        this.hire_date = hire_date;
    }

    public Integer getJob_id() {
        return job_id;
    }

    public String getHire_date() {
        return hire_date;
    }

    public void setJob_id(Integer job_id) {
        this.job_id = job_id;
    }

    public void setHire_date(String hire_date) {
        this.hire_date = hire_date;
    }

    @Override
    public String toString() {
        return "EmployeeFilterDto{" +
                "job_id=" + job_id +
                ", hire_date='" + hire_date + '\'' +
                '}';
    }
}
