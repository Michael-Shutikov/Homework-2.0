package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Main {

    protected static ChromeDriver driver;
    protected String URL = "https://www.mts.by/";

    protected void openBrowserAndFindPaySection() {
        driver = new ChromeDriver();
        driver.get(URL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.id("cookie-agree")).click();
        JavascriptExecutor js = driver;
        WebElement element = driver.findElement(By.id("pay-section"));
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    protected void fillOutThePaySection() {
        WebElement phoneNumber = driver.findElement(By.id("connection-phone"));
        WebElement sum = driver.findElement(By.id("connection-sum"));
        WebElement email = driver.findElement(By.id("connection-email"));
        WebElement buttonContinue = driver.findElement(By.xpath("//button[text()='Продолжить']"));

        phoneNumber.sendKeys("297777777");
        sum.sendKeys("50");
        email.sendKeys("mts@gmail.com");
        buttonContinue.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='bepaid-iframe']")));
    }
}