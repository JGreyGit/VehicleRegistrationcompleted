package ScreenCapture;

import Utils.ObjectRepository;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExecuteScreenCapture {

    public static  void TakeScreenShot(String screenshotName) throws IOException {

        SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyHHmmss");
        Date date = new Date();
        String screenshotNameFormat = screenshotName + " " + formatter.format(date);

        File screenshot  = ((TakesScreenshot)ObjectRepository.Driver).getScreenshotAs(OutputType.FILE);

      FileHandler.copy(screenshot,new File("C:\\Users\\JoeObasogie\\IdeaProjects\\VehicleRegistration\\src\\main\\java\\Screenshots\\FailedAutomation" +screenshotNameFormat+".png"));

    }

}
