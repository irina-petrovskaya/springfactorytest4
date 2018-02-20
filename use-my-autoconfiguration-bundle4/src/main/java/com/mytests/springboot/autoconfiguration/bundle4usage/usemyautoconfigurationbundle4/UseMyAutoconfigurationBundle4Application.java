package com.mytests.springboot.autoconfiguration.bundle4usage.usemyautoconfigurationbundle4;

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

    public static void main(String[] args) {
        SpringApplication.run(UseMyAutoconfigurationBundle4Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        String[] beans = ctx.getBeanDefinitionNames();
        System.out.println("**************************************************************************");
        for (String _bean : beans) {
            if (_bean.toString().startsWith("mybean")) {
                System.out.println(_bean);
            }
        }
        System.out.println("**************************************************************************");

    }
}
