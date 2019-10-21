package ComponentHelpers;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class LinkTextHelper
{
    private static WebElement element;

    public static void ClickLink(By Locator) {
        try {
            element = GenericHelper.GetElement(Locator);
            element.click();
        } catch (NoSuchElementException el) {
            System.out.println(("No element found"));
        }


    }

}
