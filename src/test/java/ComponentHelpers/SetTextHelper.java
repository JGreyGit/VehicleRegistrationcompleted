package ComponentHelpers;

import Utils.ObjectRepository;
import org.openqa.selenium.By;

public class SetTextHelper
{

    //Enter Text

    public static void EnterText(String element, String value, String elementtype)
    {
        if (elementtype == "Id")
            ObjectRepository.Driver.findElement(By.id(element)).sendKeys(value);
        if (elementtype == "Name")
            ObjectRepository.Driver.findElement(By.name(element)).sendKeys(value);
        if (elementtype == "CssSelector")
            ObjectRepository.Driver.findElement(By.cssSelector(element)).sendKeys(value);
        if (elementtype == "LinkText")
            ObjectRepository.Driver.findElement(By.linkText(element)).sendKeys(value);
        if (elementtype == "ClassName")
            ObjectRepository.Driver.findElement(By.className(element)).sendKeys(value);
        if (elementtype == "XPath")
            ObjectRepository.Driver.findElement(By.xpath(element)).sendKeys(value);

    }

    //click into button , Checkbox, option etc

    public static void click(String element, String elementtype)
    {
        if (elementtype == "Id")
            ObjectRepository.Driver.findElement(By.id(element)).click();
        if (elementtype == "Name")
            ObjectRepository.Driver.findElement(By.name(element)).click();
        if (elementtype == "CssSelector")
            ObjectRepository.Driver.findElement(By.cssSelector(element)).click();
        if (elementtype == "LinkText")
            ObjectRepository.Driver.findElement(By.linkText(element)).click();
        if (elementtype == "ClassName")
            ObjectRepository.Driver.findElement(By.className(element)).click();
        if (elementtype == "XPath")
            ObjectRepository.Driver.findElement(By.xpath(element)).click();

    }

}

