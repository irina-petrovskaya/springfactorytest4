package com.mytests.springboot.autoconfiguration.bundle4usage.usemyautoconfigurationbundle4.withoutLocalBeans;


import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;


@SpringBootTest
public class UseMyAutoconfigurationBundle4ApplicationTests {


    
    @Autowired(required = false)
    private Bean0 bean0;
    @Autowired(required = false)
    private Bean1 bean1;
    @Autowired(required = false)
    private Bean2 bean2;
    @Autowired(required = false)
    private Bean3 bean3;
    @Autowired(required = false)
    private Bean4 bean4;


    @Test
    public void test() {
        String bean0_message = "";
        if (bean0 != null) {
          bean0_message = bean0.getDescr();  
        }
        String bean1_message = "";
        if (bean1 != null) {
            bean1_message = bean1.getDescr();
        }
        String bean2_message = "";
        if (bean2 != null) {
            bean2_message = bean2.getDescr();
        }
        String bean3_message = "";
        if (bean3 != null) {
            bean3_message = bean3.getDescr();
        }
        String bean4_message = "";
        if (bean4 != null) {
            bean4_message = bean4.getDescr();
        }
        
        Assert.isNull(bean0, bean0_message);
        Assert.isNull(bean1, bean1_message);
        Assert.isNull(bean2, bean2_message);
        Assert.isNull(bean3, bean3_message);
        Assert.isNull(bean4, bean4_message);
    }

}
