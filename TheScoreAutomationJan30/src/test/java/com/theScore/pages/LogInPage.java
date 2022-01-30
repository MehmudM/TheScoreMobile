package com.theScore.pages;


import com.theScore.utils.ConfigReader;
import com.theScore.utils.Driver;
import com.theScore.utils.MobileUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
    //without login
    @AndroidFindBy(id = "com.fivemobile.thescore:id/action_button_text")
    private MobileElement getStartedBtn;
    @AndroidFindBy(id = "com.fivemobile.thescore:id/btn_primary")
    private MobileElement continueBtn;
    @AndroidFindBy(id = "com.fivemobile.thescore:id/btn_disallow")
    private MobileElement maybeLaterBtn;


    //with Login
    @AndroidFindBy(id = "")
    private MobileElement signInKBtn;
    @AndroidFindBy(id = "")
    private MobileElement email;

    @AndroidFindBy(id = "")
    private MobileElement password;

    @AndroidFindBy(id = "")
    private MobileElement signInBtn;

    public void getStarted(){
        MobileUtils.clickWithWait(getStartedBtn);
    }


    public LogInPage(){
        //PageFactory - we use it to enable @FindBy
        //AppiumFieldDecorator - we use it to enable mobile annotations: @AndroidFindBy, iOSXCUITFindBy  ...
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()), this);
    }

    public void continuWithoutSignIn(){
        this.getStartedBtn.click();
        this.continueBtn.click();
        this.maybeLaterBtn.click();
    }
    public void login(){
        String username = ConfigReader.getProperty("user.email");
        String password = ConfigReader.getProperty("user.password");
        MobileUtils.waitFor(4000);
        this.email.sendKeys(username);
        this.password.sendKeys(password);
        MobileUtils.clickWithWait(signInBtn);
        MobileUtils.waitFor(4000);
    }

}
