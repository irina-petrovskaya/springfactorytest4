package com.mytests.springboot.autoconfiguration.bundle4usage.usemyautoconfigurationbundle4;

import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans.*;
import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.configs.MainConfig;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RegisteredInnerConfigsTest {


    /**
     * Container configuration is not registered, bean is not resolved (ok)
     */
    @Autowired(required = false)
    private Bean1 bean1_from_mainconfig;

    /**
     * container inner configuration is registered using $ (MainConfig$InnerConfig1):
     * no gutter icon, bean2 is not resolved (but should)
     */
    @Autowired
    private Bean2 bean2_from_innerconfig1;

    /**
     * container registered inner configuration has private visibility,
     * no gutter icon is shown. Bean3 is resolved however (ok)
     */
    @Autowired
    private Bean3 bean3_from_innerconfig2;

    /**
     * inner configuration is registered using $ (MainConfig$InnerContainer$InnerConfig3):
     * no gutter icon, bean4 is not resolved (but should)
     */
    @Autowired
    private Bean4 bean4_from_innerconfig3;

    /**
     * container configuration is registered with trailing [space]/[space]: no gutter icon,
     * bean5 is not resolved (but should)
     */
    @Autowired
    private Bean5 bean5_from_innerconfig4;

    @Test
    public void testInnerConfigs() {
        Assert.assertNull(bean1_from_mainconfig);
        Assert.assertNotNull(bean2_from_innerconfig1);
        Assert.assertNotNull(bean3_from_innerconfig2);
        Assert.assertNotNull(bean4_from_innerconfig3);
        Assert.assertNotNull(bean5_from_innerconfig4);

    }

}
