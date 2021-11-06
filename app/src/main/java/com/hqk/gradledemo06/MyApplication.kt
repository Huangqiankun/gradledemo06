package com.hqk.gradledemo06

import android.app.Application
import com.alibaba.android.arouter.launcher.ARouter

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        ARouter.init(this)
        if (BuildConfig.DEBUG) {
            //ARouter.getInstance().
        }
    }
}