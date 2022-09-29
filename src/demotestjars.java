import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class demotestjars {

    public static void main(String[] args) throws InterruptedException {

        // declaration and instantiation of objects/variables
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Launch
        driver.navigate().to("http://www.google.com/");

        // Click on the search text box and send value
        driver.findElement(By.name("q")).sendKeys("javatpoint tutorials");

        // Click on the search button
        driver.findElement(By.className("gNO89b")).click();
        Thread.sleep(3000);
    }

}


