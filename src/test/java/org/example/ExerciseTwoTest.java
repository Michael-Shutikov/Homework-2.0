package org.example;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


@Owner("Михаил")
@DisplayName("Задание №2")
public class ExerciseTwoTest extends Main {

    @BeforeEach
    public void setUp() {
        openBrowserAndFindPaySection();
        fillOutThePaySection();
    }

    @Test
    @DisplayName("Тест корректного отображения введённой суммы для пополнения")
    public void priceTest() {
        WebElement price = driver.findElement(By.xpath("//div[@class='pay-description__cost']/span"));

        String expectedPrice = "50.00 BYN";
        Assertions.assertEquals(expectedPrice, price.getAttribute("textContent"));
    }

    @Test
    @DisplayName("Тест корректного отображения введённого номера телефона для пополнеия")
    public void phoneNumberTest() {
        WebElement phoneNumber = driver.findElement(By.xpath("//div[@class='pay-description__text']/span"));

        String expectedPhoneNumber = "Оплата: Услуги связи\n" + "Номер:375297777777";
        Assertions.assertEquals(expectedPhoneNumber, phoneNumber.getAttribute("textContent"));
    }

    @Test
    @DisplayName("Тест подсказывающего текста в поле ввода номера карты")
    public void cardNumberTest() {
        WebElement cardNumber = driver.findElement(By.xpath("//label[@class='ng-tns-c46-1 ng-star-inserted']"));

        String expectedCardNumber = "Номер карты";
        Assertions.assertEquals(expectedCardNumber, cardNumber.getAttribute("textContent"));
    }

    @Test
    @DisplayName("Тест подсказывающего текста в поле ввода срока действия карты")
    public void expiryDateTest() {
        WebElement expiryDate = driver.findElement(By.xpath("//label[@class='ng-tns-c46-4 ng-star-inserted']"));

        String expectedExpiryDate= "Срок действия";
        Assertions.assertEquals(expectedExpiryDate, expiryDate.getAttribute("textContent"));
    }

    @Test
    @DisplayName("Тест подсказывающего текста в поле ввода CVC кода карты")
    public void CvcTest() {
        WebElement cvc = driver.findElement(By.xpath("//label[@class='ng-tns-c46-5 ng-star-inserted']"));

        String expectedCvc = "CVC";
        Assertions.assertEquals(expectedCvc, cvc.getAttribute("textContent"));
    }

    @Test
    @DisplayName("Тест подсказывающего текста в поле ввода имени держателя карты")
    public void nameTest() {
        WebElement name = driver.findElement(By.xpath("//label[@class='ng-tns-c46-3 ng-star-inserted']"));

        String expectedName = "Имя держателя (как на карте)";
        Assertions.assertEquals(expectedName, name.getAttribute("textContent"));
    }

    @Test
    @DisplayName("Тест корректного отображение введённой суммы на кнопке оплатить")
    public void inscriptionOnThePayButtonTest() {
        WebElement payButton = driver.findElement(By.xpath("//button[@class='colored disabled']"));

        String expectedPayButton = " Оплатить  50.00 BYN ";
        Assertions.assertEquals(expectedPayButton, payButton.getAttribute("textContent"));
    }

    @Test
    @DisplayName("Тест наличия логотипов платёжных систем")
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