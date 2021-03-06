package com.restprimer.coworkerbackend;

import com.restprimer.coworkerbackend.web.EmployeeController;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class CoWorkerBackendApplicationTests {

	@Autowired
	EmployeeController employeeController;

	@Test
	void contextLoads() {
		Assertions.assertThat(employeeController).isNotNull();
	}

}
