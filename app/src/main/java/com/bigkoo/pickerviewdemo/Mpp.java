package com.bigkoo.pickerviewdemo;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

/**
 * Created by ysq on 2019/5/5.
 */

public class Mpp extends Application{

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }

}
