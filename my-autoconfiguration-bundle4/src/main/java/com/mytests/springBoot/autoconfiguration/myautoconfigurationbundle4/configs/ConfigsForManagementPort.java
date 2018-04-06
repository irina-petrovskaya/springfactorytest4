/*
 * Copyright (c) 2018
 */

package com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.configs;

import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans.Bean3;
import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans.Bean4;
import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans.Bean5;
import org.springframework.boot.actuate.autoconfigure.web.server.ConditionalOnManagementPort;
import org.springframework.boot.actuate.autoconfigure.web.server.ManagementPortType;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 4/6/2018.
 * Project: springfactorytest4
 * *******************************
 */
@Configuration
public class ConfigsForManagementPort {

    @Configuration
    @ConditionalOnManagementPort(ManagementPortType.SAME)
    public static class ConfigOnSameManagementPort {

        @Bean
        public Bean3 bean3_for_same_port() {
            return new Bean3("bean3_for_same_port");
        }
    }

    @Configuration
    @ConditionalOnManagementPort(ManagementPortType.DIFFERENT)
    public static class ConfigOnDifferentManagementPort {
        @Bean
        public Bean4 bean4_for_diff_port() {
            return new Bean4("bean4_for_diff_port");
        }

    }

    @Configuration
    @ConditionalOnManagementPort(ManagementPortType.DISABLED)
    public static class ConfigOnDisabledManagementPort {
        @Bean
        public Bean5 bean5_for_disabled_port() {
            return new Bean5("bean5_for_disabled_port");
        }

    }
}
