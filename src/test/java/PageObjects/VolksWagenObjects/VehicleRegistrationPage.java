package PageObjects.VolksWagenObjects;

import ComponentHelpers.GenericHelper;
import ComponentHelpers.TextBoxHelper;
import ScreenCapture.ExecuteScreenCapture;
import Utils.ObjectRepository;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class VehicleRegistrationPage
{
    //Elements Overall
    private final By VKW_title =By.xpath("//div[@id = 'header']//img[contains(@title,'Volkswagen Financial Services')]");
    private final By drive_awayInsurance_text = By.xpath("//div[text()='Drive Away Insurance']");
    private final By enter_registration_text = By.xpath("//div[contains(text(),'Please enter')]");
    private final By vehicleReg_input = By.id("vehicleReg");

    private final By find_vehicle_bttn = By.xpath("//button[@class='track-search']//*[contains(text(),'Find vehicle')]/parent::button");
    private final By car_regError = By.xpath("//div[contains(text(),'Please enter a valid car registration')]");
    private final By Sorry_record_mssge = By.xpath("//div[contains(text(),'Sorry record not found')]");

    //Get Results Elements
    //private final By Sorry_record_mssge = By.xpath("//div[contains(text(),'Please enter a valid car registration')]");
    private final By resultFor = By.xpath("//div[contains(text(),'OV12UYY')]");
    private final By reg_Number = By.xpath("//div[contains(text(),'Result for : OV12UYY')]");
    private final By coverStart = By.xpath("//div[contains(text(),'Cover start')]");
    private final By coverEnd = By.xpath("//div[contains(text(),'Cover end')]");


    //field objects to use

    public boolean Title_present;
    public boolean IsInput_present;

    private boolean user_RegFound;
    private boolean cover_start_Found;
    private boolean cover_end_Found;
    private boolean RNotFound;
    private boolean ResultForFound;
    private boolean NonValidRegMssge;


    //Actions
    public boolean Confirm_title(String DAInsurance)
    {

        Title_present = GenericHelper.IsElementPresent(VKW_title);

        if (Title_present)
        {
            if (GenericHelper.IsElementPresent(drive_awayInsurance_text))
            {
                System.out.println(DAInsurance + " :is displayed");
                GenericHelper.IsElementPresent(enter_registration_text);
            }else {
                System.out.println(DAInsurance + " :not displayed");

            }

        }
        return false;
    }
    public void clickFindVehicle()
    {
        TextBoxHelper.ClickBttn(find_vehicle_bttn);
    }

    public void Seconds_ResultFor (String RFor) throws IOException {

 ObjectRepository.Driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS); //checks for PageLoad within 3 seconds
        ResultForFound = GenericHelper.IsElementPresent(resultFor);
        RNotFound=GenericHelper.IsElementPresent(Sorry_record_mssge);
       NonValidRegMssge =GenericHelper.IsElementPresent(car_regError);



        if(ResultForFound)
        {
            Assert.assertTrue(true);
        }else if(RNotFound ||NonValidRegMssge )
        {
            System.out.println("displaying....: " + RFor);
            ExecuteScreenCapture.TakeScreenShot("screenshot");
            Assert.fail();
        }
    }



    public void regFound(String CarRegNum)
    {
        user_RegFound = GenericHelper.IsElementPresent(reg_Number);

        if (user_RegFound)
        {
            System.out.println("Reg number displayed is: " + CarRegNum);
        }
    }

    public void searchRegNumber(String reg) throws InterruptedException
    {
        IsInput_present = GenericHelper.IsElementPresent(vehicleReg_input);

        if (IsInput_present)
        {
            TextBoxHelper.ClearTextBox(vehicleReg_input);
            Thread.sleep(2000);
            TextBoxHelper.TypeInTextBox(vehicleReg_input,reg);
        }
    }

public void Start_End_Dates (String cover_start, String cover_end)
{
   System.out.println("Searching for Cover start date...");
   cover_start_Found = GenericHelper.IsElementPresent(coverStart);

    if (cover_start_Found)
    {
        System.out.println("Cover start Date: " + cover_start);
        System.out.println("Searching for Cover end date...");

        cover_end_Found = GenericHelper.IsElementPresent(coverEnd);

        System.out.println("Cover end Date: " + cover_end);
    }
}

}

