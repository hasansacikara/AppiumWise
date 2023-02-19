import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;


public class appiumDay01 {

    @Test
    public void app() throws InterruptedException, MalformedURLException {


        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("platformVersion", "11.0");
        desiredCapabilities.setCapability("deviceName", "PIXEL");
        desiredCapabilities.setCapability("automationName", "UiAutomator2");
        desiredCapabilities.setCapability("app","C:\\Users\\DELL\\IdeaProjects\\AppiumWise\\src\\Apps\\Calculator_8.3 (477856174)_Apkpure.apk\");");
        desiredCapabilities.setCapability("app", "CC:\\Users\\DELL\\IdeaProjects\\AppiumWise\\src\\Apps\\Calculator_8.3 (477856174)_Apkpure.apk");
        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http:localhost:4723/wd/hub"), desiredCapabilities);


        //id kullanilarak yapildi
        //9 tusuna tiklandi
        driver.findElementById("com.google.android.calculator:id/digit_9").click();
        Thread.sleep(3000);
        //carpi isaretine tiklandi
        driver.findElementById("com.google.android.calculator:id/op_mul").click();
        Thread.sleep(3000);
        //5 tusuna tiklandi
        driver.findElementById("com.google.android.calculator:id/digit_5").click();
    }
}
