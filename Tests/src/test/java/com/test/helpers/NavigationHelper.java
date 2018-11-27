package com.test.helpers;

import com.test.ApplicationManager;

public class NavigationHelper extends HelperBase {
    private String authUrl = "https://twitter.com/login?lang=ru";
    private String profilePage = "https://twitter.com/iarslandinho";
    public NavigationHelper(ApplicationManager appManager) {
        super(appManager);
    }

    public void getOnPage(){
        getAppManager().getDriver().get(authUrl);
    }
    public void getOnProfilePage(){
        getAppManager().getDriver().get(profilePage);
    }
}
