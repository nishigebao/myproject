package com.hr;

import com.hr.config.DogConfig;
import com.hr.entity.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot02ApplicationTests {
    /*
    * <bean id="person" class="xxxx.Person">
    *   <properties name="name" value="张三"></properties>
    * </bean>
    * */
    @Autowired
    private Person p;

    @Autowired
    private DogConfig dc;

	@Test
	public void contextLoads() {
        //打印: sout
        System.out.println("p: "+p);
        System.out.println("d: "+dc.getDog());
	}

}
