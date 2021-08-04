package com.evozon.steps.serenity;

import com.evozon.pages.Dashboard;
import com.evozon.pages.HomePage;
import com.evozon.pages.LogInPage;
import com.evozon.utils.Constants;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import org.junit.Assert;

public class LoginStep {
    private HomePage homePage;
    private LogInPage loginPage;
    private Dashboard dashboardPage;

    @Step
    public void navigateToLoginPage(){
        //homePage.open();
        homePage.clickMyAccount();
        homePage.clickLogInLink();
    }

    @Step
    public void loginWithCredentials(String email, String password){
        loginPage.setEmailField(email);
        loginPage.setPasswordField(password);
        loginPage.clickLoginButton();
    }
    @Step
    public void verifyLoggedIn(String value){
        Assert.assertTrue(dashboardPage.isWelcomeMessage(value));
    }

    @Step
    public void loggInSteps(){
        navigateToLoginPage();
        loginWithCredentials(Constants.USER_EMAIL,Constants.USER_PASS);
        verifyLoggedIn(Constants.NEW_USERNAME);
    }
}
