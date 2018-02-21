package com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.configs;

import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.configs.imported.ImportedConfig1;
import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.configs.imported.ImportedConfig2;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ImportedConfig1.class, ImportedConfig2.class})
public class MainConfig {
}
