package com.testjcenter.uparpu.testjcenter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import com.uparpu.nativead.unitgroup.api.CustomNativeAd;

public class NativeTestActivity extends Activity {
    Button appButton,placeceButton,placece1Button,placece2Button,placece3Button,placece4Button,placece5Button,placece6Button;
    TextView resultTextView;
    Handler myHander = new Handler(){

        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
        }
    };

     CustomNativeAd ad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_native_test);
//        appButton = (Button)findViewById(R.id.appstrg);
//        placeceButton = (Button)findViewById(R.id.placece_all);
//        placece1Button = (Button)findViewById(R.id.placece_1);
//        placece2Button = (Button)findViewById(R.id.placece_2);
//        placece3Button = (Button)findViewById(R.id.placece_3);
//        placece4Button = (Button)findViewById(R.id.placece_4);
//        placece5Button = (Button)findViewById(R.id.placece_5);
//        placece6Button = (Button)findViewById(R.id.placece_6);
//
//        resultTextView = (TextView)findViewById(R.id.show_result);
//
//
//        resultTextView.setMovementMethod(new ScrollingMovementMethod());
//
//        appButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                System.out.println("开始请求app策略。。。。");
//                resultTextView.setText("...");
//                AppStrategyManager.getInstance(NativeTestActivity.this).startRequest(DemoApplicaion.appid,DemoApplicaion.appKey);
//                myHander.post(new Runnable() {
//                    @Override
//                    public void run() {
//                        String str = AppStrategy.toJsonString(AppStrategyManager.getInstance(NativeTestActivity.this).getAppStrategyByAppId(DemoApplicaion.appid));
//                        resultTextView.setText("app(--"+DemoApplicaion.appid+"--):\n"+str);
//                    }
//                });
//            }
//        });
//
//        placeceButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                requstPlace( DemoApplicaion.mPlacementId_all);
//            }
//        });
//
//
//        placece1Button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                requstPlace( DemoApplicaion.mPlacementId_facebook);
//            }
//        });
//        placece2Button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                requstPlace( DemoApplicaion.mPlacementId_admob);
//            }
//        });
//        placece3Button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                requstPlace( DemoApplicaion.mPlacementId_inmobi);
//            }
//        });
//        placece4Button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                requstPlace( DemoApplicaion.mPlacementId_flurry);
//            }
//        });
//        placece5Button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                requstPlace( DemoApplicaion.mPlacementId_applovin);
//            }
//        });
//        placece6Button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                requstPlace( DemoApplicaion.mPlacementId_mobivsta);
//            }
//        });
//
//
//        findViewById(R.id.show_gaid).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String gaid = CommonDeviceUtil.getGoogleAdId();
//                System.out.println("gaid。。。。["+gaid+"]");
//                resultTextView.setText("gaid["+gaid+"]");
//            }
//        });

        findViewById(R.id.show_real_ad).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(NativeTestActivity.this, NativeAdActivity.class));
            }
        });
    }


    public void  requstPlace(final String placeId){
        System.out.println("始请求广告位策略。。。。"+placeId);
//        resultTextView.setText("...");
//        PlaceStrategyManager.getInstance(NativeTestActivity.this).startRequest(DemoApplicaion.appid, DemoApplicaion.appKey, placeId,new PlaceStrategyManager.StrategyloadListener(){
//            @Override
//            public void loadStrategySuccess(PlaceStrategy placeStrategy) {
//                myHander.post(new Runnable() {
//                    @Override
//                    public void run() {
//                        String str =PlaceStrategy.toJsonString(PlaceStrategyManager.getInstance(NativeTestActivity.this).getPlaceStrategyByAppIdAndPlaceId(DemoApplicaion.appid,placeId));
//                        resultTextView.setText("PlacementId(--"+placeId+"--):\n"+str);
//
//                    }
//                });
//            }
//
//            @Override
//            public void loadStrategyFailed(String code, String msg) {
//
//            }
//        });
    }
}
