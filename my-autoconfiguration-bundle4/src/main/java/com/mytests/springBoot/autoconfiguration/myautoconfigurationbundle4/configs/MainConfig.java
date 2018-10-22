package com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.configs;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath*:xml-config.xml")
@ConditionalOnProperty(name = "myprops.prop1", havingValue = "prop1")
@Import(ExtraConfig.class)
public class MainConfig {
    // this class only imports another configurations.
    // the beans defined in these configurations should be available
    // if the property myprops.prop1 is set and has value 'prop1'
}
