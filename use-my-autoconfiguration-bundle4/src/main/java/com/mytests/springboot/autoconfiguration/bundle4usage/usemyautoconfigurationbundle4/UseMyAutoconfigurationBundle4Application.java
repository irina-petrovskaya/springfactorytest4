package com.mytests.springboot.autoconfiguration.bundle4usage.usemyautoconfigurationbundle4;

import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans.Bean1;
import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans.Bean2;
import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.configs.components.Compo1;
import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.configs.components.Compo2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

@SpringBootApplication
@EnableConfigurationProperties
//@Primary
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
            if (_bean.toString().startsWith("bean")) {
                System.out.println(_bean);
            }
        }
        System.out.println("**************************************************************************");

    }
    @Bean  @Primary
    public Bean1 bean1_local() {
        return new Bean1("bean1_from_client");
    }

    @Bean
    public Bean2 bean2_local() {
        return new Bean2("bean2_from_client");
    }

    @Bean @Primary
    public Compo1 comp1() {
         Compo1 compo1 = new Compo1();
        compo1.setId("compo1_from_client");
        return compo1;
    }
    @Bean
    public Compo2 comp2() {
        Compo2 c2 = new Compo2();
        c2.setId("compo2_from_client");
        return c2;
    }
}
