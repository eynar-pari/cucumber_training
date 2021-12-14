package testClean;


import helpers.ReadProperties;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.LoginModal;
import pages.MainPage;
import pages.MenuSection;
import singletonSession.Session;

import java.io.IOException;

import static helpers.ReadProperties.*;

public class LoginTest {
    MainPage mainPage = new MainPage();
    LoginModal loginModal= new LoginModal();
    MenuSection menuSection= new MenuSection();

    @Test
    @DisplayName("Verify Login Todo.ly")
    public void verifyLoginHappyPath() throws IOException {
        new ReadProperties().getProperties();
        Session.getInstance().getDriver().get(host);
        mainPage.loginImage.click();
        loginModal.emailTextBox.setText(user);
        loginModal.passwordTextBox.setText(pwd);
        loginModal.loginButton.click();

        Assertions.assertTrue(menuSection.logoutLink.isDisplayedControl(),
                 "ERROR! the login was failed");
    }

}
