package com.kodilla.patterns.singleton;

public final class LoggerSingleton {

    private static LoggerSingleton loggerSingletonInstance = null;
    private String lastLog = "";

    public static LoggerSingleton getInstance() {
        if (loggerSingletonInstance == null) {
            synchronized (LoggerSingleton.class) {
                if (loggerSingletonInstance == null) {
                    loggerSingletonInstance = new LoggerSingleton();
                }
            }
        }
      return loggerSingletonInstance;
    }

    public void log(String log) {
        lastLog = log;
        System.out.println("Log: [" + log + "]");
    }

    public String getLastLog() {
        return lastLog;
    }
}
