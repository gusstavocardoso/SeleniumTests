package saucedemoautomation;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestCompras extends BaseTest {

    @Test
    public void deveComprarProdutos(){
        POM page = new POM(driver);
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

        page.cartPage();

        page.checkoutPage("Selenium", "Webdriver", "12345678");

        WebElement resumo = driver.findElement(By.className("subheader"));
        Assert.assertEquals("Checkout: Overview", resumo.getText());

        WebElement finaliza = driver.findElement(By.className("btn_action"));
        finaliza.click();

        WebElement confirmacao = driver.findElement(By.className("complete-header"));
        Assert.assertEquals("THANK YOU FOR YOUR ORDER", confirmacao.getText());
    }
}
