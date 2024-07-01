package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import java.time.Duration;
import java.util.List;

public class MtsTest {

    private static ChromeDriver driver;

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.mts.by/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.findElement(By.id("cookie-agree")).click();
        JavascriptExecutor js = driver;
        WebElement element = driver.findElement(By.id("pay-section"));
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    @Test
    public void blockNameTest() {
        WebElement actual = driver.findElement(By.xpath("//h2[.='Онлайн пополнение без комиссии']"));
        String partOne = "Онлайн пополнение";
        String enter = "\n";
        String partTwo = "без комиссии";
        String expected = partOne + enter + partTwo;
        Assertions.assertEquals(actual.getText(), expected);
    }

    @Test
    public void paymentLogosTest() {
        List <WebElement> elements = driver.findElements(By.xpath("//div[@class='pay__partners']/ul/li"));
        Assertions.assertFalse(elements.isEmpty());
    }

    @Test
    public void linkTest() {
        WebElement link = driver.findElement(By.xpath("//a[text()='Подробнее о сервисе']"));
        link.click();
        Assertions.assertTrue(driver.getCurrentUrl().contains("https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/"));
    }

    @Test
    public void continueButtonTest() {
        WebElement phoneNumber = driver.findElement(By.id("connection-phone"));
        WebElement sum = driver.findElement(By.id("connection-sum"));
        WebElement email = driver.findElement(By.id("connection-email"));
        WebElement buttonContinue = driver.findElement(By.xpath("//button[text()='Продолжить']"));

        phoneNumber.sendKeys("297777777");
        sum.sendKeys("50");
        email.sendKeys("mts@gmail.com");
        buttonContinue.click();

        WebElement element = driver.findElement(By.xpath("//div[@class='bepaid-app']"));
        Assertions.assertTrue(element.isDisplayed());
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}