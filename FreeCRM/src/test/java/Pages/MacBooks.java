package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class MacBooks {
    public static void macBooks(WebDriver driver)throws InterruptedException{
        System.out.println("You are in MacBooks Page");
        Actions aa = new Actions(driver);
        aa.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu-item-33\"]/a"))).build().perform();
        Thread.sleep(2000);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//*[@id=\"menu-item-34\"]/a")).click();

    }
}
