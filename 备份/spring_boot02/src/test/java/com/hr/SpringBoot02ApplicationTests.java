package com.hr;

import com.hr.entity.Computer;
import com.hr.entity.Person;
import com.hr.entity.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot02ApplicationTests {
	@Autowired
	private Student stu;

	@Autowired
	private Person person;

	@Autowired
    private ApplicationContext ioc;

	@Autowired
	@Qualifier("computer")
	private Computer computer;

	@Test
	public void contextLoads() {
//		System.out.println(stu);
//		System.out.println(person);
//        Computer computer = (Computer) ioc.getBean("computer");
		System.out.println(computer);
	}

}
