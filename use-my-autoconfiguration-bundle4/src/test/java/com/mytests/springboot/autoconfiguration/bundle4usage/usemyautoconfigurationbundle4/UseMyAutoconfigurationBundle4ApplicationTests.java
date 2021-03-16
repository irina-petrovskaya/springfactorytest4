package com.mytests.springboot.autoconfiguration.bundle4usage.usemyautoconfigurationbundle4;

import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans.Bean1;
import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans.Bean2;
import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans.Bean3;
import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.configs.ConditionalConfig1;
import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.configs.ConditionalConfig2;

import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.configs.ConditionalConfig3;
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
    
    @Autowired(required = false)  // myprops.prop2 is defined and is not false
    ConditionalConfig2 conditionalConfig2;
    @Autowired(required = false)  // myprops.prop2 is defined  and is not false
    Bean2 bean2;

    @Autowired(required = false)
    private ConditionalConfig3 conditionalConfig3;  // myprops.prop5 is not defined or is not false
    @Autowired(required = false)
    private Bean3 bean3; // myprops.prop5 is not defined or is not false



    @Test
    void testProp1Prop2ConditionsMatchingCase() {
        if(Objects.equals(environment.getProperty("myprops.prop1"), "prop1") && environment.getProperty("myprops.prop2") != null){
            if(!Objects.equals(environment.getProperty("myprops.prop2"), "false")) {
                System.out.println("conditions for all components are satisfied");

                Assert.notNull(conditionalConfig1, "conditionalConfig1 is not enabled");
                Assert.notNull(bean1, "bean1 is not enabled");
                Assert.notNull(conditionalConfig2, "conditionalConfig2 is not enabled");
                Assert.notNull(bean2, "bean2 is not enabled");
            }
        }   
    }

    @Test
    void testProp1NotMatchingCase() {
        if(!Objects.equals(environment.getProperty("myprops.prop1"), "prop1")){
            System.out.println("condition for conditionalConfig1 and bean1 is not satisfied");
            Assert.isNull(conditionalConfig1, "conditionalConfig1 enabled");
            Assert.isNull(bean1, "bean1 is enabled");
        } 
    }

    @Test
    void testProp2NotMatchingCase() {
        if(environment.getProperty("myprops.prop2") == null){
            System.out.println("condition for conditionalConfig2 and bean2 is not satisfied (property is not set)");

            Assert.isNull(conditionalConfig2, "conditionalConfig1 is enabled");
            Assert.isNull(bean2, "bean1 is enabled");

        } else if (Objects.equals(environment.getProperty("myprops.prop2"), "false")) {
            System.out.println("condition for conditionalConfig2 and bean2 is not satisfied (property == false)");

            Assert.isNull(conditionalConfig2, "conditionalConfig1 is enabled");
            Assert.isNull(bean2, "bean1 is enabled"); 
        }
    }
  @Test
  public void testProp5MatchingCase(){
     if(!Objects.equals(environment.getProperty("myprops.prop5"), "false")){
         System.out.println("condition for conditionalConfig3 and bean3 is satisfied (property value is not false)");
         Assert.notNull(conditionalConfig3,"conditionalConfig3 is not enabled");
         Assert.notNull(bean3,"bean3 is not enabled");
     }   
     
  }
    @Test
    public void testProp5NotMatchingCase(){
        if(Objects.equals(environment.getProperty("myprops.prop5"), "false")){
            System.out.println("condition for conditionalConfig3 and bean3 is not satisfied (property value is false)");
            Assert.isNull(conditionalConfig3,"conditionalConfig3 is enabled");
            Assert.isNull(bean3,"bean3 is enabled");
        }
    }
}
