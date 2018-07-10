package com.vic.highlight_spring5.ch1.aop;

import org.springframework.stereotype.Service;

@Service
public class DemoAnnotationService {


    @Action(name="intercepting add() via annotation")
    public void add(){
        System.out.println("com.vic.highlight_spring5.ch1.aop.DemoAnnotationService.add");
    }
}
