package com.example.ipersistencetest.service;

import com.example.ipersistence.io.Resources;

import java.io.InputStream;

public class IpersistenceTest {
    void test() {

        InputStream resourceAsSteam = Resources.getResourceAsSteam("sqlMapConfig.xml");
    }
}
