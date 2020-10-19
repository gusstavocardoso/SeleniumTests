package saucedemoautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageObjects {

    WebDriver driver;

    public PageObjects(WebDriver driver) {
        this.driver = driver;
    }

    public void loginPage(String nome, String senha){
        driver.findElement(By.id("user-name")).sendKeys(nome);
        driver.findElement(By.id("password")).sendKeys(senha);

        driver.findElement(By.id("login-button")).click();
    }

    public void checkoutPage(String nome, String sobrenome, String cep){
        driver.findElement(By.id("first-name")).sendKeys(nome);
        driver.findElement(By.id("last-name")).sendKeys(sobrenome);
        driver.findElement(By.id("postal-code")).sendKeys(cep);

        driver.findElement(By.className("cart_button")).click();
    }
}
