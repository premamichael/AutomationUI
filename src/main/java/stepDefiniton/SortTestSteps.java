package stepDefiniton;

import functionLibrary.CommonFunctions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class SortTestSteps extends CommonFunctions {

    @When("I choose sort option {string}")
    public void chooseSortOption(String priceSortOption)
    {
        new Select(driver.findElement(By.className("product_sort_container"))).selectByVisibleText(priceSortOption);
    }

    @Then("I should see the products sorted accordingly with price {string} listed on top")
    public void verifyProductSorting(String priceOnTop)
    {
        Assert.assertTrue(driver.findElement(By.xpath("//div[text()='"+priceOnTop+"']")).isDisplayed());
    }
}
