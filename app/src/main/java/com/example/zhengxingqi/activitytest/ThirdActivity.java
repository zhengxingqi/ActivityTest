package com.example.zhengxingqi.activitytest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class ThirdActivity extends BaseActivity {

    private static final String TAG = "ThirdActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "onCreate: 555555555555555-----"+getTaskId());
        setContentView(R.layout.activity_third);
        findViewById(R.id.button_4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActivityCollector.finishAll();//结束掉所有界面退出程序
                android.os.Process.killProcess(android.os.Process.myPid());//杀掉当前程序的进程
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy: 销毁了");
    }
}
