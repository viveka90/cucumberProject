package vivek.qa.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import vivek.qa.BaseClass;
import vivek.qa.PageObject.HomePage;
import vivek.qa.PageObject.ProductPage;
import vivek.qa.PageObject.ShoppingcartPage;

public class ProductStepdefs extends BaseClass {

    @Given("User clicks on Show all Laptop and Notebook")
    public void userClicksOnShowAllLaptopAndNotebook() {
        HomePage.clickLink();
        ProductPage.validateHeader("Laptops & Notebooks");
    }

    @And("user selects the product")
    public void userSelectsTheProduct() {
        ProductPage.clickOnProduct("HP LP3065");
    }

    @When("user clicks on AddToCart button for the product")
    public void userClicksOnAddToCartButtonForTheProduct() {
        ProductPage.validateProductName("HP LP3065");
        ProductPage.clickAddToCart();
    }

    @And("user clicks on shopping cart link")
    public void userClicksOnShoppingCartLink() {
        HomePage.clickOnShoppingCart();
        ShoppingcartPage.validateProductName("HP LP3065");
    }


    @Then("MacBook should be added to the cart")
    public void macbookShouldBeAddedToTheCart() {
        ShoppingcartPage.validateHeader("Shopping Cart");
        ShoppingcartPage.validateProductName("HP LP3065");
    }
}
