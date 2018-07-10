package com.vic.highlight_spring5.ch1.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainJavaConfig {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
        System.out.println(useFunctionService.sayHello("JavaConfig"));
        context.close();
    }
}
