package com.test.helpers;

import com.test.ApplicationManager;
import com.test.data.AccountData;
import org.openqa.selenium.By;

public class LoginHelper extends HelperBase {
    private static String login = "arslan.tachmuradov@gmail.com";
    private static String password = "13goldenmaknae37";
    private static AccountData user = new AccountData(login, password);
    private NavigationHelper navigationHelper = new NavigationHelper(getAppManager());

    public LoginHelper(ApplicationManager appManager) {
        super(appManager);
    }

    public void login(AccountData user) throws InterruptedException {
        fillInEmailTestCase(user);
        fillInPasswordTestCase(user);
    }

    private void loginEmail(AccountData user) throws InterruptedException {
        Thread.sleep(3000);
        getAppManager().getDriver().switchTo().activeElement().sendKeys(user.getEmail());
    }

    private void loginPassword(AccountData user) throws InterruptedException {
        Thread.sleep(3000);
        getAppManager().getDriver().switchTo().activeElement().sendKeys(user.getPassword());
    }

    public void fillInEmailTestCase(AccountData user) throws InterruptedException {
        loginEmail(user);
//        submitForm();
    }

    public void fillInPasswordTestCase(AccountData user) throws InterruptedException {
        getAppManager().getDriver().findElement(By.className("js-password-field")).click();
        loginPassword(user);
        submitForm();
    }

    public void submitForm() {
        getAppManager().getDriver().findElement(By.tagName("button")).click();
    }

    public static AccountData getUser() {
        return user;
    }
}
