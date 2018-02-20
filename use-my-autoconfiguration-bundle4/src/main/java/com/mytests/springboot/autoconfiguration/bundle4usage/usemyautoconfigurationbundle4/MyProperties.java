package com.mytests.springboot.autoconfiguration.bundle4usage.usemyautoconfigurationbundle4;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "myprops")
public class MyProperties {

}
