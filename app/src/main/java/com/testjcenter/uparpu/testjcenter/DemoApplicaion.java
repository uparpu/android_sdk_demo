package com.testjcenter.uparpu.testjcenter;

import android.support.multidex.MultiDexApplication;

import com.facebook.stetho.Stetho;
import com.uparpu.api.UpArpuSDK;

/**
 * Created by Z on 2018/1/10.
 */

public class DemoApplicaion extends MultiDexApplication {
    public static final String appid = "test-app-1";
    public static final String appKey = "test-api-0001";
//    public static final String mPlacementId = "test-placement-8";

    public static final String mPlacementId_all = "test-placement-7";
    public static final String mPlacementId_facebook = "test-placement-1";
    public static final String mPlacementId_admob = "test-placement-2";
    public static final String mPlacementId_inmobi = "test-placement-3";
    public static final String mPlacementId_flurry = "test-placement-4";
    public static final String mPlacementId_applovin = "test-placement-5";
    public static final String mPlacementId_mobivsta = "test-placement-6";

    @Override
    public void onCreate() {
        super.onCreate();
        Stetho.initializeWithDefaults(this);
        UpArpuSDK.init(this, appid, appKey);

    }
}
