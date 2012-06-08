package com.thoughtworks;

import org.openqa.selenium.WebDriver;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class HelloWorldBrowserTest {
    private WebDriver driver;
    private String TEST_URL = System.getProperty(
            "application.url", "");

    @Before
    public void setup() throws Exception {
        driver = new SysPropWebDriverFactory().buildDriver();
    }

    @After
    public void teardown() throws Exception {
        if (driver != null) {
            driver.close();
        }
    }

    @Test
    public void testHelloWorldApp() throws Exception {
        driver.get(TEST_URL);
        assertTrue("Hello World".equals(driver.getTitle()));
        Thread.sleep(5000);
    }
}
