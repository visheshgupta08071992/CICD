import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestClass1 {

    WebDriver driver;

    @BeforeMethod
    public void launchDriver(){
        WebDriverManager.chromedriver().setup();
         driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().fullscreen();
    }

    @Test
    public void test1(){
        driver.get("https://automationtalks.com/");
        System.out.println("Title of the Page is" + driver.getTitle());
    }

    @Test
    public void test2(){
        driver.navigate().to("https://automationtalks.com/");
        System.out.println("Title of the Page is" + driver.getTitle());
    }

    @Test
    public void test3(){
        driver.navigate().to("https://automationtalks.com/");
        System.out.println("Title of the Page is" + driver.getTitle());
    }

    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }
}
