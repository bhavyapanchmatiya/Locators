import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AppleMacBook {

    protected static WebDriver driver;


    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "src\\BrowserDriver\\chromedriver.exe");

        driver = new ChromeDriver();


        driver.manage().window().fullscreen();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("http://demo.nopcommerce.com/");

        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[2]/div/div[2]/h2/a")).click();

        driver.findElement(By.xpath("//div[@class='email-a-friend']")).click();

        driver.findElement(By.className("friend-email")).sendKeys("patel.mitesh20@gmail.com");

        driver.findElement(By.id("YourEmailAddress")).sendKeys("bhavya1985@gmail.com");

        driver.findElement(By.name("PersonalMessage")).sendKeys("Yo...buy me this Laptop Bro !!");

        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[2]/input")).click();

        //driver.close();













    }
}