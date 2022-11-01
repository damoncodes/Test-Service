package com.estore.testservice;

import java.util.Objects;

public class AppSingleton {
    private static volatile AppSingleton appSingleton;

    public AppSingleton() throws MyException {
        if (Objects.nonNull(appSingleton))
            throw new MyException("Try getting AppSingleton Instance from getAppSingleton()");
    }

    public static AppSingleton getAppSingletonInstance() throws MyException {
        if (Objects.isNull(appSingleton)) synchronized (AppSingleton.class) {
            appSingleton = new AppSingleton();
        }
        return appSingleton;
    }
}
