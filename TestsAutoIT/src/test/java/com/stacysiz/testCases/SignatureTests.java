package com.stacysiz.testCases;

import static org.junit.Assert.assertEquals;

import com.stacysiz.helpers.TestBase;
import org.junit.Test;


public class SignatureTests extends TestBase {


	@Test
	public void progressBarExistsCheckTest() throws InterruptedException {
        applicationManager.getSignatureHelper().startSignatureCheck();
        String stopButtonText = applicationManager.getSignatureHelper().checkProgressBar();
        assert(stopButtonText.equals("Ос&тановить"));
    }

}
