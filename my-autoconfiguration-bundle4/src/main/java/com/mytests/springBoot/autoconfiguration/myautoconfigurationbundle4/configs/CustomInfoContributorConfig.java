/*
 * Copyright (c) 2018
 */

package com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.configs;

import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans.Bean2;
import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.infoContributors.CustomInfoContributor;
import org.springframework.boot.actuate.autoconfigure.info.ConditionalOnEnabledInfoContributor;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 4/6/2018.
 * Project: springfactorytest4
 * *******************************
 */
@Configuration
@ConditionalOnEnabledInfoContributor("custom")
@EnableConfigurationProperties
public class CustomInfoContributorConfig {

    @Bean
    public CustomInfoContributor customInfoContributor() {
        return new CustomInfoContributor();
    }

    @Bean
    public Bean2 bean2_custom_info() {
        return new Bean2("custom information", "the information is provided by custom info contributor");
    }
}
