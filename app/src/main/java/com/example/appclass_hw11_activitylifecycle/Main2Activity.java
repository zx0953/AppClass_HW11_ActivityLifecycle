package com.example.appclass_hw11_activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.d("Rui", "PageB onCreate");
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.d("Rui","PageB onStart");
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("Rui","PageB onRestart");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.d("Rui","PageB onResume");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.d("Rui","PageB onPause");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.d("Rui","PageB onStop");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("Rui","PageB onDestory");
    }
    public void BtnBackOnclick(View view){
        finish();
    }
}
