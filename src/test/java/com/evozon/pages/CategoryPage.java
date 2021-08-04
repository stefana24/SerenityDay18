package com.evozon.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

import java.util.List;

public class CategoryPage extends Basepage {

    @FindBy(css="#nav .nav-primary > li")
    private List<WebElementFacade> categories;

    @FindBy(css=".catblocks a span")
    private List<WebElementFacade> subcategories;

    public void navigateToCategory(String categoryTitle){
        for(WebElementFacade nav:categories){
            if(nav.getText().equalsIgnoreCase(categoryTitle)){
                clickOn(nav);
                break;
            }
        }
    }

    public void navigateToSubcategory(String subcategoryTitle){
        for (WebElementFacade subcategory : subcategories) {
            if (subcategory.getText().equalsIgnoreCase(subcategoryTitle)) {
                clickOn(subcategory);
                break;
            }
        }
    }

    public void clickOnProduct(String productName){
        List<WebElementFacade> allproducts = findAll(By.cssSelector(".products-grid .product-name"));
        for(WebElementFacade product:allproducts){
            if(product.getText().equalsIgnoreCase(productName)){
                clickOn(product);
                break;
            }
        }
    }

}
