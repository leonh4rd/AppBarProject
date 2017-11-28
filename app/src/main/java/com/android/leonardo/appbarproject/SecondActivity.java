package com.android.leonardo.appbarproject;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private ActionBar actionbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        toolbar = findViewById(R.id.home_toolbar);
        setSupportActionBar(toolbar);
        actionbar = getSupportActionBar();
        actionbar.setTitle(R.string.about);
        actionbar.setDisplayHomeAsUpEnabled(true);

        Intent intent = getIntent();
        String message = intent.getStringExtra(HomeActivity.EXTRA_MESSAGE);
        TextView textview = findViewById(R.id.textView);
        textview.setText(message);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.toolbar, menu);
        return super.onCreateOptionsMenu(menu);
    }
}
