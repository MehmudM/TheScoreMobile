package com.theScore.pages;


import com.theScore.utils.Driver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class BostonCelticsTeamPage {
    @AndroidFindBy(xpath = "//android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]")
    private MobileElement bostonCelticsTeamIcon;

    @AndroidFindBy(id = "com.fivemobile.thescore:id/team_name")
    public MobileElement teamName;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Player Stats\"]")
    public MobileElement playerStatsTab;

    @AndroidFindBy(xpath = "/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]")
    public MobileElement bestPlayer;

    @AndroidFindBy(xpath = "")
    public MobileElement bestPlayerName;


    public BostonCelticsTeamPage() {
        //PageFactory - we use it to enable @FindBy
        //AppiumFieldDecorator - we use it to enable mobile annotations: @AndroidFindBy, iOSXCUITFindBy  ...
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()), this);
    }

    public void toBostonCelticsMainPage(){
        this.bostonCelticsTeamIcon.click();
    }


}
