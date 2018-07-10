package com.vic.highlight_spring5.ch1.di;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//ComponentScan will automatically scan all of Beans under the package, the Beans which annotated by @Service, @Component, @Repository and @Controller.
@Configuration
@ComponentScan("com.vic.highlight_spring5.ch1.di")
public class DIConfig {
}
