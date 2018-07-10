package com.vic.highlight_spring5.ch1.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainDI {

    public static void main(String[] args ){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DIConfig.class);

        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);

        System.out.println(useFunctionService.sayHello("di"));
        context.close();
    }
}
