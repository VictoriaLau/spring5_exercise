package com.vic.highlight_spring5.ch1.aop;

import org.springframework.stereotype.Service;

@Service
public class DemoMethodService {

    public void add() {
        System.out.println("com.vic.highlight_spring5.ch1.aop.DemoMethodService.add");
    }

    public void update() {
        System.out.println("com.vic.highlight_spring5.ch1.aop.DemoMethodService.update");
    }
}
