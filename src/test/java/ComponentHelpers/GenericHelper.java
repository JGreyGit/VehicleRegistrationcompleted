package ComponentHelpers;

import Utils.ObjectRepository;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;


public class GenericHelper
{

    public static boolean IsElementPresent(By Locator)
    {
       try
       {
           return ObjectRepository.Driver.findElements(Locator).size() == 1;
       }
        catch (Exception e)
        {
            return false;

        }
    }

    public static WebElement GetElement(By Locator)
    {
        if (IsElementPresent(Locator))
            return ObjectRepository.Driver.findElement(Locator);
        else
        {
            throw new NoSuchElementException("Element Not Found : " + Locator.toString());

        }

    }

}
