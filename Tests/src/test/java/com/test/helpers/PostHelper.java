package com.test.helpers;

import com.test.ApplicationManager;
import com.test.data.PostData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PostHelper extends HelperBase {
    private WebDriver driver = getAppManager().getDriver();
    private static PostData post =
            new PostData("This post was automatically created by a machine that has magenta(plz be patient it has autism also)");

    public PostHelper(ApplicationManager applicationManager) {
        super(applicationManager);
    }

    public void makeTweet(PostData post) throws InterruptedException {
        addPostTestCase(post);
    }

    private void addPostTestCase(PostData post) throws InterruptedException {
        driver.findElement(By.id("global-new-tweet-button")).click();
        Thread.sleep(3000);
        this.postMainBody(post);
        driver.findElement(By.xpath("//*[@id=\"Tweetstorm-tweet-box-0\"]/div[2]/div[2]/div[2]/span/button[2]")).click();
        Thread.sleep(3000);
    }

    private void postMainBody(PostData postOne) {
        getAppManager().getDriver().switchTo().activeElement().sendKeys(postOne.getMainPostBody());
    }

    public PostData getCreatedPostData(){
        PostData createdPostData = new PostData();
        List<WebElement> liPostBody = getAppManager().getDriver().findElements(By.className("js-tweet-text-container"));
        String postBody = liPostBody.get(0).getText();
        createdPostData.setMainPostBody(postBody);
        return createdPostData;
    }

    public static PostData getPost() {
        return post;
    }
}
