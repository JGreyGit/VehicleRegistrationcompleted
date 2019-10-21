package StepDefinitions;

import Utils.DriverFactory;
import Utils.ObjectRepository;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;


public class Hooks {

@Before
    public void before() throws IOException {
        DriverFactory.initializeDriver();
    }

    @After
    public void after()
    {
      ObjectRepository.Driver.close();
      ObjectRepository.Driver = null;

    }
}
