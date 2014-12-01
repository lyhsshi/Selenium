package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author Aline Salla
 */
public class Aline_twitter {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.twitter.com/");
        
        //login
        WebElement email = driver.findElement(By.id("signin-email"));
        email.sendKeys("hk_lyh");
        WebElement senha = driver.findElement(By.id("signin-password"));
        senha.sendKeys("xxxxxxx");
        senha.submit();
        
        //aguarda página carregar e manda tweet
        Thread.sleep(5000);
        WebElement msg = driver.findElement(By.id("tweet-box-mini-home-profile"));
        msg.sendKeys("Hey!! :D");
        driver.findElement(By.cssSelector("div[class='tweet-button']")).click();
    }
}