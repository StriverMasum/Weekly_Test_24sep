package com.geekster.Weekly.Test.controller;

import com.geekster.Weekly.Test.model.Job;
import com.geekster.Weekly.Test.service.JobService;
import jakarta.persistence.metamodel.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobController {

    @Autowired
    JobService jobService;

    @PostMapping("CreateJob")
    public String CreateJob(@RequestBody List<Job> NewJob){
        return jobService.CreateJob(NewJob);
    }

    @GetMapping("getJobs")
    public Iterable<Job> getAllJobs(){
        return jobService.getAllJobs();
    }

    @DeleteMapping("/{id}")
    public String removeJobById(@PathVariable Long id) {
         return jobService.removeJobById(id);
    }

    @PutMapping("Job/salary/id")
    public String updateSalaryById(@RequestParam Long id,@RequestParam double salary)
    {
        return jobService.updateSalaryById(id,salary);
    }


    @GetMapping("jobs")
    public List<Job> getJobByLocationSalary( @RequestParam  Double salary, @RequestParam String location){

        return jobService.getJobByLocationSalary(salary, location);
    }
}
