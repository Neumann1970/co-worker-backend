package com.restprimer.coworkerbackend;

import com.restprimer.coworkerbackend.domain.EmployeeRepository;
import com.restprimer.coworkerbackend.entity.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Calendar;
import java.util.GregorianCalendar;

@SpringBootApplication
public class CoWorkerBackendApplication {

    private static final Logger logger = LoggerFactory.getLogger(CoWorkerBackendApplication.class);

    @Autowired
    EmployeeRepository employeeRepository;

    public static void main(String[] args) {
        SpringApplication.run(CoWorkerBackendApplication.class, args);
        logger.info("Welcome Co-Worker Spring Boot App");
    }

    @Bean
    CommandLineRunner runner() {
        return args -> {
            employeeRepository.save(new Employee("Mihail Kozakov",new GregorianCalendar(2014, Calendar.FEBRUARY, 1).getTime(),null,110000));
            employeeRepository.save(new Employee("Andrey Zhdanov",new GregorianCalendar(2017, Calendar.MAY, 7).getTime(),null,70000));
            employeeRepository.save(new Employee("Alex Smirnov",new GregorianCalendar(2012, Calendar.AUGUST, 15).getTime(),null,100000));
            employeeRepository.save(new Employee("Mike Huze",new GregorianCalendar(2015, Calendar.JUNE, 22).getTime(),null,50000));
            employeeRepository.save(new Employee("George Mironov",new GregorianCalendar(2014, Calendar.FEBRUARY, 21).getTime(),null,90000));
            employeeRepository.save(new Employee("Zagg Hill",new GregorianCalendar(2010, Calendar.MARCH, 30).getTime(),null,40000));
        };

    }

}
