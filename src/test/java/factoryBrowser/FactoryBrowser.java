package factoryBrowser;

import io.cucumber.java.eo.Do;

public class FactoryBrowser {

    public static IBrowser make(String browserType){
        IBrowser browser;
        switch (browserType.toLowerCase()){
            case "chrome":
                browser= new Chrome();
                break;
            case "firefox":
                browser = new Firefox();
                break;
            case "edge":
                browser = new Edge();
                break;
            case "cloud":
               browser = new ChromeCloud();
               break;
            case "docker":
                browser = new Docker();
                break;
            default:
                browser= new Chrome();
                break;
        }
        return browser;
    }

}
