package com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.configs;


import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.health_indicators.UptimeIndicator;
import org.springframework.boot.actuate.autoconfigure.health.ConditionalOnEnabledHealthIndicator;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnEnabledHealthIndicator("uptime")
@EnableConfigurationProperties
public class UptimeIndicatorConfig {

    @Bean("uptimeHealthIndicator")
    public UptimeIndicator uptimeIndicator() {
        return new UptimeIndicator();
    }
}
