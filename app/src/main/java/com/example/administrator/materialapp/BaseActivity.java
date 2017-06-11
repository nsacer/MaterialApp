package com.example.administrator.materialapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.xutils.x;

import tools.ThemeTool;

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ThemeTool.changeTheme(this);
        x.view().inject(this);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
//        ThemeTool.changeTheme(this);
    }
}
