package com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.configs.scanned;

import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans.Bean2;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Component("component2")
@ConditionalOnProperty(name="myprops.prop2", havingValue = "prop2")
public class Component2 {



    @Configuration
    @ConditionalOnProperty(name="myprops.prop3", havingValue = "prop3")
    public static class Component2Inner{

        @Bean
        public Bean2 bean2_from_component2inner() {
            return new Bean2("bean2_from_component2inner");
        }
    }
}
