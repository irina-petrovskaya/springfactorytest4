package com.mytests.springboot.autoconfiguration.bundle4usage.usemyautoconfigurationbundle4;

import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableConfigurationProperties
public class UseMyAutoconfigurationBundle4Application implements CommandLineRunner {

    @Autowired
    ApplicationContext ctx;

    @Autowired(required = false)
    private Bean1 bean1_from_mainconfig;


    @Autowired
    private Bean2 bean2_from_innerconfig1;

    @Autowired
    private Bean3 bean3_from_innerconfig2;

    @Autowired(required = false)
    private Bean4 bean4_from_innerconfig3;

    @Autowired
    private Bean5 bean5_from_innerconfig4;


    public static void main(String[] args) {
        SpringApplication.run(UseMyAutoconfigurationBundle4Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        String[] beans = ctx.getBeanDefinitionNames();
        System.out.println("**************************************************************************");
        for (String _bean : beans) {
            if (_bean.toString().startsWith("bean")) {
                System.out.println(_bean);
            }
        }
        System.out.println("**************************************************************************");

    }
}
