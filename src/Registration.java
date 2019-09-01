import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration {

    protected static WebDriver driver;


    public static void main(String[]args){


      System.setProperty("webdriver.chrome.driver","src\\BrowserDriver\\chromedriver.exe");

      driver = new ChromeDriver();


      driver.manage().window().fullscreen();

       driver.get("http://demo.nopcommerce.com/");

       driver.findElement(By.linkText("Register")).click();

       driver.findElement(By.id("FirstName")).sendKeys("Bhavya");

       driver.findElement(By.id("LastName")).sendKeys("Panchmatiya");

       driver.findElement(By.xpath("//input[@data-val-email = 'Wrong email']")).sendKeys("Bhavya1985@gmail.com");

       driver.findElement(By.xpath("//input[@data-val-regex-pattern = '^.{6,}$']")).sendKeys("Liverpool");

       driver.findElement(By.xpath("//input[@data-val-equalto = 'The password and confirmation password do not match.']")).sendKeys("Liverpool");

       driver.findElement(By.xpath("//input[@id = 'register-button']")).click();

       //driver.close();












    }

}
