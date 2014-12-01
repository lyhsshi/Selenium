package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

/**
 *
 * @author Aline
 */
public class Aline {
    
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        String baseUrl = "https://google.com.br/";
        driver.get(baseUrl);
        
        WebElement campoDeTexto = driver.findElement(By.name("q"));
        campoDeTexto.sendKeys("UNIDAVI");
        driver.findElement(By.name("btnG")).click();
        
        driver.findElement(By.cssSelector("div#top_nav")).findElement(By.linkText("Imagens")).click();
        driver.findElement(By.name("PsCyoqsQHKc61M:")).click();
                
        /* botão direito mouse
        Actions acao = new Actions(driver);
        acao.moveToElement(driver.findElement(By.name("PsCyoqsQHKc61M:")));
        
        Actions oAction = new Actions(driver);
        WebElement webElement = driver.findElement(By.name("PsCyoqsQHKc61M:"));
        oAction.moveToElement(webElement);
        oAction.contextClick(webElement).build().perform();  clique direito 

        WebElement elementOpen = driver.findElement(By.name("Salvar imagem como..."));
        elementOpen.click();*/
    }
}