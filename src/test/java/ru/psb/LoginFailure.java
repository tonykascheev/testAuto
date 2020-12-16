package ru.psb;

import io.qameta.allure.Step;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

public class LoginFailure extends  WebdriverSettings {
    @Step
    @Test
    public void authFail() {
        driver.get("http://192.168.88.54/auth");
        driver.findElement(By.cssSelector(".elib-auth-form__form-input:nth-child(2)")).click();
        driver.findElement(By.cssSelector(".elib-auth-form__form-input:nth-child(2)")).sendKeys("admin");
        driver.findElement(By.cssSelector(".elib-auth-form__form-input:nth-child(3)")).click();
        driver.findElement(By.cssSelector(".elib-auth-form__form-input:nth-child(3)")).sendKeys("Q1w2e3r4");
        driver.findElement(By.cssSelector(".elib-auth-form__submit-button")).click();
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".elib-notifier__message")));
        WebElement element = driver.findElement(By.cssSelector(".elib-notifier__message"));
        assertEquals(element.getText(), "Неправильно введен логин или пароль");

    }
}
