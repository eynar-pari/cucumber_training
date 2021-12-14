package runner;

import helpers.ReadProperties;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import singletonSession.Session;

import java.io.IOException;

import static helpers.ReadProperties.host;

@RunWith(Cucumber.class)
public class Runner {
    // Hooks ---> acciones antes y despues de cada scenario
    @Before
    public void setupScenario() throws IOException {
        System.out.println("hook setup");
        new ReadProperties().getProperties();
        Session.getInstance().getDriver().get(host);
    }

    @After
    public void cleanupScenario(Scenario scenario){
        if( scenario.isFailed()){
            byte[] screenShot = ((TakesScreenshot) Session.getInstance().getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot,"image/png","Failed Image");
        }
        Session.getInstance().closeSession();

    }



}
