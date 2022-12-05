package com.eurotech.step_definitions;

import com.eurotech.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks {

    @Before
    public void setup() {

        System.out.println("\nThis is coming from Before Method");

    }

    @After
    public void tearDown() {

        System.out.println("\nThis is coming from After Method");
        Driver.closeDriver();
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
