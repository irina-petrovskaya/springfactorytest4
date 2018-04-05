/*
 * Copyright (c) 2018
 */

package com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.health_indicators;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class WorkTimeHealthIndicator implements HealthIndicator {

    @Override
    public Health health() {
        int[] errorCode = checkTime();
        if (errorCode[0] != 0) {
            return Health.outOfService().withDetail("Go home, the time is ", errorCode[1]).build();
        }
        return Health.up().withDetail("keep working, it is only ", errorCode[1]).build();
    }

    private int[] checkTime() {
        Date today = new Date();
        long time = today.getHours();
        int[] rez = {0, (int) time};
        if (time >= 18) {
            rez[0] = 1;
        }

        return rez;

    }

}