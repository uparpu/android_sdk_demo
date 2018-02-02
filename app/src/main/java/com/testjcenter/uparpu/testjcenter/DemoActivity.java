package com.testjcenter.uparpu.testjcenter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;


import com.testjcenter.uparpu.testjcenter.adapter.DividerGridItemDecoration;
import com.testjcenter.uparpu.testjcenter.adapter.HomeAdapter;
import com.testjcenter.uparpu.testjcenter.adapter.HomeBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Z on 2018/1/10.
 */

public class DemoActivity extends Activity {


    RecyclerView mAdTypeSelectView;
    HomeAdapter mHomeAdapter;
    List<HomeBean> mDataList;
    final int[] IMAGE_IDS = new int[]{R.drawable.native_icon};
    final String[] ITEM_NAMES = new String[]{"Native_test"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View titleBarView = findViewById(R.id.home_title_bar);
        titleBarView.findViewById(R.id.back_icon).setVisibility(View.GONE);
        ((TextView) titleBarView.findViewById(R.id.title_text)).setText(R.string.app_name);


        mAdTypeSelectView = (RecyclerView) findViewById(R.id.ad_type_select_view);
        //设置两列
        mAdTypeSelectView.setLayoutManager(new GridLayoutManager(this, 2));


        mDataList = new ArrayList<>();
        for (int i = 0; i < IMAGE_IDS.length; i++) {
            HomeBean homeBean = new HomeBean();
            homeBean.mImageId = IMAGE_IDS[i];
            homeBean.mTitle = ITEM_NAMES[i];
            mDataList.add(homeBean);
        }
        mHomeAdapter = new HomeAdapter(this, mDataList);
        mAdTypeSelectView.setAdapter(mHomeAdapter);

        mHomeAdapter.setItemClickListener(new HomeAdapter.ItemClickListener() {
            @Override
            public void onClick(HomeBean homeBean) {
                if ("Native_test".equals(homeBean.mTitle)) {
                    startActivity(new Intent(DemoActivity.this, NativeTestActivity.class));
                }
            }
        });

        mAdTypeSelectView.addItemDecoration(new DividerGridItemDecoration(this));


    }
}
