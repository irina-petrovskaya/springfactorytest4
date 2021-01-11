package com.mytests.springboot.autoconfiguration.bundle4usage.usemyautoconfigurationbundle4;

import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * *
 * <p>Created by irina on 11.01.2021.</p>
 * <p>Project: springfactorytest4</p>
 * *
 */
@Configuration
@Import(ConditionalBeansConfigChild.class)
public class ConditionalBeansConfig {

    @Bean
    public ConditionalBean0 localConditionalBean0() {
        return new ConditionalBean0("localConditionalBean0");
    }
    @Bean
    public ConditionalBean1 conditionalBean1() {
        return new ConditionalBean1("conditionalBean1");
    }

    @Bean
    public ConditionalBean2 conditionalBean2() {
        return new ConditionalBean2("conditionalBean2");
    }

    @Bean
    public ConditionalBean3 condition3() {
        return new ConditionalBean3("condition3");
    }

    
}
