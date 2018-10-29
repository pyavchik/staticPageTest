import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.trueautomation.client.driver.TrueAutomationDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static io.trueautomation.client.TrueAutomationHelper.ta;


public class TaSelectClassTest {
    private WebDriver driver;

    private By selectClassExampleBMW = By.xpath(ta("selectClassExampleBMW", ".//select[@id='carselect']/option[1]"));
    private By selectClassExampleBenz = By.xpath(ta("selectClassExampleBenz", ".//select[@id='carselect']/option[2]"));
    private By selectClassExampleHonda = By.xpath(ta("selectClassExampleHonda", ".//select[@id='carselect']/option[3]"));


    @BeforeTest
    public void beforeTest() {
        driver = new TrueAutomationDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Test
    public void selectClassExampleTest() {
        driver.get("https://learn.letskodeit.com/p/practice");
        driver.findElement(selectClassExampleBMW).click();
        driver.findElement(selectClassExampleBenz).click();
        driver.findElement(selectClassExampleHonda).click();
    }

    @AfterTest
    public void afterTest() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }
}