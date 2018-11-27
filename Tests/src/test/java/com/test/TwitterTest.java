package com.test;

import com.test.data.PostData;
import com.test.helpers.LoginHelper;
import com.test.helpers.PostHelper;
import com.test.helpers.TestBase;
import org.junit.Assert;
import org.junit.Test;

public class TwitterTest extends TestBase {

    @Test
    public void getAuthTest() throws InterruptedException {
        getAppManager().getNavigation().getOnPage();
        getAppManager().getAuth().login(LoginHelper.getUser());
    }

    @Test
    public void testTweet() throws InterruptedException {
        getAppManager().getNavigation().getOnPage();
        getAppManager().getAuth().login(LoginHelper.getUser());
        getAppManager().getPostHelper().makeTweet(PostHelper.getPost());
    }

    @Test
    public void testContentCheck() throws InterruptedException {
        getAppManager().getNavigation().getOnPage();
        getAppManager().getAuth().login(LoginHelper.getUser());
        getAppManager().getNavigation().getOnProfilePage();
        PostData createdPost = getAppManager().getPostHelper().getCreatedPostData();
        Assert.assertEquals(PostHelper.getPost().getMainPostBody(), createdPost.getMainPostBody());
    }
}
