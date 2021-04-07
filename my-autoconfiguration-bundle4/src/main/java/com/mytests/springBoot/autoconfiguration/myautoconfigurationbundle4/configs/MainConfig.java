package com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.configs;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableConfigurationProperties
public class MainConfig {
}
