package com.mytests.springboot.autoconfiguration.bundle4usage.usemyautoconfigurationbundle4;

import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans.ConditionalAnno1;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * *
 * <p>Created by irina on 11.01.2021.</p>
 * <p>Project: springfactorytest4</p>
 * *
 */
@Component("annotatedConditionComponent1")
@ConditionalAnno1
public class AnnotatedConditionComponent1 {

    @Value("AnnotatedConditionComponent1")
    String id;

    public String getId() {
        return id;
    }
}
