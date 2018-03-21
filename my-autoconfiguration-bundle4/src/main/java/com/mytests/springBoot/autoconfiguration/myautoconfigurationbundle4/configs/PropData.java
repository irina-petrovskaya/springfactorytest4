package com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.configs;

import java.util.List;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 3/19/2018.
 * Project: springfactorytest4
 * *******************************
 */
public class PropData {
    String strProp;
    List<String> listProp;

    public String getStrProp() {
        return strProp;
    }

    public void setStrProp(String strProp) {
        this.strProp = strProp;
    }

    public List <String> getListProp() {
        return listProp;
    }

    public void setListProp(List <String> listProp) {
        this.listProp = listProp;
    }
}
