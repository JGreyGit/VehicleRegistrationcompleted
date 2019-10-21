package ComponentHelpers;

import Utils.ObjectRepository;
import org.openqa.selenium.NoSuchElementException;

public class NavigationHelper
{
    public static void NavigateToUrl(String Url)
    {
        try {
            System.out.println("navigating to URL...");
            ObjectRepository.Driver.navigate().to(Url);
            System.out.println("Page login successful");
        } catch (
                NoSuchElementException el) {
            System.out.println(("No page found"));
        }


    }

}
