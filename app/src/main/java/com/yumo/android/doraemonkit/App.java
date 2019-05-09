package com.yumo.android.doraemonkit;

import android.app.Application;

import com.didichuxing.doraemonkit.DoraemonKit;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        DoraemonKit.install(this);
    }
}
