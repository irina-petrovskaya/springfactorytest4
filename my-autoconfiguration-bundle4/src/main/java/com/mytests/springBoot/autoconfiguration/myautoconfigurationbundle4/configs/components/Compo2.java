package com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.configs.components;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 7/12/2019.
 * Project: springfactorytest4
 * *******************************
 */
@Component("compo2") @Primary
public class Compo2 {


    String id = "compo2_autoconfigured";

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
