package com.evozon.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class Dashboard extends Basepage {
    @FindBy(css = ".hello strong")
    private WebElementFacade welcomeMessage;


    public boolean isWelcomeMessage(String text){
        String message = "Hello, " + text + "!";
        return welcomeMessage.containsOnlyText(message);
    }


}
