package com.mytests.springboot.autoconfiguration.bundle4usage.usemyautoconfigurationbundle4;

import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans.Bean1;
import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans.Bean2;
import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.configs.ConditionalConfig1;
import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.configs.ConditionalConfig2;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.util.Assert;

import java.util.Objects;


@SpringBootTest
public class UseMyAutoconfigurationBundle4ApplicationTests {


    @Autowired
    private Environment environment;

    @Autowired(required = false)  // myprops.prop1 == prop1
    ConditionalConfig1 conditionalConfig1;
    @Autowired(required = false)   // myprops.prop1 == prop1
    Bean1 bean1;
    
    @Autowired(required = false)  // myprops.prop2 is defined
    ConditionalConfig2 conditionalConfig2;
    @Autowired(required = false)  // myprops.prop2 is defined
    Bean2 bean2;

    @Test
    void testAllConditionsMatchingCase() {
        if(Objects.equals(environment.getProperty("myprops.prop1"), "prop1") && environment.getProperty("myprops.prop2") != null){
            System.out.println("conditions for all components are satisifed");

            Assert.notNull(conditionalConfig1, "conditionalConfig1 is not enabled");
            Assert.notNull(bean1, "bean1 is not enabled");
            Assert.notNull(conditionalConfig2, "conditionalConfig2 is not enabled");
            Assert.notNull(bean2, "bean2 is not enabled");
            
        }   
    }

    @Test
    void testProp1NotMatchingCase() {
        if(!Objects.equals(environment.getProperty("myprops.prop1"), "prop1")){
            System.out.println("condition for conditionalConfig1 and bean1 is not satisifed");
            Assert.isNull(conditionalConfig1, "conditionalConfig1 enabled");
            Assert.isNull(bean1, "bean1 is enabled");
        } 
    }

    @Test
    void testProp2NotMatchingCase() {
        if(environment.getProperty("myprops.prop2") == null){
            System.out.println("condition for conditionalConfig2 and bean2 is not satisifed");

            Assert.isNull(conditionalConfig2, "conditionalConfig1 is enabled");
            Assert.isNull(bean2, "bean1 is enabled");

        }
    }
}
