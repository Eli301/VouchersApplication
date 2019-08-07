package com.example.eli.vouchersapplication.controller;

import android.app.ProgressDialog;
import android.database.Cursor;
import android.os.AsyncTask;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.eli.vouchersapplication.model.*;
import com.example.eli.vouchersapplication.R;
import com.example.eli.vouchersapplication.model.backend.DB_manager;
import com.example.eli.vouchersapplication.model.datasource.DataTools;
import com.example.eli.vouchersapplication.model.entities.Voucher;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    protected Button allCategoriesbutton;
    protected Button recommended_button;
    protected Button my_pampering_button;
    protected Button favorites_button;
    Class fragmentClass;
    Fragment nextfragment = null;

    private void setAndFindViews(){
        allCategoriesbutton = (Button)findViewById(R.id.all_categories_button);
        recommended_button = (Button)findViewById(R.id.recommended_button);
        my_pampering_button = (Button)findViewById(R.id.my_pampering_button);
        favorites_button = (Button)findViewById(R.id.favorites_button);

        allCategoriesbutton.setOnClickListener(this);
        recommended_button.setOnClickListener(this);
        my_pampering_button.setOnClickListener(this);
        favorites_button.setOnClickListener(this);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setAndFindViews();





    }

    @Override
    public void onClick(View view) {

        try
        {
            if (view == allCategoriesbutton) {
                fragmentClass = AllCatFragment.class;
                nextfragment = (Fragment) fragmentClass.newInstance();

            }
            if (view == recommended_button) {
                fragmentClass = RecommendedFragment.class;
                nextfragment = (Fragment) fragmentClass.newInstance();
            }
            if (view == my_pampering_button) {
                fragmentClass = PamperingFragment.class;
                nextfragment = (Fragment) fragmentClass.newInstance();
            }
            if (view == favorites_button) {
                fragmentClass = FavoritesFragment.class;
                nextfragment = (Fragment) fragmentClass.newInstance();
            }

            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragmentLayout, nextfragment).commit();
        }
        catch (Exception e)
        {
            Toast.makeText(getApplicationContext(),e.toString(),Toast.LENGTH_LONG).show();
        }

    }
}
