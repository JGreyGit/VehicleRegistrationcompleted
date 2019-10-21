package ComponentHelpers;

import Utils.ObjectRepository;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

public class GetMethodsHelper
{
    public static String GetText(String element, String elementtype) {
        if (elementtype == "Id")
            return ObjectRepository.Driver.findElement(By.id(element)).getText();
        if (elementtype == "Name")
            return ObjectRepository.Driver.findElement(By.name(element)).getText();
        if (elementtype == "CssSelector")
            return ObjectRepository.Driver.findElement(By.cssSelector(element)).getText();
        if (elementtype == "LinkText")
            return ObjectRepository.Driver.findElement(By.linkText(element)).getText();
        if (elementtype == "ClassName")
            return ObjectRepository.Driver.findElement(By.className(element)).getText();
        if (elementtype == "XPath")
            return ObjectRepository.Driver.findElement(By.xpath(element)).getText();
        else {

            throw new NoSuchElementException("Element Not Found : " + elementtype.isEmpty());
        }
    }
}
