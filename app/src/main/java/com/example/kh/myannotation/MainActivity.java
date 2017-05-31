package com.example.kh.myannotation;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.OptionsItem;
import org.androidannotations.annotations.OptionsMenu;
import org.androidannotations.annotations.OptionsMenuItem;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.res.StringRes;

@EActivity(R.layout.activity_main)
@OptionsMenu(R.menu.menu_main)
public class MainActivity extends AppCompatActivity {
@ViewById(R.id.toolbar)
Toolbar toolbar;
    @StringRes(R.string.action_settings)
    String a;
    @ViewById(R.id.fab)
    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @AfterViews
    public void afterView(){
        setSupportActionBar(toolbar);
    }
    @Click(R.id.fab)
    public void onFabClicked(View view){

                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

    }
    @OptionsMenuItem
    MenuItem action_settings;
    @OptionsItem(R.id.action_settings)
    void setting(){
        Toast.makeText(this, "asa", Toast.LENGTH_SHORT).show();
    }
}
