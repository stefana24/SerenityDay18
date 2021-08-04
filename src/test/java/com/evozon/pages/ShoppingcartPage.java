package com.evozon.pages;

import com.evozon.utils.Constants;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

import java.util.List;

public class ShoppingcartPage extends Basepage{
    @FindBy(css=".success-msg")
    private WebElementFacade addedMessage;

    @FindBy(css = ".cart-table tbody tr")
    List<WebElementFacade> listOfCartProducts;

    public boolean isAddedMessage(String productName){
        return addedMessage.getText().equalsIgnoreCase(productName+ Constants.productWasAddedMessage);
    }

    public boolean isProductInCart(String name){
        for(WebElementFacade product: listOfCartProducts){
            if(product.findElement(By.cssSelector("h2 a")).getText().equalsIgnoreCase(name)){
                return true;
            }
        }
        return false;
    }
}
