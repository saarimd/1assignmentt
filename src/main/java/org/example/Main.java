package org.example;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Tom tom = context.getBean(Tom.class);
        Jerry jerry = context.getBean(Jerry.class);

        System.out.println(tom.getName() + " is chasing " + jerry.getName());
    }
}