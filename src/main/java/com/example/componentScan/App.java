package com.example.componentScan;

import com.example.autowire.constructor.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context
                = new ClassPathXmlApplicationContext("componentScanExample.xml");
        Employee employee =  context.getBean("employeeBean", Employee.class);
        System.out.println(employee.toString());
    }
}
