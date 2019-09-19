package com.acs.btdemo;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class WtrViewHolder extends RecyclerView.ViewHolder {
    TextView no_wtr;
    TextView tanggal;
    CardView cv;
    String epoch;
    public WtrViewHolder(View itemView) {
        super(itemView);
        no_wtr=itemView.findViewById(R.id.kode_item_wtr);
        tanggal=itemView.findViewById(R.id.waktu_wtr);
        cv= itemView.findViewById(R.id.cv_wtr);

    }
    public void onBind(final Context context, final WtrModel model) {

        no_wtr.setText(model.getTitle());
        tanggal.setText(model.getTanggal_wtr());
        epoch = model.getEpoch();
       // Log.d("epoch", "onBind: "+epoch);
        if(!epoch.equals("0")){
            cv.setCardBackgroundColor(Color.GRAY);
        }
    }

}
