package ComponentHelpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TextBoxHelper
{
    private static WebElement element;

    //Type into a text-box
    public static void TypeInTextBox(By Locator, String text)
    {
        element = GenericHelper.GetElement(Locator);
        element.sendKeys(text);
    }


    //Clearing a text-box
    public static void ClearTextBox(By Locator)
    {
        element = GenericHelper.GetElement(Locator);
        element.clear();
    }


    //Click Bttn
    public static void ClickBttn(By Locator)
    {
        element = GenericHelper.GetElement(Locator);
        element.click();
    }
}
