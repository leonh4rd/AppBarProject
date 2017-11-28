package com.android.leonardo.appbarproject;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class HomeActivity extends AppCompatActivity{

    public static final String EXTRA_MESSAGE = "Leonardo";

    private Toolbar toolbar;
    private ActionBar actionbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        toolbar = findViewById(R.id.home_toolbar);
        setSupportActionBar(toolbar);
        actionbar = getSupportActionBar();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.toolbar, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch(item.getItemId())
        {
            case R.id.menu_about:
                String message = getResources().getString(R.string.version)+ " " + BuildConfig.VERSION_NAME;
                Snackbar.make(findViewById(R.id.myCoordinatorLayout), message, Snackbar.LENGTH_SHORT)
                        .show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void SendMessage(View view)
    {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(EXTRA_MESSAGE, "Developer Leonardo");
        startActivity(intent);
    }
}
