package com.example.daftarmahasiswa;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import de.hdodenhof.circleimageview.CircleImageView;

public class AdapterRecycleView extends RecyclerView.Adapter<AdapterRecycleView.ViewHolder> {
    private static final String TAG = "AdapterRecycleView";
    private ArrayList<String> mNohp = new ArrayList<>();
    private ArrayList<String> mNim = new ArrayList<>();
    private ArrayList<String> mPicNama = new ArrayList<>();
    private ArrayList<String> mPic = new ArrayList<>();

    private Context mContext;

    public AdapterRecycleView(Context mContext, ArrayList<String> mPicNama, ArrayList<String> mPic, ArrayList<String> mNim, ArrayList<String> mNohp) {
        this.mPicNama = mPicNama;
        this.mPic = mPic;
        this.mNim = mNim;
        this.mNohp = mNohp;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_list, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Log.d(TAG, "onBindViewHolder: called.");
        Glide.with(mContext)
                .asBitmap()
                .load(mPic.get(position))
                .into(holder.pic);

        holder.picNama.setText(mPicNama.get(position));
        holder.nim.setText(mNim.get(position));
        holder.Nohp.setText(mNohp.get(position));
        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: clicked on: " + mPicNama.get(position));
                Toast.makeText(mContext, mPicNama.get(position), Toast.LENGTH_SHORT).show();

                Intent intent = new  Intent(mContext, detailActivity.class);
                intent.putExtra("pic_url", mPic.get(position));
                intent.putExtra("pic_name", mPicNama.get(position));
                intent.putExtra("nimm",mNim.get(position));
                intent.putExtra("nohps", mNohp.get(position));
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mPicNama.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        CircleImageView pic;
        TextView picNama;
        TextView nim;
        TextView Nohp;
        RelativeLayout parentLayout;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            pic = itemView.findViewById(R.id.pic);
            picNama = itemView.findViewById(R.id.pic_nama);
            nim = itemView.findViewById(R.id.nim);
            Nohp = itemView.findViewById(R.id.nohp);
            parentLayout = itemView.findViewById(R.id.parent_layout);
        }
    }
}
