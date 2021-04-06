package com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.configs;

import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans.Bean2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * *
 * <p>Created by irina on 06.04.2021.</p>
 * <p>Project: springfactorytest4</p>
 * *
 */
@Component("__conditionalCompo1")
@ConditionalOnProperty("myprops.comp1")
public class ConditionalComponent1 {

    @Value("ConditionalCompo1 enabled if myprops.comp1 == true")
    String id;

    public String getId() {
        return id;
    }

    @Bean("__bean2")
    @ConditionalOnProperty(name = "myprops.b2", havingValue = "true", matchIfMissing = false)
    public Bean2 bean2() {
        return new Bean2("bean1 conditional on myprops.b1==true");
    }
}
