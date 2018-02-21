package com.mytests.springboot.autoconfiguration.bundle4usage.usemyautoconfigurationbundle4;

import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans.Bean1;
import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans.Bean2;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UseMyAutoconfigurationBundle4ApplicationTests {

    // error: though condition beans are not available,
    // the beans that should be available depending on conditional ones presence are
    // shown as available:

    @Autowired(required = false)
    @Qualifier("importedconfig1_condition")
    private String importedconfig1_condition;

    @Autowired(required = false)
    @Qualifier("importedconfig2inner_condition")
    private String importedconfig2inner_condition;

    @Autowired(required = false)
    @Qualifier("importedconfig2_condition")
    private String importedconfig2_condition;

    @Autowired(required = false)
    private Bean1 bean1_from_importedconfig1;
    @Autowired(required = false)
    private Bean2 bean2_from_importedconfig2inner;


    @Test
    public void testImportedConfig1() {
        if (importedconfig1_condition != null) {
            System.out.println("condition for ImportedConfig1 matches, bean1 should be available");
            Assert.assertNotNull(bean1_from_importedconfig1);
        } else {
            System.out.println("condition for ImportedConfig1 doesn't match, bean1 should not be available");
            Assert.assertNull(bean1_from_importedconfig1);
        }
    }

    @Test
    public void testImportedConfig2() {
        if ((importedconfig2_condition != null) && (importedconfig2inner_condition != null)) {
            System.out.println("both condition for ImportedConfig2 and ImportedConfig2Inner match, bean2 should be available");
            Assert.assertNotNull(bean2_from_importedconfig2inner);
        } else {
            if (importedconfig2_condition != null) {
                System.out.println("condition for ImportedConfig2 matches, but for ImportedConfig2Inner fails - bean2 should not be available");
                Assert.assertNull(bean2_from_importedconfig2inner);
            } else {
                if (importedconfig2inner_condition != null) {
                    System.out.println("condition for ImportedConfig2inner matches, but for ImportedConfig2 fails - bean2 should not be available");
                    Assert.assertNull(bean2_from_importedconfig2inner);
                } else {
                    System.out.println("both condition for ImportedConfig2 and ImportedConfig2Inner don't match, bean2 should not be available");
                    Assert.assertNull(bean2_from_importedconfig2inner);
                }
            }
        }
    }
}
