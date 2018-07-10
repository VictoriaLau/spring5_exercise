package com.vic.highlight_spring5.ch1.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainAOP {

    public static void main(String[] args) {
        System.out.println("-----------1-----------");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        System.out.println("-----------2-----------");

        DemoAnnotationService demoAnnotationService = context.getBean(DemoAnnotationService.class);
        System.out.println("-----------3-----------");
        DemoMethodService demoMethodService = context.getBean(DemoMethodService.class);
        System.out.println("-----------4-----------");

        demoAnnotationService.add();
        System.out.println("-----------5-----------");
        demoMethodService.add();
        System.out.println("-----------6-----------");
        demoMethodService.update();

        context.close();
    }
}
