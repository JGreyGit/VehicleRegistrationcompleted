package StepDefinitions;
import ComponentHelpers.LoginPageHelper;
import PageObjects.VolksWagenObjects.VehicleRegistrationPage;
import Utils.ObjectRepository;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.io.IOException;

import static org.openqa.selenium.support.PageFactory.initElements;

public class VehicleRegistrationSearch_StepDef {


  private  VehicleRegistrationPage Vpage;
  private LoginPageHelper hPage;

    @Given("user navigates to VolksWagen URL")
    public void user_navigates_to_VolksWagen_URL() {

        Vpage = initElements(ObjectRepository.Driver, VehicleRegistrationPage.class);
        System.out.println("navigating to VolksWagen URL...");
        hPage = initElements(ObjectRepository.Driver, LoginPageHelper.class);
        System.out.println("initializing Complete & successfully on WebPage");

    }

    @Then("user confirm ([^\"]*) is displayed and input field is present thus enters ([^\"]*)$")
    public void user_confirm_DriveAwayInsurance_is_displayed_and_input_field_is_present_thus_enters_Reg( String DAInsurance, String reg) throws InterruptedException {

        Vpage.Confirm_title(DAInsurance);
          Vpage.searchRegNumber(reg);
          System.out.println("Searched Reg: " + reg);
    }

    @Then("clicks on the “Find vehicle” button")
    public void clicks_on_the_Find_vehicle_button()
    {
        Vpage.clickFindVehicle();
    }

    @Then("([^\"]*) is displayed and the page will display the ([^\"]*) that the user entered")
    public void Result_For_is_displayed_and_the_page_will_display_the_Registration_Number_that_the_user_entered(String RFor, String CarRegNum) throws IOException {
        Vpage.Seconds_ResultFor(RFor);
        Vpage.regFound(CarRegNum);
    }

    @Then("the page will display the correct ([^\"]*) and ([^\"]*)")
    public void the_page_will_display_the_correct_cover_start_and_end_dates(String cover_start_Found, String cover_end_Found)
    {
        Vpage.Start_End_Dates(cover_start_Found,cover_end_Found);
    }
}
