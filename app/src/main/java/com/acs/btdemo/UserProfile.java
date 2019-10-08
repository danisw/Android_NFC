package com.acs.btdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class UserProfile extends Activity {
    TextView nama_profile, username, wh_name;
    Button btn_next;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_profile);
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
