package com.restprimer.coworkerbackend.domain;

import com.restprimer.coworkerbackend.entity.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee,Long> {
    @Override
    Iterable<Employee> findAll();

    Employee findByUuid(String uuid);

    List<Employee> findBySalaryBetween(double from, double to);
}