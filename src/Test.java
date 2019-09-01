import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Test {

    protected static WebDriver driver;


    public static void main(String[]args) {


        System.setProperty("webdriver.chrome.driver", "src\\BrowserDriver\\chromedriver.exe");

        //open the browser
        driver = new ChromeDriver();

        //maximise the browser window screen
        driver.manage().window().fullscreen();

        //set implicity wait for the driver object
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        //open the website
        driver.get("http://demo.nopcommerce.com/");

        //open register button
        driver.findElement(By.xpath("//a[@class='ico-register']")).click();

        //enter firstname
        driver.findElement(By.id("FirstName")).sendKeys("Venus");

        //enter lastname
        driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("patel");



        driver.findElement(By.name("Email")).sendKeys("testtest@gmail.com");

        //driver.close();












    }}