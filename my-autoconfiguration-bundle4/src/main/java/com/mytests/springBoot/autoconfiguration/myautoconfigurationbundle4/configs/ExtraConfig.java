package com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.configs;

import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans.Bean2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 10/22/2018.
 * Project: springfactorytest4
 * *******************************
 */
@Configuration
public class ExtraConfig {

    @Bean
    public Bean2 bean2() {
        return new Bean2("bean2");
    }
}
