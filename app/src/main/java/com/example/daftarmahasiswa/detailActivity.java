package com.example.daftarmahasiswa;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

import com.bumptech.glide.Glide;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class detailActivity extends AppCompatActivity {
    private static final String TAG = "detailActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_detail);
        Log.d(TAG, "onCreate: started.");

        getIncomingIntent();
    }
    private void getIncomingIntent(){
        Log.d(TAG, "getIncomingIntent: checking for incoming intents.");
        if (getIntent().hasExtra("pic_url") && getIntent().hasExtra("pic_name") && getIntent().hasExtra("nimm") && getIntent().hasExtra("nohps")){
            Log.d(TAG, "getIncomingIntent: found intent extras.");

            String pirUrl = getIntent().getStringExtra("pic_url");
            String picName = getIntent().getStringExtra("pic_name");
            String Nim = getIntent().getStringExtra("nimm");
            String Nohp = getIntent().getStringExtra("nohps");
            setPic(pirUrl, picName, Nim, Nohp);


        }
    }
    private void setPic(String picUrl, String picName, String Nim, String Nohp){
        Log.d(TAG, "setPic: setting the image name to widgets.");

        TextView nohp = findViewById(R.id.nohp);
        nohp.setText(Nohp);

        TextView nim = findViewById(R.id.nimm);
        nim.setText(Nim);

        TextView name = findViewById(R.id.pic_desc);
        name.setText(picName);

        ImageView image = findViewById(R.id.pic);
        Glide.with(this)
                .asBitmap()
                .load(picUrl)
                .into(image);


        Toolbar toolbar=findViewById(R.id.toolbar);
        setActionBar(toolbar);
        getActionBar().setDisplayShowHomeEnabled(true);

    }

}
