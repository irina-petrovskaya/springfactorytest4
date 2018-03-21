package com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.configs;

import org.springframework.boot.context.properties.NestedConfigurationProperty;

import java.util.List;
import java.util.Map;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 3/19/2018.
 * Project: springfactorytest4
 * *******************************
 */
public class CustomProps2 {
    String str2;
    int int2;
    MyEnum1 myEnum2;
    List<String> stringList2;
    Map<MyEnum1, String> map2;
    @NestedConfigurationProperty
    PropData propData;

    public PropData getPropData() {
        return propData;
    }

    public void setPropData(PropData propData) {
        this.propData = propData;
    }

    public String getStr2() {
        return str2;
    }

    public void setStr2(String str2) {
        this.str2 = str2;
    }

    public int getInt2() {
        return int2;
    }

    public void setInt2(int int2) {
        this.int2 = int2;
    }

    public MyEnum1 getMyEnum2() {
        return myEnum2;
    }

    public void setMyEnum2(MyEnum1 myEnum2) {
        this.myEnum2 = myEnum2;
    }

    public List <String> getStringList2() {
        return stringList2;
    }

    public void setStringList2(List <String> stringList2) {
        this.stringList2 = stringList2;
    }

    public Map <MyEnum1, String> getMap2() {
        return map2;
    }

    public void setMap2(Map <MyEnum1, String> map2) {
        this.map2 = map2;
    }
}
