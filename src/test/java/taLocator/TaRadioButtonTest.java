package taLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.trueautomation.client.driver.TrueAutomationDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static io.trueautomation.client.TrueAutomationHelper.ta;

public class TaRadioButtonTest {
    private WebDriver driver;

    private By radioButtonExampleBMW = By.xpath(ta("radioButtonExampleBMW", ".//input[@id='bmwradio']"));
    private By radioButtonExampleBenz = By.xpath(ta("radioButtonExampleBenz", ".//input[@id='benzradio']"));
    private By radioButtonExampleHonda = By.xpath(ta("radioButtonExampleHonda", ".//input[@id='hondaradio']"));


    @BeforeTest
    public void beforeTest() {
        driver = new TrueAutomationDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }


    @Test
    public void radioButtonExampleTest() throws InterruptedException {
        driver.get("https://learn.letskodeit.com/p/practice");
        //Thread.sleep(1000);
        driver.findElement(radioButtonExampleBMW).click();
        //Thread.sleep(1000);
        driver.findElement(radioButtonExampleBenz).click();
        //Thread.sleep(1000);
        driver.findElement(radioButtonExampleHonda).click();
    }

    @AfterTest
    public void afterTest() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}