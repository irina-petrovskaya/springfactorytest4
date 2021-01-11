package com.mytests.springboot.autoconfiguration.bundle4usage.usemyautoconfigurationbundle4.withLocalBeans;


import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.util.Assert;


@SpringBootTest
public class UseMyAutoconfigurationBundle4_WithLocalBeansTests {


   
    @Autowired(required = false)
    private Bean0 bean0;
    @Autowired(required = false)
    private Bean1 bean1;
    @Autowired(required = false)
    private Bean2 bean2;
    @Autowired(required = false)
    private Bean3 bean3;
    @Autowired(required = false)
    private Bean4 bean4;


    @Test
    public void test() {
        Assert.notNull(bean0, bean0.getDescr());
        Assert.notNull(bean1, bean1.getDescr());
        Assert.notNull(bean2, bean2.getDescr());
        Assert.notNull(bean3, bean3.getDescr());
        Assert.notNull(bean4, bean4.getDescr());
    }

    
    @Configuration
     static class LocalBeansConfig {
    
        @Bean
        public Bean0 bean0() {
            return new Bean0("local bean0");
        }
    
        @Bean
        public Bean1 bean1() {
            return new Bean1("local bean1");
        }
    
        @Bean
        public Bean2 bean2() {
            return new Bean2("local bean2");
        }
    
        @Bean
        public Bean3 bean3() {
            return new Bean3("local bean3");
        }
    
        @Bean
        public Bean4 bean4() {
            return new Bean4("local bean4");
        }
    }
}
