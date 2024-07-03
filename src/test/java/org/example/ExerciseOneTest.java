package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class ExerciseOneTest extends MainTest{

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://www.mts.by/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.id("cookie-agree")).click();
        JavascriptExecutor js = driver;
        WebElement element = driver.findElement(By.id("pay-section"));
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    @Test // Тест подсказывающего текста в полях в разделе услуги связи
    public void communicationServicesTest() {
        WebElement phoneNumber = driver.findElement(By.id("connection-phone"));
        WebElement sum = driver.findElement(By.id("connection-sum"));
        WebElement email = driver.findElement(By.id("connection-email"));

        String expectedPhoneNumber = "Номер телефона";
        String expectedSum = "Сумма";
        String expectedEmail = "E-mail для отправки чека";

        Assertions.assertAll(
                () -> Assertions.assertEquals(expectedPhoneNumber, phoneNumber.getAttribute("placeholder")),
                () -> Assertions.assertEquals(expectedSum, sum.getAttribute("placeholder")),
                () -> Assertions.assertEquals(expectedEmail, email.getAttribute("placeholder")));
    }

    @Test // Тест подсказывающего текста в полях в разделе домашний интернет
    public void homeInternetTest() {
        WebElement listButton = driver.findElement(By.xpath("//button[@class ='select__header']"));
        WebElement homeInternet = driver.findElement(By.xpath("//button[@class ='select__header']/following::ul[1]/li/p[text()='Домашний интернет']"));

        WebElement internetPhone = driver.findElement(By.id("internet-phone"));
        WebElement internetSum = driver.findElement(By.id("internet-sum"));
        WebElement internetEmail = driver.findElement(By.id("internet-email"));

        String expectedInternetPhone = "Номер абонента";
        String expectedInternetSum = "Сумма";
        String expectedInternetEmail = "E-mail для отправки чека";

        listButton.click();
        homeInternet.click();

        Assertions.assertAll(
                () -> Assertions.assertEquals(expectedInternetPhone, internetPhone.getAttribute("placeholder")),
                () -> Assertions.assertEquals(expectedInternetSum, internetSum.getAttribute("placeholder")),
                () -> Assertions.assertEquals(expectedInternetEmail, internetEmail.getAttribute("placeholder")));
    }

    @Test // Тест подсказывающего текста в полях в разделе рассрочка
    public void installmentTest() {
        WebElement listButton = driver.findElement(By.xpath("//button[@class ='select__header']"));
        WebElement installment = driver.findElement(By.xpath("//button[@class ='select__header']/following::ul[1]/li/p[text()='Рассрочка']"));

        WebElement accountNumber = driver.findElement(By.id("score-instalment"));
        WebElement installmentSum = driver.findElement(By.id("instalment-sum"));
        WebElement installmentEmail = driver.findElement(By.id("instalment-email"));

        String expectedAccountNumber = "Номер счета на 44";
        String expectedInstallmentSum = "Сумма";
        String expectedInstallmentEmail = "E-mail для отправки чека";

        listButton.click();
        installment.click();

        Assertions.assertAll(
                () -> Assertions.assertEquals(expectedAccountNumber, accountNumber.getAttribute("placeholder")),
                () -> Assertions.assertEquals(expectedInstallmentSum, installmentSum.getAttribute("placeholder")),
                () -> Assertions.assertEquals(expectedInstallmentEmail, installmentEmail.getAttribute("placeholder")));
    }

    @Test // Тест подсказывающего текста в полях в разделе задолженность
    public void arrearsTest() {
        WebElement listButton = driver.findElement(By.xpath("//button[@class ='select__header']"));
        WebElement arrears = driver.findElement(By.xpath("//button[@class ='select__header']/following::ul[1]/li/p[text()='Задолженность']"));

        WebElement accountNumber = driver.findElement(By.id("score-arrears"));
        WebElement arrearsSum = driver.findElement(By.id("arrears-sum"));
        WebElement arrearsEmail = driver.findElement(By.id("arrears-email"));

        String expectedAccountNumber = "Номер счета на 2073";
        String expectedArrearsSum = "Сумма";
        String expectedArrearsEmail = "E-mail для отправки чека";

        listButton.click();
        arrears.click();

        Assertions.assertAll(
                () -> Assertions.assertEquals(expectedAccountNumber, accountNumber.getAttribute("placeholder")),
                () -> Assertions.assertEquals(expectedArrearsSum, arrearsSum.getAttribute("placeholder")),
                () -> Assertions.assertEquals(expectedArrearsEmail, arrearsEmail.getAttribute("placeholder")));
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}