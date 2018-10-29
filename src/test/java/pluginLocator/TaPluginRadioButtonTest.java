package pluginLocator;

import io.trueautomation.client.driver.TrueAutomationDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static io.trueautomation.client.TrueAutomationHelper.byTa;
import static io.trueautomation.client.TrueAutomationHelper.ta;

public class TaPluginRadioButtonTest {
    private WebDriver driver;

    //private By radioButtonExampleBMW = By.xpath(ta("radioButtonExampleBMW", ".//input[@id='bmwradio']"));
    private By radioButtonExampleBMW_taPlugin = byTa("radioButtonExampleBMW_taPlugin");
    //private By radioButtonExampleBenz = By.xpath(ta("radioButtonExampleBenz", ".//input[@id='benzradio']"));
    private By radioButtonExampleBenz_taPlugin = byTa("radioButtonExampleBenz_taPlugin");
    //private By radioButtonExampleHonda = By.xpath(ta("radioButtonExampleHonda", ".//input[@id='hondaradio']"));
    private By radioButtonExampleHonda_taPlugin = byTa("radioButtonExampleHonda_taPlugin");


    @BeforeTest
    public void beforeTest() {
        driver = new TrueAutomationDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }


    @Test
    public void radioButtonExampleTest() throws InterruptedException {
        driver.get("https://learn.letskodeit.com/p/practice");
        //Thread.sleep(1000);
        driver.findElement(radioButtonExampleBMW_taPlugin).click();
        //Thread.sleep(1000);
        driver.findElement(radioButtonExampleBenz_taPlugin).click();
        //Thread.sleep(1000);
        driver.findElement(radioButtonExampleHonda_taPlugin).click();
    }

    @AfterTest
    public void afterTest() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}
