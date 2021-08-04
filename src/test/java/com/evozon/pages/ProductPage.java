package com.evozon.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public class ProductPage extends Basepage{

    @FindBy(css="#advice-required-entry-attribute92")
    private WebElementFacade colorRequiredmessage;

    @FindBy(css="#advice-required-entry-attribute180")
    private WebElementFacade sizeRequiredMessage;

    @FindBy(css=".add-to-cart-buttons button")
    private WebElementFacade addToCartBtn;



    public void clickOnAddToCartBtn(){
        clickOn(addToCartBtn);
    }

    public boolean isColorRequiredMessage(){
        return colorRequiredmessage.isDisplayed();
    }

    public boolean isSizeRequiredMessage(){
        return sizeRequiredMessage.isDisplayed();
    }

    public void selectColor(String color){
        getDriver().findElement(By.cssSelector("#configurable_swatch_color a[title='"+color+"']")).click();
    }

    public void selectSize(String size){
        getDriver().findElement(By.cssSelector("#configurable_swatch_size a[title='"+size+"'")).click();
    }


}
