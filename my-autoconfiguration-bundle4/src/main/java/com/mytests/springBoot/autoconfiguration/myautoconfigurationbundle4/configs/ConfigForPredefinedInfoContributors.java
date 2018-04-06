/*
 * Copyright (c) 2018
 */

package com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.configs;

import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans.Bean1;
import org.springframework.boot.actuate.autoconfigure.info.ConditionalOnEnabledInfoContributor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 4/6/2018.
 * Project: springfactorytest4
 * *******************************
 */
@Configuration
@ConditionalOnEnabledInfoContributor("env")
public class ConfigForPredefinedInfoContributors {

    @Bean
    public Bean1 bean1_env_info() {
        return new Bean1("bean1_env_info");
    }
}
