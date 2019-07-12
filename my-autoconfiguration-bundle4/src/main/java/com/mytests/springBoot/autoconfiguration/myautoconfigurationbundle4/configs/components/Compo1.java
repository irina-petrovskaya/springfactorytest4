package com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.configs.components;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 7/12/2019.
 * Project: springfactorytest4
 * *******************************
 */
@Component("compo1")
public class Compo1 {


    String id = "compo1_autoconfigured";

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
