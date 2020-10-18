package saucedemoproject;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

    WebDriver driver;

    @Before
    public void startTest(){
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.navigate().to("https://www.saucedemo.com/");
        driver.manage().window().maximize();
    }

    @After
    public void endTest(){
        driver.quit();
    }

    @Test
    public void deveComprarProdutos(){
        PageObjects page = new PageObjects(driver);
        page.loginPage("standard_user", "secret_sauce");

        WebElement[] produtos = {
                driver.findElement(new By.ByCssSelector
                        ("#inventory_container > div > div:nth-child(1) > div.pricebar > button")),
                driver.findElement(new By.ByCssSelector
                        ("#inventory_container > div > div:nth-child(2) > div.pricebar > button")),
                driver.findElement(new By.ByCssSelector
                        ("#inventory_container > div > div:nth-child(3) > div.pricebar > button")),
                driver.findElement(new By.ByCssSelector
                        ("#inventory_container > div > div:nth-child(4) > div.pricebar > button")),
                driver.findElement(new By.ByCssSelector
                        ("#inventory_container > div > div:nth-child(5) > div.pricebar > button")),
                driver.findElement(new By.ByCssSelector
                        ("#inventory_container > div > div:nth-child(6) > div.pricebar > button"))
        };
        for (WebElement produto: produtos) {
            produto.click();
        }

        WebElement contador = driver.findElement(By.className("shopping_cart_badge"));
        Assert.assertEquals("6", contador.getText());

        driver.findElement(By.className("fa-shopping-cart")).click();

        driver.findElement(By.className("checkout_button")).click();

        page.checkoutPage("Selenium", "Webdriver", "12345678");

        WebElement resumo = driver.findElement(By.className("subheader"));
        Assert.assertEquals("Checkout: Overview", resumo.getText());

        driver.findElement(By.className("btn_action")).click();

        WebElement confirmacao = driver.findElement(By.className("complete-header"));
        Assert.assertEquals("THANK YOU FOR YOUR ORDER", confirmacao.getText());
    }
}
