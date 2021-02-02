package com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.configs;

import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.configs.scanned.MyProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.configs.scanned")
@EnableConfigurationProperties(MyProperties.class)
public class MainConfig {
}
