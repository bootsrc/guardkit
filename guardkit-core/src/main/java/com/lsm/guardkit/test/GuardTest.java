package com.lsm.guardkit.test;

import com.lsm.guardkit.eagleeye.EagleEye;
import com.lsm.guardkit.eagleeye.StatLoggerBuilder;
import com.lsm.guardkit.logger.EagleEyeLogUtil;

public class GuardTest {
    public static void main(String[] args) {
        EagleEye.init();
        EagleEyeLogUtil.init();

        System.out.println("Hello guardkit!");
        while (true){

        }
    }
}
