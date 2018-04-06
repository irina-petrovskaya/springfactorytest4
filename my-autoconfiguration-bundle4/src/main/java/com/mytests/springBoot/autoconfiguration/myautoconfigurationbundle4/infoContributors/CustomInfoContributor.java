/*
 * Copyright (c) 2018
 */

package com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.infoContributors;

import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans.Bean2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;

import java.util.HashMap;
import java.util.Map;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 4/6/2018.
 * Project: springfactorytest4
 * *******************************
 */
public class CustomInfoContributor implements InfoContributor {

    @Autowired
    Bean2 bean2;

    @Override
    public void contribute(Info.Builder builder) {
        Map <String, Object> details = new HashMap <>();
        details.put("id", bean2.getId());
        details.put("details", bean2.getDetails());
        builder.withDetails(details);
    }
}
