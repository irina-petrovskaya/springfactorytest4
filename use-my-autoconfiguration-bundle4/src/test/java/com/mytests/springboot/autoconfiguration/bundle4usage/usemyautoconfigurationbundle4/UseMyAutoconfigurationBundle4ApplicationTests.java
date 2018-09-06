package com.mytests.springboot.autoconfiguration.bundle4usage.usemyautoconfigurationbundle4;

import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans.Bean1;
import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans.Bean2;
import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans.Bean3;
import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans.Bean4;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UseMyAutoconfigurationBundle4ApplicationTests {


    @Autowired
    private Environment environment;
    @Autowired @Qualifier("bean10")
    private Bean1 bean10;
    @Autowired @Qualifier("bean20")
    private Bean2 bean20;
    @Autowired @Qualifier("bean30")
    private Bean3 bean30;
    @Autowired @Qualifier("bean40")
    private Bean4 bean40;

    @Autowired @Qualifier("bean11")
    private Bean1 bean11;
    @Autowired @Qualifier("bean21")
    private Bean2 bean21;
    @Autowired @Qualifier("bean31")
    private Bean3 bean31;
    @Autowired @Qualifier("bean41")
    private Bean4 bean41;

    @Test
    public void testStaticInnerConfigs() {
        Assert.assertNotNull(bean10);
        Assert.assertNotNull(bean20);
        Assert.assertNotNull(bean30);
        Assert.assertNotNull(bean40);
    }

    @Test
    public void testNonStaticInnerConfigs() {
        Assert.assertNotNull(bean11);
        Assert.assertNotNull(bean21);
        Assert.assertNotNull(bean31);
        Assert.assertNotNull(bean41);
    }
}
