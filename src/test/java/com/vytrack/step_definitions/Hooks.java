package com.vytrack.step_definitions;

import com.vytrack.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks {

    @Before
    public void setup(){
        System.out.println("Test Setup");
    }

    @Before("@driver")
    public void specialSetup(){
        System.out.println("Setup for driver");
    }

    @After("@driver")
    public void specialTeardown(){
        System.out.println("Test cleanup for Driver Only");
        //Driver.closeDriver();
    }

    @After
    public void teardown(){
        System.out.println("Test cleanup");
        //Driver.closeDriver();
    }

}
