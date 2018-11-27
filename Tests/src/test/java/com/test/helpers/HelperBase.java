package com.test.helpers;

import com.test.ApplicationManager;

public class HelperBase {

    private ApplicationManager appManager;

    public HelperBase(ApplicationManager appManager) {
        this.appManager = appManager;
    }

    public String getBaseUrl() {
        return appManager.getBaseUrl();
    }

    public ApplicationManager getAppManager() {
        return appManager;
    }
}
