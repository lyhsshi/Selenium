package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author Aline
 */
public class Selenium {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //abre firefox
        WebDriver driver = new FirefoxDriver();
        
        //acessa um site
        driver.get("http://google.com.br");
        
        //digita no campo com o a pesquisa
        WebElement campoDeTexto = driver.findElement(By.name("q"));
        campoDeTexto.sendKeys("UNIDAVI");
        
        //submete form
        campoDeTexto.submit();
    }
}