package com.example.zhengxingqi.activitytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class SecondActivity extends BaseActivity {

    private static final String TAG = "SecondActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "onCreate: 222222222222222------"+getTaskId());
        setContentView(R.layout.activity_second);
        findViewById(R.id.button_3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SecondActivity.this,ThirdActivity.class));
            }
        });
    }

    @Override
    public void onBackPressed() {
        /*Intent intent = new Intent();
        intent.putExtra("return","返回成功");
        setResult(RESULT_OK,intent);
        finish();*/
        finish();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy: 销毁了");
    }
}
