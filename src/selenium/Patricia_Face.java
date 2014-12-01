package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Patricia_Face {
    
    
    public static void main(String[] args) throws InterruptedException {
        
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.facebook.com.br/");

        WebElement campoDeTexto = driver.findElement(By.id("email"));
        campoDeTexto.sendKeys("pati.kulkamp@hotmail.com");
        
        WebElement campoDeTexto2 = driver.findElement(By.id("pass"));
        campoDeTexto2.sendKeys("84976005");
         
        driver.findElement(By.id("u_0_l")).click();    
        
        
        
        
        WebElement campoTexto4 = driver.findElement(By.id("u_0_w"));
        campoTexto4.sendKeys("Teste de Selenium");
        campoTexto4.submit();
        
    }
    
}


