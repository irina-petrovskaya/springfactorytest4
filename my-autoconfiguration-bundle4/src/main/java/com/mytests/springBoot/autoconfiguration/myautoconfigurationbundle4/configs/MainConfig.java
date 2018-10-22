package com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.configs;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("xml-config.xml")
@ConditionalOnProperty(name = "myprops.prop1", havingValue = "prop1")
@Import(ExtraConfig.class)
public class MainConfig {
}
