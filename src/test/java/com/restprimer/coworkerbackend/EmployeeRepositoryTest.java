package com.restprimer.coworkerbackend;

import com.restprimer.coworkerbackend.domain.EmployeeRepository;
import com.restprimer.coworkerbackend.entity.Employee;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace= AutoConfigureTestDatabase.Replace.NONE)
public class EmployeeRepositoryTest {
    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    public void saveEmployee(){
        Employee employee = new Employee("TEST NAME",new GregorianCalendar(1970, Calendar.JANUARY, 1).getTime(),null,100000);
        entityManager.persistAndFlush(employee);
        Assertions.assertThat(!Objects.isNull(employee.getId()));
    }
    @Test
    public void deleteEmployees(){
        entityManager.persistAndFlush(new Employee("DELETE NAME",new GregorianCalendar(1980, Calendar.JUNE, 10).getTime(),null,1110000));
        employeeRepository.deleteAll();
        Assertions.assertThat(employeeRepository.findAll()).isEmpty();
    }


}
