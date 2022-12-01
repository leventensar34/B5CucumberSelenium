package com.eurotech.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.security.PublicKey;

public class Hooks {

    @Before
    public void setup() {

        System.out.println("\nThis is coming from Before Method");

    }

    @After
    public void tearDown() {

        System.out.println("\nThis is coming from After Method");
    }

    // Senaryoya özel befor after methodlari olusturulabilir
    @Before("@db")
    public void setupDb() {
        System.out.println("\tConnecting DB");
    }

    @After("@db")
    public void CloseDB() {
        System.out.println("\tDisconnecting DB");
    }
}
