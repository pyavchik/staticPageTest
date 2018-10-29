package taLocator;

import io.trueautomation.client.driver.TrueAutomationDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static io.trueautomation.client.TrueAutomationHelper.ta;

public class TaCheckBoxTest {
    private WebDriver driver;

    private By checkBoxExampleBMW = By.id(ta("checkBoxExampleBMW", "bmwcheck"));
    private By checkBoxExampleBenz = By.id(ta("checkBoxExampleBenz", "benzcheck"));
    private By checkBoxExampleHonda = By.id(ta("checkBoxExampleHonda", "hondacheck"));


    @BeforeTest
    public void beforeTest() {
        driver = new TrueAutomationDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }


    @Test
    public void radioButtonExampleTest() throws InterruptedException {
        driver.get("https://learn.letskodeit.com/p/practice");
        //Thread.sleep(1000);
        driver.findElement(checkBoxExampleBMW).click();
        //Thread.sleep(1000);
        driver.findElement(checkBoxExampleBenz).click();
        //Thread.sleep(1000);
        driver.findElement(checkBoxExampleHonda).click();
    }

    @AfterTest
    public void afterTest() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}