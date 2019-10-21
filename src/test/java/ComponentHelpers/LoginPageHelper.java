package ComponentHelpers;

import org.openqa.selenium.NoSuchElementException;

import static Utils.DriverFactory.configProperties;

public class LoginPageHelper
{
    //Actions

    public static void NavigateToLogin() {
        try {
            System.out.println("navigating to URL...");
            NavigationHelper.NavigateToUrl(configProperties.getPropertyValue("url"));
            System.out.println("Page login successful");
        } catch (NoSuchElementException el) {
            System.out.println(("No element found"));
        }
    }

}
