package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Patricia_Face {
    
    
    public static void main(String[] args) throws InterruptedException {
        
        // abre o firefox
        WebDriver driver = new FirefoxDriver();
        
        //acessa o site do facebook
        driver.get("http://www.facebook.com.br/");

        //Coloca o email do login
        WebElement campoDeTexto = driver.findElement(By.id("email"));
        campoDeTexto.sendKeys("pati.kulkamp@hotmail.com");
        
        //Coloca a senha do login
        WebElement campoDeTexto2 = driver.findElement(By.id("pass"));
        campoDeTexto2.sendKeys("xxxx");
         
        driver.findElement(By.id("u_0_l")).click();    
        
          Thread.sleep(10000);
        
         //escreve no Teste de Selenium          
        WebElement campoTexto4 = driver.findElement(By.id("u_0_w"));
        campoTexto4.sendKeys("Teste de Selenium 3");
        campoTexto4.submit();
        
    }
    
}


