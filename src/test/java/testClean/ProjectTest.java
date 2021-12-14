package testClean;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.*;

import java.util.Date;

import static helpers.ReadProperties.pwd;
import static helpers.ReadProperties.user;


public class ProjectTest {
    MainPage mainPage = new MainPage();
    LoginModal loginModal= new LoginModal();
    LeftSide leftSide= new LeftSide();
    CentralSide centralSide= new CentralSide();

    @Test
    @DisplayName("Verify Create Project")
    public void verifyCreateProject() throws InterruptedException {
        String name= String.valueOf(new Date().getTime());
        mainPage.loginImage.click();
        loginModal.login(user,pwd);
        leftSide.addNewProjectButton.click();
        leftSide.nameProjectTxtBox.setText(name);
        leftSide.addButton.click();
        centralSide.projectSelectedLabel.waitControlValueElement(name);
        String expectedResult=name;
        String actualResult=centralSide.projectSelectedLabel.getTextControl();
        Assertions.assertEquals(expectedResult,actualResult,"ERROR! project was not created");
    }
}
