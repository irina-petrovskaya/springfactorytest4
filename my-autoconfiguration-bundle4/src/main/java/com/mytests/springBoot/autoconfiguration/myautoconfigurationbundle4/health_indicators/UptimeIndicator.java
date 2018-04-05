/*
 * Copyright (c) 2018
 */

package com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.health_indicators;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;


public class UptimeIndicator implements HealthIndicator {


    private long time = System.currentTimeMillis();
    private long uptime = 0;

    @Override
    public Health health() {
        int errorCode = checkNow();
        if (errorCode != 0) {
            return Health.down().withDetail("please restart, you are online for " + uptime + " sec", "").build();
        }
        return Health.up().withDetail(" keep calm, you are online only for " + uptime + " sec", "").build();
    }

    private int checkNow() {
        long now = System.currentTimeMillis();
        uptime = (now - time) / 1000;
        if (uptime > 300) {
            return 1;
        } else {
            return 0;
        }
    }
}
