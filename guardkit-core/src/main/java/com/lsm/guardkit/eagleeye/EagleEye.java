package com.lsm.guardkit.eagleeye;

public class EagleEye {
    private static void initEagleEye() {
        StatLogController.start();
    }

    public static void init() {
        System.out.println("EagleEye init!");
    }

    static {
        initEagleEye();
    }
}
