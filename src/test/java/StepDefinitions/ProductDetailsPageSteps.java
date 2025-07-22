package StepDefinitions;

import base.BaseClass;
import io.cucumber.java.en.And;
import pageObjects.ProductDetailsPage;

public class ProductDetailsPageSteps extends BaseClass {
    ProductDetailsPage productDetailsPage = new ProductDetailsPage();
    @And("User adds the product to the cart")
    public void userAddsTheProductToTheCart() throws InterruptedException {
        productDetailsPage.clickAddToCartButton();
    }
}
