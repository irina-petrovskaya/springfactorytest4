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
    Component1 component1;
    @Autowired(required = false)
    private Bean1 bean1_from_component1;
    @Autowired(required = false)
    Component2 component2;
    @Autowired(required = false)
    private Component2.Component2Inner component2Inner;
    @Autowired(required = false)
    private Bean2 bean2_from_component2inner;


    @Test
    public void testComponents() {
       if(environment.getProperty("myprops.prop1").equals("prop1")&& environment.getProperty("myprops.prop2").equals("prop2")&& environment.getProperty("myprops.prop3").equals("prop2")){
           Assert.assertNotNull(component1);
           Assert.assertNotNull(component2);
           Assert.assertNotNull(component2Inner);
           Assert.assertNotNull(bean1_from_component1);
           Assert.assertNotNull(bean2_from_component2inner);
       }
    }

}
