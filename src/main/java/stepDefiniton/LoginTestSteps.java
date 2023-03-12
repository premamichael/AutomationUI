package stepDefiniton;

import functionLibrary.CommonFunctions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginTestSteps extends CommonFunctions {

    @Given("I am on HomePage using url {string} with title {string}")
    public void openHomePage(String url, String expectedPageTitle)
    {
        driver.get(url);
        Assert.assertEquals(expectedPageTitle,driver.getTitle());
    }

    @When("I enter username {string} and password {string}")
    public void enterValidCredentials(String username, String password)
    {
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
    }

    @When("I click login button")
    public void clickLoginButton()
    {
        driver.findElement(By.id("login-button")).click();
    }

    @Then("I should have logged in successfully and gets redirected to products page with title {string}")
    public void verifyValidLogin(String expectedPageHeading)
    {
        Assert.assertEquals(expectedPageHeading,driver.findElement(By.className("title")).getText());
    }

    @Then("I should not be able to login and gets error message as {string}")
    public void verifyInvalidLogin(String expectedErrorMessage)
    {
        Assert.assertEquals(expectedErrorMessage,driver.findElement(By.xpath("//h3[@data-test='error']")).getText());
    }

}
