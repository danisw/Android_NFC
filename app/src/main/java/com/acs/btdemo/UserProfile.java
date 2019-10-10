package com.acs.btdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.app.ActionBar;

public class UserProfile extends Activity {
    TextView nama_profile, username, wh_name;
    Button btn_next;
    private DrawerLayout dl;
    private ActionBarDrawerToggle t;
    private NavigationView nv;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_profile);
        //nav
//        dl = (DrawerLayout)findViewById(R.id.activity_main);
//        t = new ActionBarDrawerToggle(this, dl,R.string.transmit_apdu, R.string.app_name);
//
//        dl.addDrawerListener(t);
//        t.syncState();

       // getSupportActionBar().setDisplayHomeAsUpEnabled(true);

//        nv = (NavigationView)findViewById(R.id.nv);
//        nv.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//                int id = item.getItemId();
//                switch(id)
//                {
//                    case R.id.accountz:
//                        Toast.makeText(UserProfile.this, "My Account",Toast.LENGTH_SHORT).show();break;
//                    case R.id.settingsz:
//                        Toast.makeText(UserProfile.this, "Settings",Toast.LENGTH_SHORT).show();break;
//                    case R.id.mycart:
//                        Toast.makeText(UserProfile.this, "My Cart",Toast.LENGTH_SHORT).show();break;
//                    default:
//                        return true;
//                }
//
//
//                return true;
//
//            }
//        });

        Users user = SharedPrefManager.getInstance(this).getUser();

        nama_profile = findViewById(R.id.up_nama_user);
        username = findViewById(R.id.up_username);
        wh_name = findViewById(R.id.up_wh_name);
        btn_next = findViewById(R.id.up_btn_next);

        nama_profile.setText(user.getName());
        username.setText(user.getUsername());
        wh_name.setText(user.getWh_name());
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UserProfile.this, DeviceScanActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
    }


}
