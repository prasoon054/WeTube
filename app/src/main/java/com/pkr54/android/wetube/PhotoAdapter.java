package com.pkr54.android.wetube;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PhotoAdapter extends RecyclerView.Adapter<PhotoAdapter.ViewHolder> {

    private List<Photo> mPhotoClassList;
    private Context context;

    public PhotoAdapter(List<Photo> photoClassList, Context context) {
        this.mPhotoClassList = photoClassList;
        this.context = context;
    }

    @NonNull
    @Override
    public PhotoAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.child_list, null, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PhotoAdapter.ViewHolder holder, int position) {
        holder.mImage.setImageResource(mPhotoClassList.get(position).getImageResId());
    }

    @Override
    public int getItemCount() {
        return mPhotoClassList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView mImage;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mImage=itemView.findViewById(R.id.shared_image_res);
        }
    }
}
