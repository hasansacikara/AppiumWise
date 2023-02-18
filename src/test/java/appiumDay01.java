import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class appiumDay01 {

    @Test
    public void app() {

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("platformVersion", "11.0");
        desiredCapabilities.setCapability("deviceName", "PIXEL");
        desiredCapabilities.setCapability("automationName", "UiAutomator2");
        desiredCapabilities.setCapability("app", "C:\\Users\\DELL\\IdeaProjects\\AppiumWise\\src\\Apps\\Calculator_8.3 (477856174)_Apkpure.apk");
    }
}