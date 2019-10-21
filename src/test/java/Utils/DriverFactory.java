package Utils;

import ComponentHelpers.NavigationHelper;
import Constants.Volkswagen_Constants;
import ScreenCapture.ExecuteScreenCapture;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

    public class DriverFactory extends Volkswagen_Constants {


    public static ReadProperties configProperties = new ReadProperties("C:\\Users\\JoeObasogie\\IdeaProjects\\VehicleRegistration\\src\\test\\Resources\\config\\config.properties");

    public static void initializeDriver() throws IOException {


        String browser = configProperties.getPropertyValue("browser_chrome_prop");
        String browserfx = configProperties.getPropertyValue("browser_firefox_prop");
        String geckoDriverPath = configProperties.getPropertyValue("gecko_driver_path");
        String chromeDriverPath = configProperties.getPropertyValue("chrome_driver_path");
        String url = configProperties.getPropertyValue("url");

        System.out.println("done with configuration in Driver page");

        System.out.println("browser:" + browser);


        if (browser.equalsIgnoreCase(browser_firefox)) {
//            System.setProperty(webdriver_gecko_driver, geckoDriverPath); ( Not needed as DriverManager - Bonigarcia manages drivers)
            WebDriverManager.firefoxdriver( ).setup( ); //(Bonigarcia method)
            ObjectRepository.Driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase(browser_chrome)) {
            //   System.setProperty(webdriver_chrome_driver, chromeDriverPath); ( Not needed as DriverManager - Bonigarcia manages drivers. )
            WebDriverManager.chromedriver().setup(); //(Bonigarcia method)
            ObjectRepository.Driver = new ChromeDriver();
        } else {
            System.out.println("Setup complete");
            ExecuteScreenCapture.TakeScreenShot("screenshot");

        }

        System.out.println("Setup complete");

        ObjectRepository.Driver.manage().window().maximize();
        ObjectRepository.Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        NavigationHelper.NavigateToUrl(configProperties.getPropertyValue("url"));
        System.out.println("Url is: " + url);



    }
}

