package com.test.helpers;

import com.test.ApplicationManager;
import org.junit.*;

public class TestBase {
    private ApplicationManager appManager;

    @Before
    public void setUp() throws Exception {
        setApp(new ApplicationManager());
    }

    @After
    public void tearDown() throws Exception {
        appManager.stop();
    }

    protected void setApp(ApplicationManager appManager) {
        this.appManager = appManager;
    }

    protected ApplicationManager getAppManager() {
        return appManager;
    }
}
