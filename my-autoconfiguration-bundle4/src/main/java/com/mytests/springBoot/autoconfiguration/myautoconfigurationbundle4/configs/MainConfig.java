package com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.configs;

import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans.Bean1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class MainConfig {

    @Bean
    public Bean1 bean1_from_main() {
        return new Bean1("bean1_from_main");
    }

    @Configuration
    public static class FooConfig {

    }
}
