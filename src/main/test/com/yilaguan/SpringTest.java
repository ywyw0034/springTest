package com.yilaguan;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class SpringTest {

    @Test
    public void testSpring(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        SpringTest springTest=(SpringTest)applicationContext.getBean("springTest");
        springTest.printString();
    }

    private void printString() {
        System.out.println("123");
    }
}
