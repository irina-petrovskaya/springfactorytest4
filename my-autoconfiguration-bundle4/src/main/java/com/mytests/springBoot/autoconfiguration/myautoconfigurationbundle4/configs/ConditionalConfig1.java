package com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.configs;

import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans.Bean1;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration("myconfig_enabled_by_prop1")
@ConditionalOnProperty(name="myprops.prop1", havingValue = "prop1")
public class ConditionalConfig1 {
    @Bean
    public Bean1 bean1() {
        return new Bean1("bean1");
    }
}
