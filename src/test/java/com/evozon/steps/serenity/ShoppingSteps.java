package com.evozon.steps.serenity;

import com.evozon.pages.ShoppingcartPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class ShoppingSteps {

    private ShoppingcartPage shoppingcartPage;

    @Step
    public void verifyProductWasAddedMessage(String productName){
        Assert.assertTrue(shoppingcartPage.isAddedMessage(productName));
    }

    @Step
    public void verifyProductWasAddedInContainer(String productName){
//        Assert.assertTrue(product.getText().equalsIgnoreCase(productName));
        Assert.assertTrue(shoppingcartPage.isProductInCart(productName) );
    }
}
