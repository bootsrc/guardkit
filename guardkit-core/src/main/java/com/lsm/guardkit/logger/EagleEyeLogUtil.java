package com.lsm.guardkit.logger;

import com.lsm.guardkit.eagleeye.StatLogger;
import com.lsm.guardkit.eagleeye.StatLoggerBuilder;

public class EagleEyeLogUtil {
    private static StatLogger statLogger;

    public static void init() {

    }

    static {
        statLogger = new StatLoggerBuilder("guardkit-").buildSingleton();
    }
}
