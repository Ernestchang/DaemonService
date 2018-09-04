package com.sunfusheng.daemon.sample;

import android.app.Notification;
import android.os.Looper;
import android.util.Log;

import com.sunfusheng.daemon.AbsHeartBeatService;

/**
 * @author sunfusheng on 2018/8/3.
 */
public class HeartBeatService extends AbsHeartBeatService {
    private static final String TAG = "---> HeartBeatService";
    private static final android.os.Handler mainThreadHandler = new android.os.Handler(Looper.getMainLooper());

    @Override
    public void onStartService() {
        Log.d(TAG, "onStartService()");
        startForeground(1, new Notification());
    }

    @Override
    public void onStopService() {
        Log.e(TAG, "onStopService()");
    }

    @Override
    public long getDelayExecutedMillis() {
        return 0;
    }

    @Override
    public long getHeartBeatMillis() {
        return 30 * 1000;
    }

    @Override
    public void onHeartBeat() {
        Log.d(TAG, "onHeartBeat()");
    }
}
