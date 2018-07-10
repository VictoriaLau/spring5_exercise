package com.vic.highlight_spring5.ch2.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ELMain {
    public static void main(String[] arg) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ELConfig.class);

        ELConfig resourceService = context.getBean(ELConfig.class);

        resourceService.outputResource();

        context.close();
    }
}
