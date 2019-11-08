package com.example.appclass_hw11_activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("Rui", "PageA onCreate");
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.d("Rui","PageA onStart");
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("Rui","PageA onRestart");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.d("Rui","PageA onResume");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.d("Rui","PageA onPause");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.d("Rui","PageA onStop");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("Rui","PageA onDestory");
    }
    public void BtnNextOnclick(View view){
        Intent intent = new Intent(MainActivity.this,Main2Activity.class);
        startActivity(intent);
    }
}
