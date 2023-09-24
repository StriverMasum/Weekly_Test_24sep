package com.geekster.Weekly.Test.service;

import com.geekster.Weekly.Test.model.Job;
import com.geekster.Weekly.Test.repo.IJob;
import jakarta.persistence.metamodel.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    IJob iJob;

    public String removeJobById(Long id) {
        iJob.deleteById(id);
        return "deleted";
    }


    public String CreateJob(List<Job> newJob) {
    iJob.saveAll(newJob);
    return "addJob";
    }

    public Iterable<Job> getAllJobs() {
    return (List<Job>) iJob.findAll();
    }

    public String updateSalaryById(Long id, double salary) {
        Job presentJob = iJob.findById(id).orElse(null);
        if(presentJob != null)
        {
            presentJob.setSalary(salary);
            iJob.save(presentJob);
            return "Salary updated!!";
        }
        else {
            return "Job not found!";
        }
    }

    public List<Job> getJobByLocationSalary(Double salary, String location) {

        return iJob.findBySalaryGreaterThanEqualAndLocation(salary, location);
    }
}
