package com.vic.highlight_spring5.ch2.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainScope {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);

        DemoSingletonService singleton1 = context.getBean(DemoSingletonService.class);
        DemoSingletonService singleton2 = context.getBean(DemoSingletonService.class);
        DemoPrototypeService prototype1 = context.getBean(DemoPrototypeService.class);
        DemoPrototypeService prototype2 = context.getBean(DemoPrototypeService.class);

        System.out.println("Is s1 equals s2? " + (singleton1==singleton2));
        System.out.println("Is p1 equals p2? " + (prototype1==prototype2));

        context.close();

    }
}
