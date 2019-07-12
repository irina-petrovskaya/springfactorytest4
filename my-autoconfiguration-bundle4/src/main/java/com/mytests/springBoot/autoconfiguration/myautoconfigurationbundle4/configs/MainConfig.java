package com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.configs;

import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans.Bean1;
import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans.Bean2;
import org.springframework.boot.autoconfigure.condition.ConditionalOnNotWebApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan
@ConditionalOnNotWebApplication()
public class MainConfig {

    //@ConditionalOnNotWebApplication()
    //static class ConditionalConfig{
        @Bean
        public Bean1 bean1() {
            return new Bean1("bean1_autoconfigured");
        }

        @Bean  @Primary
        public Bean2 bean2() {
            return new Bean2("bean2_autoconfigured");
        }
    //}
}
