package com.ultimaqa.courses.pages;

import com.aventstack.extentreports.Status;
import com.ultimaqa.courses.customlisteners.CustomListeners;
import com.ultimaqa.courses.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {

        @CacheLookup
        @FindBy
                (xpath = "//input[@class='button button-primary g-recaptcha']")
        WebElement clickOnLoginButton;
        @CacheLookup
        @FindBy
                (id="user[email]")
        WebElement emailField;
        @CacheLookup
        @FindBy
                (id="user[password]")
        WebElement passwordField;
        @CacheLookup
        @FindBy
               (xpath = "//button[contains(text(),'Sign in')]")
        WebElement clickOnSignInField;
        @CacheLookup
        @FindBy
                (xpath = "//li[contains(text(),'Invalid email or password.')]")
        WebElement getTextMessage1;



        public void signInButton(){
            CustomListeners.test.log(Status.PASS, "Click on loginButton");
            clickOnElement(clickOnLoginButton);
        }

        public void enterEmail(String email){
            CustomListeners.test.log(Status.PASS,"Enter Username " + email);
            sendTextToElement(emailField,email);
        }
        public void enterPassword(String password){
            CustomListeners.test.log(Status.PASS,"Enter password " + password);
            sendTextToElement(passwordField,password);
        }



        public void clickOnSignIn(){
            CustomListeners.test.log(Status.PASS, "Click on signInLink");
           // By clickOnSignInField=By.xpath("//input[@data-callback='onSubmit']");
            clickOnElement(clickOnSignInField);
        }

        public String getVerifyTextMessage1(){
            CustomListeners.test.log(Status.PASS, "Get InvalidEmail Or Password Message");
            return getTextFromElement(getTextMessage1);
        }

    }









