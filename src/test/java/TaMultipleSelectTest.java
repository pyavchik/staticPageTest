import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.trueautomation.client.driver.TrueAutomationDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static io.trueautomation.client.TrueAutomationHelper.ta;

public class TaMultipleSelectTest {
    private WebDriver driver;

    private By selectExampleApple = By.xpath(ta("selectExampleApple", ".//option[@value='apple']"));
    private By selectExampleOrange = By.xpath(ta("selectExampleOrange", ".//option[@value='orange']"));
    private By selectExamplePeach = By.xpath(ta("selectExamplePeach", ".//option[@value='peach']"));


    @BeforeTest
    public void beforeTest() {
        driver = new TrueAutomationDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }


    @Test
    public void radioButtonExampleTest() {
        driver.get("https://learn.letskodeit.com/p/practice");
        driver.findElement(selectExampleApple).click();
        driver.findElement(selectExampleOrange).click();
        driver.findElement(selectExamplePeach).click();
    }

    @AfterTest
    public void afterTest() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }
}