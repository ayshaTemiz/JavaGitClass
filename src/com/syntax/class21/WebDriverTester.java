package com.syntax.class21;

public class WebDriverTester {
    public static void main(String[] args) {
        //this is polymorphism..we can put child classes inside parent class
        WebDriver[] obj = {new FireFox(), new GoogleChrome(), new Safari()};

        for (WebDriver print : obj) {
            print.clickSubmit();
            print.closeBrowser();
            print.enterUserPassword();
            print.signup();
            print.login();
            print.signup();

        }

        //upcasting
        WebDriver webDriver = new GoogleChrome(); //we can get all the common methods , not special methods which belongs only drived class
        GoogleChrome chrome = (GoogleChrome) webDriver;  //down casting  ..//but we can access special methods which belongs only googlechrome like this.
    }


}
