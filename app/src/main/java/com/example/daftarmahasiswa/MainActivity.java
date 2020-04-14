package com.example.daftarmahasiswa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toolbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    //variable
    private ArrayList<String> mNama = new ArrayList<>();
    private ArrayList<String> mPicUrl = new ArrayList<>();
    private ArrayList<String> mNim = new ArrayList<>();
    private ArrayList<String> mNohp = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: started.");

        initImageBitmaps();


    }
    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mPicUrl.add("https://scontent-atl3-1.cdninstagram.com/v/t51.2885-19/94008468_684085909008310_5029299063145627648_n.jpg?_nc_ht=scontent-atl3-1.cdninstagram.com&_nc_ohc=8iYkFMW0NOwAX9Swc-8&oh=99ab51e9f2eb4a52f069e253a6747f18&oe=5EBF09DC");
        mNama.add("Ravy Walidy");
        mNim.add("311710522");
        mNohp.add("08118809111");

        mPicUrl.add("https://scontent-iad3-1.cdninstagram.com/v/t51.2885-19/84427246_605856236815195_7975019846444253184_n.jpg?_nc_ht=scontent-iad3-1.cdninstagram.com&_nc_ohc=7AhpeJGWuj4AX_dUigy&oh=5e875e0b2bb4254a8e68fef00d945c69&oe=5EBEFA5A");
        mNama.add("Dika Maulana");
        mNim.add("311710500");
        mNohp.add("089011825409");

        mPicUrl.add("https://scontent-atl3-1.cdninstagram.com/v/t51.2885-19/37578145_674549679554224_1068719796050198528_n.jpg?_nc_ht=scontent-atl3-1.cdninstagram.com&_nc_ohc=HhBGIeFc4dkAX9Yx8sk&oh=be8cb96c680d1aafdd2e31b8230b8ce2&oe=5EBD2845");
        mNama.add("Yuda Kurnia");
        mNim.add("311710517");
        mNohp.add("0897787657");

        mPicUrl.add("https://scontent-atl3-1.cdninstagram.com/v/t51.2885-19/90056618_1496864950491685_6339619707422769152_n.jpg?_nc_ht=scontent-atl3-1.cdninstagram.com&_nc_ohc=vErmk_R5kXYAX9bAUEe&oh=08076254a9161532eba0d8fd9740bc3c&oe=5EBF8403");
        mNama.add("Annisa Putri");
        mNim.add("311710509");
        mNohp.add("01234908689");

        mPicUrl.add("https://scontent-atl3-1.cdninstagram.com/v/t51.2885-19/92692295_817283638790751_8674983774913560576_n.jpg?_nc_ht=scontent-atl3-1.cdninstagram.com&_nc_ohc=FmHRmvH96z0AX8IzcB1&oh=c977d5c115566e9c088e7e4846acfa4d&oe=5EC11FBB");
        mNama.add("Endang Yogi");
        mNim.add("311710502");
        mNohp.add("08123001484");

        mPicUrl.add("https://scontent-atl3-1.cdninstagram.com/v/t51.2885-19/91033541_2579828375619815_4776896312039702528_n.jpg?_nc_ht=scontent-atl3-1.cdninstagram.com&_nc_ohc=LEjkYW8yQwgAX_Mc_FA&oh=e75d770ab9ba125bdf69e01ed0cf44c7&oe=5EBFC8DF");
        mNama.add("Fera Jelita");
        mNim.add("311710409");
        mNohp.add("0812330009");

        mPicUrl.add("https://scontent-atl3-1.cdninstagram.com/v/t51.2885-19/66650992_2505280892849004_9059209440384778240_n.jpg?_nc_ht=scontent-atl3-1.cdninstagram.com&_nc_ohc=uxjO6LCBaPYAX_yO60t&oh=01b24746e82f634363dfd6f5d29fa933&oe=5EBEFF61");
        mNama.add("Indah Novia");
        mNim.add("311710339");
        mNohp.add("085255738");

        mPicUrl.add("https://scontent-atl3-1.cdninstagram.com/v/t51.2885-19/93243664_684886372321106_4019808889036865536_n.jpg?_nc_ht=scontent-atl3-1.cdninstagram.com&_nc_ohc=PfRvU4TvmZgAX_il7-e&oh=23569c710ac50338870d4048a3645216&oe=5EBDF69E");
        mNama.add("Intan Aniya");
        mNim.add("311710579");
        mNohp.add("0899220990");

        mPicUrl.add("https://scontent-atl3-1.cdninstagram.com/v/t51.2885-19/74682953_431603607550640_3498109115786330112_n.jpg?_nc_ht=scontent-atl3-1.cdninstagram.com&_nc_ohc=pegudi4eQnoAX-ZYyPf&oh=687ec7ec4e52f2b6cc14af02ceea4647&oe=5EBDD597");
        mNama.add("Helma");
        mNim.add("311710399");
        mNohp.add("0855667288");

        mPicUrl.add("https://instagram.fcgk8-1.fna.fbcdn.net/v/t51.2885-19/s320x320/83531417_198283918082279_7232989423434989568_n.jpg?_nc_ht=instagram.fcgk8-1.fna.fbcdn.net&_nc_cat=111&_nc_ohc=9YBfLWFPvg0AX9Uctj2&oh=baa24401de9b9ef6cae4f25fa0dff8c8&oe=5EBFF3A2");
        mNama.add("Citra Askariyah");
        mNim.add("311710789");
        mNohp.add("0899880066");

        mPicUrl.add("https://scontent-atl3-1.cdninstagram.com/v/t51.2885-19/90088766_143810466994016_490940226793897984_n.jpg?_nc_ht=scontent-atl3-1.cdninstagram.com&_nc_ohc=fbX8_JXKuJ8AX8Gry0I&oh=2ff80d12549e84b0e149526b20ad199d&oe=5EBE1D27");
        mNama.add("Meta Giana");
        mNim.add("311710599");
        mNohp.add("087788757");


        initRecycleView();
    }
    private void initRecycleView(){
        Log.d(TAG, "initRecycleView: init recycleview.");
        RecyclerView recyclerView = findViewById(R.id.recycle_view);
        AdapterRecycleView adapterRecycleView = new AdapterRecycleView(this, mNama, mPicUrl, mNim, mNohp);
        recyclerView.setAdapter(adapterRecycleView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        Toolbar tulber=findViewById(R.id.toolbar);
        setActionBar(tulber);

    }

}
