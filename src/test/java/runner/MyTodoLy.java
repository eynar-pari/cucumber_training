package runner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pages.LoginModal;
import pages.MainPage;
import pages.MenuSection;

import java.util.Map;

public class MyTodoLy {
    MainPage mainPage = new MainPage();
    LoginModal loginModal= new LoginModal();
    MenuSection menuSection= new MenuSection();

    @Given("open the todo.ly")
    public void openTheTodoLy() {

    }

    @When("I set my credentials")
    public void iSetMyCredentials(Map<String,String> credentials) {
        mainPage.loginImage.click();
        loginModal.login(credentials.get("user"),credentials.get("pwd"));
    }

    @Then("i should be logged in the page")
    public void iShouldBeLoggedInThePage() {
        Assertions.assertTrue(menuSection.logoutLink.isDisplayedControl(),"ERROR!! the login was not successfully");
    }
}
