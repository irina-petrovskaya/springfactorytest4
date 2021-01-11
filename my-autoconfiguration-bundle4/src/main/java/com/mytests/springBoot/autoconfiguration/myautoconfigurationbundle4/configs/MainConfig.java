package com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.configs;

import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans.*;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan
public class MainConfig {

    @Bean @ConditionalOnMissingBean(name = "first_service1") //@Primary
    public BeanService1 beanService1_first() {
        return new BeanService1Impl1();
    }
    @Bean @ConditionalOnMissingBean(name = "second_service1")
    public BeanService1 beanService1_second() {
        return new BeanService1Impl2();
    }
     // errors are shown if no "first_service1" or "second_service1" beans are defined somewhere in the use-my-autoconfiguration-bundle4 module
    @Bean @ConditionalOnBean(value = BeanService1.class)
    public Bean1 bean1(BeanService1 beanService1) {
        return new Bean1(beanService1);
    }

    @Bean @ConditionalOnBean(name = "first_service2") //@Primary
    public BeanService2 beanService2_first() {
        return new BeanService2Impl1();
    }

    @Bean @ConditionalOnBean(name = "second_service2")
    public BeanService2 beanService2_second() {
        return new BeanService2Impl2();
    }
    // errors are shown if both "first_service2" and "second_service2" beans are defined somewhere in the use-my-autoconfiguration-bundle4 module
    @Bean @ConditionalOnBean(value = BeanService2.class)
    public Bean2 bean2(BeanService2 beanService2) {
        return new Bean2(beanService2);
    }
    
}
