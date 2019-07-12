package com.mytests.springboot.autoconfiguration.bundle4usage.usemyautoconfigurationbundle4;

import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans.Bean1;
import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans.Bean2;
import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.configs.components.Compo1;
import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.configs.components.Compo2;
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
    @Autowired
    private Bean1 b1;
    @Autowired
    private Bean2 b2;


    @Autowired
    private Compo1 c1;
    @Autowired
    private Compo2 c2;


    @Test
    public void test() {
        System.out.println("=================== test started ==================");
        Assert.assertEquals("bean1_from_client", b1.toString());
        Assert.assertEquals("bean2_autoconfigured", b2.toString());
        Assert.assertEquals("compo2_autoconfigured", c2.getId());
        Assert.assertEquals("compo1_from_client", c1.getId());

    }

}
