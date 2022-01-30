package com.theScore.stepDefs;

import com.theScore.utils.Driver;
import io.cucumber.java.After;

public class Hooks {
    @After
    public void teardown(){
        Driver.closeDriver();
    }
}
