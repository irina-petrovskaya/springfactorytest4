package com.mytests.springboot.autoconfiguration.bundle4usage.usemyautoconfigurationbundle4;

import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans.Bean1;
import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans.Bean2;
import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.configs.scanned.Component1;
import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.configs.scanned.Component2;
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

    // just to test autowiring in non-test classes:

    @Autowired(required = false)
    Component1 component1;
    @Autowired(required = false)
    private Bean1 bean1_from_component1;
    @Autowired(required = false)
    Component2 component2;
    @Autowired(required = false)
    private Component2.Component2Inner component2Inner;
    @Autowired(required = false)
    private Bean2 bean2_from_component2inner;

    @Override
    public void run(String... args) throws Exception {
        String[] beans = ctx.getBeanDefinitionNames();
        System.out.println("**************************************************************************");
        for (String _bean : beans) {
            if (_bean.toString().startsWith("bean")||_bean.toString().startsWith("component")) {
                System.out.println(_bean);
            }
        }
        System.out.println("**************************************************************************");

    }
}
