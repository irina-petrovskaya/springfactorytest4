package com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans;

public class ConditionalBean4 {
    private final String id;

    public ConditionalBean4(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return id;
    }
}
