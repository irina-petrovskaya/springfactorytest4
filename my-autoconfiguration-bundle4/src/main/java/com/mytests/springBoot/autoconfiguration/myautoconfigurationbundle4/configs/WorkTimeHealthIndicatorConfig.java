/*
 * Copyright (c) 2018
 */

package com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.configs;


import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.health_indicators.UptimeIndicator;
import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.health_indicators.WorkTimeHealthIndicator;
import org.springframework.boot.actuate.autoconfigure.health.ConditionalOnEnabledHealthIndicator;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnEnabledHealthIndicator("worktime")
@EnableConfigurationProperties
public class WorkTimeHealthIndicatorConfig {

    @Bean("worktimeHealthIndicator")
    public WorkTimeHealthIndicator workTimeHealthIndicator() {
        return new WorkTimeHealthIndicator();
    }
}
