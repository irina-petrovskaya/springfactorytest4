/*
 * Copyright (c) 2018
 */

package com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans;

public class Bean4 {
    private final String id;

    public Bean4(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return id;
    }
}