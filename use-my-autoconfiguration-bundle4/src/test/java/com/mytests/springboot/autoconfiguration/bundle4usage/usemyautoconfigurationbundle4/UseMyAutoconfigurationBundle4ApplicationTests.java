package com.mytests.springboot.autoconfiguration.bundle4usage.usemyautoconfigurationbundle4;

import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans.Bean1;
import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans.Bean2;
import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.configs.scanned.Component1;
import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.configs.scanned.Component2;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Objects;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UseMyAutoconfigurationBundle4ApplicationTests {


    @Autowired
    private Environment environment;

    // error: the scanned components not annotated with @Configuration
    // are not considered as configurations, beans defined there are also
    // not detected - the 'component1', 'component2' and 'bean1' here are
    // shown as not available for autowiring though SB finds them normally

    @Autowired(required = false)
    Component1 component1;      // myprops.prop1 == prop1
    @Autowired(required = false)  // myprops.prop1 == prop1
    private Bean1 bean1_from_component1;
    @Autowired(required = false)  // myprops.prop2 == prop2
    Component2 component2;
    @Autowired(required = false)  // myprops.prop3 == prop3
    private Component2.Component2Inner component2Inner;
    @Autowired(required = false)  // myprops.prop3 == prop3
    private Bean2 bean2_from_component2inner;


    @Test
    public void testComponentsIfAllConditionsMatch() {
       if(Objects.equals(environment.getProperty("myprops.prop1"), "prop1") && Objects.equals(environment.getProperty("myprops.prop2"), "prop2") && Objects.equals(environment.getProperty("myprops.prop3"), "prop2")){
           System.out.println("conditions for all components are satisifed");
           Assert.assertNotNull(component1);
           Assert.assertNotNull(component2);
           Assert.assertNotNull(component2Inner);
           Assert.assertNotNull(bean1_from_component1);
           Assert.assertNotNull(bean2_from_component2inner);
       }
    }

    @Test
    public void testProp1DoesNotMatch() {
        if(!Objects.equals(environment.getProperty("myprops.prop1"), "prop1")){
            System.out.println("condition for component1 and bean1_from_component1 is not satisifed");
            Assert.assertNull(component1);
            Assert.assertNull(bean1_from_component1);
            
        }
    }
    @Test
    public void testProp2DoesNotMatch() {
        if(!Objects.equals(environment.getProperty("myprops.prop2"), "prop2")){
            System.out.println("condition for component2 is not satisifed");
            Assert.assertNull(component2);


        }
    }

    @Test
    public void testProp3DoesNotMatch() {
        if(!Objects.equals(environment.getProperty("myprops.prop3"), "prop3")){
            System.out.println("condition for component2Inner and bean2_from_component2Inner is not satisifed");
            Assert.assertNull(component2Inner);
            Assert.assertNull(bean2_from_component2inner);

        }
    }
}
