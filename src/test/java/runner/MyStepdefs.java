package runner;

import io.cucumber.java.DataTableType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class MyStepdefs {

    /**
     * {}   ---> es usado para cualquier valor
     * {string} ---> es usado para un valor string entre comillas doblas
     * {int} ----> es usado para valores numericos
     * {float} ---> es usado para valores flotante i.e: 5.666
     * {word} ---> es usado para remplazar solo 1 palabra
     */

    @Given("i have access to {}")
    public void iHaveAccessToFacebook(String app) {

    }

    @When("i set the email textbox with {string}")
    public void iSetTheEmailTextboxWith(String value) {
    }

    @And("i set the pwd textbox with {int}")
    public void iSetThePwdTextboxWith(int value) {
    }

    @And("click in the login button")
    public void clickInTheLoginButton() {
    }

    @Then("i should be logged in the app")
    public void iShouldBeLoggedInTheApp() {
    }

    @When("fill the form with the values")
    public void fillTheFormWithTheValues(List<String> valueToFill) {

        for (String value:valueToFill
             ) {
            System.out.println("values: "+value);
        }

    }

    @And("click on the register button")
    public void clickOnTheRegisterButton() {
    }

    @Then("i should be registered")
    public void iShouldBeRegistered() {
    }

    @When("fill the form with the map values")
    public void fillTheFormWithTheMapValues(Map<String,String> map) {

        for (String key:map.keySet()
             ) {
            System.out.println("control: "+key+" valor a llenar: "+map.get(key));
        }

    }

    @When("fill the form with the object values")
    public void fillTheFormWithTheObjectValues(FormCucumber formCucumber) {

        System.out.println("name : "+formCucumber.getName());
        System.out.println("Phone : "+formCucumber.getPhone());
        System.out.println("DNI : "+formCucumber.getDni());
        System.out.println("Email : "+formCucumber.getEmail());
        System.out.println("Address : "+formCucumber.getAddress());
        System.out.println("Phone2 : "+formCucumber.getPhone2());
    }

    @DataTableType
    public FormCucumber parserObject(Map<String,String> map){
        return new FormCucumber(map.get("Name"),
                map.get("Phone"),
                map.get("DNI"),
                map.get("Email"),
                map.get("Adress"),
                map.get("Phone2"));

    }
}
