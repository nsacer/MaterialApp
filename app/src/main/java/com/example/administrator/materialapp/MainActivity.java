package com.example.administrator.materialapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.Event;
import org.xutils.view.annotation.ViewInject;

import tools.PreUtils;

@ContentView(R.layout.activity_main)
public class MainActivity extends BaseActivity implements NavigationView.OnNavigationItemSelectedListener{

    @ViewInject(R.id.toolbar)
    private Toolbar toolbar;

    @ViewInject(R.id.drawerLayout)
    private DrawerLayout drawerLayout;

    @ViewInject(R.id.nav)
    private NavigationView nav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        nav.setNavigationItemSelectedListener(this);

        initToolbar();
    }


    private void initToolbar() {

        toolbar.setTitle("你好啊");
        toolbar.setTitleTextColor(getResources().getColor(R.color.white));
        toolbar.setNavigationIcon(R.mipmap.ic_launcher);
        setSupportActionBar(toolbar);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar,
                R.string.drawer_open, R.string.drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
    }

    @Event(R.id.iv_drawer_header)
    private void headerClick(View view) {

        Toast.makeText(this, "header", Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        
        switch (item.getItemId()) {
            
            case R.id.action_search:

                Toast.makeText(this, "search", Toast.LENGTH_SHORT).show();
                break;
            
            case R.id.men_action_refresh:

                Toast.makeText(this, "刷新", Toast.LENGTH_SHORT).show();
                break;
            
            case R.id.men_action_change_mode:

                Log.i("====", PreUtils.getIsDarkMode() + "----before");
                PreUtils.setDarkMode(!PreUtils.getIsDarkMode());
                Log.i("====", PreUtils.getIsDarkMode() + "----after");
                MainActivity.this.recreate();
                break;
            
            case R.id.menu_action_feedback:

                Toast.makeText(this, "FeedBack", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {

            case R.id.nav_one:

                Toast.makeText(this, "nav_one ", Toast.LENGTH_SHORT).show();
                break;

            case R.id.nav_a:

                Toast.makeText(this, "nav_aaa", Toast.LENGTH_SHORT).show();
                break;

            default:
                break;
        }
        return true;
    }
}
