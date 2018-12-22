package com.stacysiz.helpers;

import autoitx4java.AutoItX;
import com.stacysiz.utils.ApplicationManager;

public class StartUpHelper extends HelperBase {

    public StartUpHelper(ApplicationManager manager) {
        super(manager);
    }

    public void startUp() {
        applicationManager.getAutoItX().run("sigverif.exe", "C:/Windows/System32", AutoItX.SW_SHOWNORMAL);
        applicationManager.getAutoItX().winActivate("Проверка подписи файла");
    }
}
