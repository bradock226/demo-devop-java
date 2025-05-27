package com.example;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    @Test
    void openGoogle() {
        // Assumes ChromeDriver is available in PATH
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        System.out.println("Title: " + driver.getTitle());
        driver.quit();
    }
}
