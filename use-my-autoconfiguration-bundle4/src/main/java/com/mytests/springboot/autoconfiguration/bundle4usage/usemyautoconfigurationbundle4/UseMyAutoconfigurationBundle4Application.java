package com.mytests.springboot.autoconfiguration.bundle4usage.usemyautoconfigurationbundle4;

import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans.Bean1;
import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans.Bean2;
import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.configs.ConditionalConfig1;
import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.configs.ConditionalConfig2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class UseMyAutoconfigurationBundle4Application implements CommandLineRunner {

    @Autowired
    ApplicationContext ctx;
    
    @Autowired(required = false)  // myprops.prop1 == prop1
    ConditionalConfig1 conditionalConfig1;
    @Autowired(required = false)   // myprops.prop1 == prop1
    Bean1 bean1;
    
    @Autowired(required = false)  // myprops.prop2 is defined and not false
    ConditionalConfig2 conditionalConfig2;
    @Autowired(required = false)  // myprops.prop2 is defined and not false
    Bean2 bean2;
    public static void main(String[] args) {
        SpringApplication.run(UseMyAutoconfigurationBundle4Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        String[] beans = ctx.getBeanDefinitionNames();
        System.out.println("**************************************************************************");
        for (String _bean : beans) {
            if (_bean.toString().startsWith("bean")||_bean.toString().startsWith("component")||_bean.toString().startsWith("myconfig")) {
                System.out.println(_bean);
            }
        }
        System.out.println("**************************************************************************");

    }
}
