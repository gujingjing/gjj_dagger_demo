package com.example.ibesteeth.gjj_dagger_demo;

import android.app.Application;
import android.content.Context;

/**
 * 作者：iBesteeth on 2016/9/19 11:54
 * 邮箱：gujingjing@ibesteeth.com
 */

public class AppApplication extends Application {



    public static AppApplication get(Context context) {
        return (AppApplication) context.getApplicationContext();
    }

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = DaggerAppComponent.builder()
                .apiServiceModule(new ApiServiceModule())
                .toastBeanModule(new ToastBeanModule())
                .build();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
