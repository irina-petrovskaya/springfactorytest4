package com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.configs;

import java.util.List;
import java.util.Map;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 3/19/2018.
 * Project: springfactorytest4
 * *******************************
 */
public class CustomProps1 {

    String str1;
    int int1;
    MyEnum1 myEnum1;
    List<String> stringList1;
    Map<MyEnum1, String> map1;

    public String getStr1() {
        return str1;
    }

    public void setStr1(String str1) {
        this.str1 = str1;
    }

    public int getInt1() {
        return int1;
    }

    public void setInt1(int int1) {
        this.int1 = int1;
    }

    public MyEnum1 getMyEnum1() {
        return myEnum1;
    }

    public void setMyEnum1(MyEnum1 myEnum1) {
        this.myEnum1 = myEnum1;
    }

    public List <String> getStringList1() {
        return stringList1;
    }

    public void setStringList1(List <String> stringList1) {
        this.stringList1 = stringList1;
    }

    public Map <MyEnum1, String> getMap1() {
        return map1;
    }

    public void setMap1(Map <MyEnum1, String> map1) {
        this.map1 = map1;
    }
}
