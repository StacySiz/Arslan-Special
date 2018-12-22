package com.stacysiz.utils;

import autoitx4java.AutoItX;
import com.jacob.com.LibraryLoader;
import com.stacysiz.TestCommons;
import com.stacysiz.helpers.FileSignatureHelper;
import com.stacysiz.helpers.StartUpHelper;

import java.io.File;

public class ApplicationManager {
    private AutoItX autoItX;
    private StartUpHelper startUpHelper;

    public FileSignatureHelper getSignatureHelper() {
        return signatureHelper;
    }

    private FileSignatureHelper signatureHelper;

    public ApplicationManager() {
        String pathToJacobLibrary;

        if (jvmBitVersion().contains("32")) {
            pathToJacobLibrary = TestCommons.JACOB_DLL_FILE_X86;
        } else {
            pathToJacobLibrary = TestCommons.JACOB_DLL_FILE_X64;
        }

        File file = new File(pathToJacobLibrary);
        System.setProperty(LibraryLoader.JACOB_DLL_PATH, file.getAbsolutePath());
        autoItX = new AutoItX();
        startUpHelper = new StartUpHelper(this);
        signatureHelper = new FileSignatureHelper(this);
    }

    private static String jvmBitVersion() {
        return System.getProperty("sun.arch.data.model");
    }

    public AutoItX getAutoItX() {
        return autoItX;
    }

    public StartUpHelper getStartUpHelper() {
        return startUpHelper;
    }


}
