package com.mytests.springboot.autoconfiguration.bundle4usage.usemyautoconfigurationbundle4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties
public class UseMyAutoconfigurationBundle4Application implements CommandLineRunner {

    @Autowired
    ApplicationContext ctx;

    public static void main(String[] args) {
        SpringApplication.run(UseMyAutoconfigurationBundle4Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        String[] beans = ctx.getBeanDefinitionNames();
        System.out.println("**************************************************************************");
        for (String _bean : beans) {
            if (_bean.contains("service1") || _bean.contains("service2")) {
                System.out.println(_bean);
            }
        }
        System.out.println("**************************************************************************");

    }
/*
    @Bean // with this bean present the bean of BeanService1Impl1 type is NOT available
    public String first_service1() {
        return "first_service1";
    }*/
   /* @Bean // with this bean present the bean of BeanService1Impl2 type is NOT available
    public String second_service1() {
        return "second_service1";
    }*/
    @Bean  // with this bean present the bean of BeanService2Impl1 type is available
    public String first_service2() {
        return "first_service2";
    }
    @Bean // with this bean present the bean of BeanService2Impl2 type is available
    public String second_service2() {
        return "second_service2";
    }
}
