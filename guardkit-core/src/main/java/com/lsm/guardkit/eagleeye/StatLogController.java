package com.lsm.guardkit.eagleeye;

import com.lsm.guardkit.concurrent.NamedThreadFactory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class StatLogController {
    private static final Map<String, StatLogger> statLoggers = new ConcurrentHashMap<String, StatLogger>();

    private static AtomicBoolean running = new AtomicBoolean(false);

    private static final ScheduledThreadPoolExecutor rollerThreadPool = new ScheduledThreadPoolExecutor(1,
            new NamedThreadFactory("EagleEye-StatLogController-roller", true));



    public static void start() {
        if (running.compareAndSet(false, true)) {
            rollerThreadPool.setExecuteExistingDelayedTasksAfterShutdownPolicy(false);
        }
    }

    public static StatLogger createLoggerIfNotExists(StatLoggerBuilder builder) {
        String statLoggerName = builder.getLoggerName();

        StatLogger statLogger = statLoggers.get(statLoggerName);
        if (statLogger == null){
            statLogger = builder.create();
            statLoggers.put(statLoggerName, statLogger);

            scheduleNextRollingTask(statLogger);
        }
        return statLogger;
    }


    private static void scheduleNextRollingTask(StatLogger statLogger) {
        if (!running.get()) {
            System.out.println("<<<Exit>>>");
        } else {
            StatLogController.StatLogRollingTask rollingTask = new StatLogController.StatLogRollingTask(statLogger);
            rollerThreadPool.schedule(rollingTask, 500, TimeUnit.MILLISECONDS);
        }
    }

    private StatLogController() {

    }

    private static class StatLogRollingTask implements Runnable {
        final StatLogger statLogger;

        StatLogRollingTask(StatLogger statLogger) {
            this.statLogger = statLogger;
        }

        public void run() {
            System.out.println(">>>StatLogRollingTask isRunning>>>");
//            StatLogController.scheduleWriteTask(this.statLogger.rolling());
            StatLogController.scheduleNextRollingTask(this.statLogger);
        }
    }

}
