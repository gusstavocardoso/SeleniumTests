package seleniumtraining;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class FieldTraining {

    private WebDriver driver;

    @Before
    public void inicializa(){
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
    }

    @After
    public void finaliza(){
        driver.quit();
    }

    @Test
    public void textField(){
        driver.findElement(By.id("elementosForm:nome")).sendKeys("Preenchendo o campo");
        Assert.assertEquals("Preenchendo o campo", driver.findElement(By.id("elementosForm:nome")).getAttribute("value"));
    }

    @Test
    public void textArea(){
        driver.findElement(By.id("elementosForm:sugestoes")).sendKeys("Area \n Area");
        Assert.assertEquals("Area \n Area", driver.findElement(By.id("elementosForm:sugestoes")).getAttribute("value"));
    }

    @Test
    public void radioButton(){
        driver.findElement(By.id("elementosForm:sexo:0")).click();
        Assert.assertTrue( driver.findElement(By.id("elementosForm:sexo:0")).isSelected());
    }

    @Test
    public void checkBox(){
        driver.findElement(By.id("elementosForm:comidaFavorita:2")).click();
        Assert.assertTrue( driver.findElement(By.id("elementosForm:comidaFavorita:2")).isSelected());
    }

    @Test
    public void dropDown(){
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
    }

    @Test
    public void dropDownMultiplo(){
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
    }

    @Test
    public void clickButton(){
        WebElement botao = driver.findElement(By.id("buttonSimple"));
        botao.click();

        Assert.assertEquals("Obrigado!", botao.getAttribute("value"));
    }

    @Test
    public void linkText(){
        driver.findElement(By.linkText("Voltar")).click();
        Assert.assertEquals("Voltou!", driver.findElement(By.id("resultado")).getText());
    }

    @Test
    public void tagName(){
//        driver.findElement(By.tagName("body")).getText().contains("Campo de Treinamento");
        Assert.assertEquals("Campo de Treinamento",
                driver.findElement(By.tagName("h3")).getText());
        Assert.assertEquals("Cuidado onde clica, muitas armadilhas...",
                driver.findElement(By.className("facilAchar")).getText());
    }
}
