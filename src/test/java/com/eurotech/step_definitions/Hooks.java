package com.eurotech.step_definitions;

import com.eurotech.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;


public class Hooks {

    @Before
    public void setup() {
        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @After
    public void tearDown(Scenario scenario) {

        if (scenario.isFailed()) {
            final byte[] screeshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screeshot, "image/png", "screenshot");
        }

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
