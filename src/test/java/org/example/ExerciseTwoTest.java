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

public class ExerciseTwoTest extends MainTest{

    @BeforeEach
    public void setUpEach() {
        driver = new ChromeDriver();
        driver.get("https://www.mts.by/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.id("cookie-agree")).click();
        JavascriptExecutor js = driver;
        WebElement element = driver.findElement(By.id("pay-section"));
        js.executeScript("arguments[0].scrollIntoView();", element);

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

    @Test // Тест отображения введённой суммы
    public void priceTest() {
        WebElement price = driver.findElement(By.xpath("//div[@class='pay-description__cost']/span"));

        String expectedPrice = "50.00 BYN";
        Assertions.assertEquals(expectedPrice, price.getAttribute("textContent"));
    }

    @Test // Тест отображения введённого номера телефона
    public void phoneNumberTest() {
        WebElement phoneNumber = driver.findElement(By.xpath("//div[@class='pay-description__text']/span"));

        String expectedPhoneNumber = "Оплата: Услуги связи\n" + "Номер:375297777777";
        Assertions.assertEquals(expectedPhoneNumber, phoneNumber.getAttribute("textContent"));
    }

    @Test // Тест подсказывающего текста в поле ввода номера карты
    public void cardNumberTest() {
        WebElement cardNumber = driver.findElement(By.xpath("//label[@class='ng-tns-c46-1 ng-star-inserted']"));

        String expectedCardNumber = "Номер карты";
        Assertions.assertEquals(expectedCardNumber, cardNumber.getAttribute("textContent"));
    }

    @Test // Тест подсказывающего текста в поле ввода срока действия
    public void expiryDateTest() {
        WebElement expiryDate = driver.findElement(By.xpath("//label[@class='ng-tns-c46-4 ng-star-inserted']"));

        String expectedExpiryDate= "Срок действия";
        Assertions.assertEquals(expectedExpiryDate, expiryDate.getAttribute("textContent"));
    }

    @Test // Тест подсказывающего текста в поле ввода CVC кода
    public void CvcTest() {
        WebElement cvc = driver.findElement(By.xpath("//label[@class='ng-tns-c46-5 ng-star-inserted']"));

        String expectedCvc = "CVC";
        Assertions.assertEquals(expectedCvc, cvc.getAttribute("textContent"));
    }

    @Test // Тест подсказывающего текста в поле ввода имени держателя
    public void nameTest() {
        WebElement name = driver.findElement(By.xpath("//label[@class='ng-tns-c46-3 ng-star-inserted']"));

        String expectedName = "Имя держателя (как на карте)";
        Assertions.assertEquals(expectedName, name.getAttribute("textContent"));
    }

    @Test // Тест подсказывающего текста на кнопке оплатить
    public void inscriptionOnThePayButtonTest() {
        WebElement payButton = driver.findElement(By.xpath("//button[@class='colored disabled']"));

        String expectedPayButton = " Оплатить  50.00 BYN ";
        Assertions.assertEquals(expectedPayButton, payButton.getAttribute("textContent"));
    }

    @Test // Тест наличия логотипов платёжных систем
    public void paymentLogosTest() {
        WebElement masterCard = driver.findElement(By.xpath("//img[@class='ng-tns-c61-0 ng-star-inserted'][1]"));
        WebElement visa = driver.findElement(By.xpath("//img[@class='ng-tns-c61-0 ng-star-inserted'][2]"));
        WebElement belCard = driver.findElement(By.xpath("//img[@class='ng-tns-c61-0 ng-star-inserted'][3]"));
        WebElement mir = driver.findElement(By.xpath("//img[@class='ng-tns-c61-0 ng-trigger ng-trigger-randomCardState ng-star-inserted'][1]"));

        String expectedMasterCard = "https://checkout.bepaid.by/widget_v2/assets/images/payment-icons/card-types/mastercard-system.svg";
        String expectedVisa = "https://checkout.bepaid.by/widget_v2/assets/images/payment-icons/card-types/visa-system.svg";
        String expectedBelCard = "https://checkout.bepaid.by/widget_v2/assets/images/payment-icons/card-types/belkart-system.svg";
        String expectedMir = "https://checkout.bepaid.by/widget_v2/assets/images/payment-icons/card-types/mir-system-ru.svg";

        Assertions.assertAll(
                () -> Assertions.assertEquals(expectedMasterCard, masterCard.getAttribute("src")),
                () -> Assertions.assertEquals(expectedVisa, visa.getAttribute("src")),
                () -> Assertions.assertEquals(expectedBelCard, belCard.getAttribute("src")),
                () -> Assertions.assertEquals(expectedMir, mir.getAttribute("src")));
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}