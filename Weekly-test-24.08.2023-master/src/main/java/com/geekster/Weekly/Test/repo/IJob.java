package com.geekster.Weekly.Test.repo;

import com.geekster.Weekly.Test.model.Job;
import jakarta.persistence.metamodel.Type;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IJob extends CrudRepository<Job, Long> {

    List<Job> findBySalaryGreaterThanEqualAndLocation(Double salary, String location);
}
