package com.stacysiz.helpers;

import com.stacysiz.utils.ApplicationManager;

public class FileSignatureHelper extends HelperBase {
    public FileSignatureHelper(ApplicationManager manager) {
        super(manager);
    }

    public void startSignatureCheck() throws InterruptedException {
        Thread.sleep(3000);
        applicationManager.getAutoItX().controlClick("Проверка подписи файла", "", "1006");
        Thread.sleep(3000);
    }

    public String checkProgressBar() throws InterruptedException {
        String text = applicationManager.getAutoItX().controlGetText("Проверка подписи файла", "", "1006");
        Thread.sleep(3000);
        return text;
    }
}
