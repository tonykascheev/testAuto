package ru.psb;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverSettings {
    public ChromeDriver driver;
    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Documents\\chromedriver_win32 (1)\\chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("Test started");
        driver.get("http://192.168.88.54/auth");
        driver.findElement(By.cssSelector(".elib-auth-form__form-input:nth-child(2)")).click();
        driver.findElement(By.cssSelector(".elib-auth-form__form-input:nth-child(2)")).sendKeys("admin_elib");
        driver.findElement(By.cssSelector(".elib-auth-form__form-input:nth-child(3)")).click();
        driver.findElement(By.cssSelector(".elib-auth-form__form-input:nth-child(3)")).sendKeys("Q1w2e3r4");
        driver.findElement(By.cssSelector(".elib-auth-form__submit-button")).click();
    }
}
