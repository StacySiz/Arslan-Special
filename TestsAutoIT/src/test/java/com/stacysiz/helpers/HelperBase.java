package com.stacysiz.helpers;

import autoitx4java.AutoItX;
import com.stacysiz.utils.ApplicationManager;

public class HelperBase {
    protected ApplicationManager applicationManager;
    private AutoItX autoItX;
    public HelperBase(ApplicationManager manager) {
        this.applicationManager = manager;
        this.autoItX = manager.getAutoItX();
    }

}
