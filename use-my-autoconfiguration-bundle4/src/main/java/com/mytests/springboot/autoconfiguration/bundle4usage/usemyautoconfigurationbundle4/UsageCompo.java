package com.mytests.springboot.autoconfiguration.bundle4usage.usemyautoconfigurationbundle4;

import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans.Bean1;
import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans.Bean2;
import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.configs.ConditionalComponent1;
import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.configs.MainConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * *
 * <p>Created by irina on 06.04.2021.</p>
 * <p>Project: springfactorytest4</p>
 * *
 */
@Component
public class UsageCompo {

    @Autowired
    private MainConfig mainConfig;
    
    // this bean should be found if 
    // conditions match for bean method (myprops.b1 = true)
    @Autowired(required = false)
    private Bean1 __bean1;

    // this bean should be found if 
    // conditions match for component  (myprops.comp1 = true)
    @Autowired(required = false)
    private ConditionalComponent1 __conditionalCompo1;
    
    // this bean should be found if 
    // conditions match for bean itself  (myprops.b2 = true)
    // and the container component  (myprops.comp1 = true)
    @Autowired(required = false)
    private Bean2 __bean2;     
    
    public void displayResults(){
        System.out.println("autowired conditional beans:");
        System.out.println(mainConfig.toString());
        if (this.__bean1 != null) {

            System.out.println(__bean1.toString());
        } else {
            System.out.println("no beans of Bean1 type are available");
        }
        if (this.__conditionalCompo1 != null) {

            System.out.println(__conditionalCompo1.getId());
        } else {
            System.out.println("no beans of ConditionalCompo1 type are available");
        }
        if (this.__bean2 != null) {

            System.out.println(__bean2.toString());
        } else {
            System.out.println("no beans of Bean2 type are available");
        }
        
        
    }
}
