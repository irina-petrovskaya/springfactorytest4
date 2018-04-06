package com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans;

public class Bean2 {
    private final String id;
    private final String details;

    public Bean2(String id, String details) {
        this.id = id;
        this.details = details;
    }

    public String getId() {
        return id;
    }

    public String getDetails() {
        return details;
    }
}
