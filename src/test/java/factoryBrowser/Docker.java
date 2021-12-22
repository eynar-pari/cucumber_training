package factoryBrowser;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Docker implements IBrowser{
    @Override
    public WebDriver create() {
        Capabilities chromeCapabilities = new DesiredCapabilities();
        RemoteWebDriver browser = null;
        try {
            browser = new RemoteWebDriver(new URL("http://selenium-hub:4444/wd/hub"), chromeCapabilities);
            browser.manage().window().setSize(new Dimension(2100,1200));
            browser.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("FAILED!! - The selenium grid driver can not be created,"+e.getMessage());
        }
        return browser;
    }
}
