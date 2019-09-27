package com.acs.btdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DataHeaderWHT extends AppCompatActivity {
    private String id_wtr;
    private String kode_WTR;
    private String dest_wh;
    private String sc_wh;

    TextView id_wtr_txt;
    TextView no_wtr_txt;
    TextView sc_wh_txt;
    TextView dest_wh_txt;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wht_header);

        Intent iin= getIntent();
        Bundle b = iin.getExtras();
        if(b!=null)
        {
            String j =(String) b.get("id_wtr");
            String i =(String) b.get("kode_WTR");
            String k = (String) b.get("dest_wh");
            String l = (String) b.get("sc_wh");
            id_wtr=j;
            kode_WTR=i;
            dest_wh=k;
            sc_wh=l;
        }else{
            finish();
        }

        id_wtr_txt=findViewById(R.id.id_WTR);
        no_wtr_txt=findViewById(R.id.no_WTR);
        //sc_wh_txt = findViewById(R.id.);


    }

}
