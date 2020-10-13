package cursoSelenium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class CampoTreinamento {
    @Test
    public void textField(){
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");

        driver.findElement(By.id("elementosForm:nome")).sendKeys("Preenchendo o campo");
        Assert.assertEquals("Preenchendo o campo", driver.findElement(By.id("elementosForm:nome")).getAttribute("value"));

        driver.quit();
    }

    @Test
    public void textArea(){
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");

        driver.findElement(By.id("elementosForm:sugestoes")).sendKeys("Area \n Area");
        Assert.assertEquals("Area \n Area", driver.findElement(By.id("elementosForm:sugestoes")).getAttribute("value"));

        driver.quit();
    }

    @Test
    public void radioButton(){
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");

        driver.findElement(By.id("elementosForm:sexo:0")).click();
        Assert.assertTrue( driver.findElement(By.id("elementosForm:sexo:0")).isSelected());

        driver.quit();
    }

    @Test
    public void checkBox(){
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");

        driver.findElement(By.id("elementosForm:comidaFavorita:2")).click();
        Assert.assertTrue( driver.findElement(By.id("elementosForm:comidaFavorita:2")).isSelected());

        driver.quit();
    }

    @Test
    public void dropDown(){
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");

        WebElement element = driver.findElement(By.id("elementosForm:escolaridade"));
        Select combo = new Select(element);
        List<WebElement> options = combo.getOptions();
        Assert.assertEquals(8, options.size());

        boolean encontrou = false;
        for(WebElement option: options){
            if(option.getText().equals("Mestrado")){
                encontrou = true;
                break;
            }
        }
        Assert.assertTrue(encontrou);

        driver.quit();
    }

    @Test
    public void dropDownMultiplo(){
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");

        WebElement element = driver.findElement(By.id("elementosForm:esportes"));
        Select combo = new Select(element);

        combo.selectByVisibleText("Natacao");
        combo.selectByVisibleText("Corrida");
        combo.selectByVisibleText("O que eh esporte?");

        List<WebElement>allSelectesOptions = combo.getAllSelectedOptions();
        Assert.assertEquals(3,allSelectesOptions.size());

        combo.deselectByVisibleText("Corrida");
        allSelectesOptions = combo.getAllSelectedOptions();
        Assert.assertEquals(2, allSelectesOptions.size());

        driver.quit();
    }

    @Test
    public void clickButton(){
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");

        WebElement botao = driver.findElement(By.id("buttonSimple"));
        botao.click();

        Assert.assertEquals("Obrigado!", botao.getAttribute("value"));
        driver.quit();
    }

}
