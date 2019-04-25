package com.lsm.guardkit.eagleeye;

public class StatLoggerBuilder {

    private String loggerName;

    public StatLoggerBuilder(String loggerName) {
        this.loggerName = loggerName;
    }

    public String getLoggerName() {
        return loggerName;
    }

    public StatLogger buildSingleton() {
        return StatLogController.createLoggerIfNotExists(this);
    }

    public StatLogger create(){
        return new StatLogger();
    }

}
