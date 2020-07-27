package com.diogopinto.mvvmrecyclerview.adapters;

import android.content.Context;
import android.media.Image;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.diogopinto.mvvmrecyclerview.R;
import com.diogopinto.mvvmrecyclerview.models.NicePlace;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

    private ArrayList<NicePlace> nicePlaces;
    private Context mContext;

    public RecyclerAdapter(Context mContext, ArrayList<NicePlace> nicePlaces) {
        this.nicePlaces = nicePlaces;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_listitem,
                parent,
                false);

        MyViewHolder viewHolder = new MyViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Log.i("lista", "Entrei em onBindViewHolder");

        Glide.with(mContext)
                .asBitmap()
                .load(nicePlaces.get(position).getImageUrl())
                .placeholder(R.drawable.ic_launcher_background)
                .into(holder.imageViewNicePlace);

        holder.textViewNameNicePlace.setText(nicePlaces.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return nicePlaces.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        public ImageView imageViewNicePlace;
        public TextView textViewNameNicePlace;

        public MyViewHolder(View itemView) {
            super(itemView);

            imageViewNicePlace = itemView.findViewById(R.id.imageViewNicePlace);
            textViewNameNicePlace = itemView.findViewById(R.id.nameNicePlace);;
        }
    }
}


