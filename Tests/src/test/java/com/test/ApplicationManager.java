package com.test;

import com.test.data.*;
import com.test.helpers.*;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.fail;

public class ApplicationManager {
    private WebDriver driver;
    private String baseUrl = "https://twitter.com/login?lang=ru";
    private String driverPath = "C:\\chromedriver_win32\\chromedriver.exe";
    private String driverName = "webdriver.chrome.driver";
    private StringBuffer verificationErrors = new StringBuffer();

    private NavigationHelper navigationHelper;

    private PostData postData;
    private LoginHelper loginHelper;
    private PostHelper postHelper;

    private static ThreadLocal<ApplicationManager> app = new ThreadLocal<ApplicationManager>();

    public ApplicationManager() {
        System.setProperty(driverName, driverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        navigationHelper = new NavigationHelper(this);
        loginHelper = new LoginHelper(this);
        postHelper = new PostHelper(this);
    }

    @After
    public void tearDown() {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    public void stop() {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    public NavigationHelper getNavigation() {
        return navigationHelper;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public LoginHelper getAuth() {
        return loginHelper;
    }

    public PostHelper getPostHelper() {
        return postHelper;
    }

    public String getBaseUrl() {
        return baseUrl;
    }
}