package StepDefinitions;

import base.BaseClass;
import io.cucumber.java.en.And;
import pageObjects.SearchResultPage;

public class SearchResultPageSteps extends BaseClass {
    SearchResultPage searchResultPage = new SearchResultPage();

    @And("User selects the customer rating {string}")
    public void userSelectsTheCustomerRating(String ProductRating) throws InterruptedException {
        searchResultPage.selectCustomerRating(ProductRating);
        Thread.sleep(3000);
    }

    @And("User selects the product with name {string}")
    public void userSelectsTheProductWithName(String ProductName) throws InterruptedException {
        searchResultPage.selectProductWithName(ProductName);
    }

}
