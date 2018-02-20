package com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.configs;

import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans.Bean1;
import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans.Bean2;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(name = "myprops.prop1", havingValue = "prop1")
public class ConditionalOnPropertyWithInnerConfig1 {

    @Bean(name = "mybean_ConditionalOnPropertyWithInnerConfig1_bean1")
    public Bean1 bean1() {
        return new Bean1("mybean_ConditionalOnPropertyWithInnerConfig1_bean1");
    }

    @Configuration
    @ConditionalOnProperty(name = "myprops.prop2", havingValue = "prop2")
    static class ConditionalOnPropertyWithInnerConfig1_Inner {

        @Bean(name = "mybean_ConditionalOnPropertyWithInnerConfig1_inner_bean2")
        public Bean2 bean2() {
            return new Bean2("mybean_ConditionalOnPropertyWithInnerConfig1_inner_bean2");
        }
    }
}