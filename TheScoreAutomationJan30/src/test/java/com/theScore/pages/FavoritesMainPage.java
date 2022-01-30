package com.theScore.pages;


import com.theScore.utils.Driver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class FavoritesMainPage {
    //android.widget.LinearLayout[@content-desc='NBA']
    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc='NBA']")
    private MobileElement NBA;

    @AndroidFindBy(xpath = "")
    private MobileElement recommended;
    @AndroidFindBy(xpath = "")
    private MobileElement NHL;
    @AndroidFindBy(xpath = "")
    private MobileElement NFL;
    @AndroidFindBy(xpath = "")
    private MobileElement MLB;

    @AndroidFindBy(xpath = "//android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]")
    private MobileElement bostonCeltics;


    @AndroidFindBy(xpath = "com.fivemobile.thescore:id/btn_primary")
    private MobileElement continueBtn;
    @AndroidFindBy(xpath = "com.fivemobile.thescore:id/btn_primary")
    private MobileElement doneBtn;

    public FavoritesMainPage() {
        //PageFactory - we use it to enable @FindBy
        //AppiumFieldDecorator - we use it to enable mobile annotations: @AndroidFindBy, iOSXCUITFindBy  ...
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()), this);
    }

    public void teams(String team) {
        switch (team) {
            case "NBA":
                this.NBA.click();
                break;
            case ("RECOMMENDED"):
                this.recommended.click();
                break;
            case ("NHL"):
                this.NHL.click();
                break;
            case ("NFL"):
                this.NFL.click();
                break;
            case ("MLB"):
                this.MLB.click();
                break;

        }
    }
    public void nbaTeams(String nbaTeams){
        switch (nbaTeams) {
            case "Boston Celtics":
                this.bostonCeltics.click();
                break;
        }
    }

    public void toFavsPage(){
        this.continueBtn.click();
        this.doneBtn.click();
    }
}
