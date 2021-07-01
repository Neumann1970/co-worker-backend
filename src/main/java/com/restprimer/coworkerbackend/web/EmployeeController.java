package com.restprimer.coworkerbackend.web;

import com.restprimer.coworkerbackend.domain.EmployeeRepository;
import com.restprimer.coworkerbackend.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeRepository employeeRepository;

    @RequestMapping("/employees")
    public Iterable<Employee> getEmployees(){
        return employeeRepository.findAll();
    }
    @RequestMapping(value = "api/searchEmployee/{uuid}", method = RequestMethod.GET)
    public Employee getEmployeeByUuid(@PathVariable("uuid") String uuid) {
        return employeeRepository.findByUuid(uuid);
    }
    @RequestMapping("api/salary")
    public List<Employee> getEmployeBySalary(@RequestParam("from") double from, @RequestParam("to") double to){
        return employeeRepository.findBySalaryBetween(from,to);
    }
}
