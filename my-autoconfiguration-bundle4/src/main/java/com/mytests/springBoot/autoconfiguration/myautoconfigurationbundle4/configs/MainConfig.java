package com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.configs;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableConfigurationProperties
public class MainConfig {

    @Bean
    @ConfigurationProperties(prefix = "myprops.custom1")
    public CustomProps1 customProps1() {
        return new CustomProps1();
    }
    @Bean
    @ConfigurationProperties(prefix = "myprops.custom2")
    public CustomProps2 customProps2() {
        return new CustomProps2();
    }

}
