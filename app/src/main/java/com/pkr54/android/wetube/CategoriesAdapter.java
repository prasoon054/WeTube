package com.pkr54.android.wetube;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CategoriesAdapter extends RecyclerView.Adapter<CategoriesAdapter.ViewHolder> {

    private List<Categories> mCategoriesClassList;
    private Context context;

    public CategoriesAdapter(List<Categories> categoriesClassList, Context context) {
        this.mCategoriesClassList = categoriesClassList;
        this.context = context;
    }

    @NonNull
    @Override
    public CategoriesAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.parent_list, null, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoriesAdapter.ViewHolder holder, int position) {
        holder.mTitle.setText(mCategoriesClassList.get(position).getTitle());
        PhotoAdapter mPhotoAdapter;
        mPhotoAdapter=new PhotoAdapter(mCategoriesClassList.get(position).getPhotoList(), context);
        holder.mCategoriesRecyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        holder.mCategoriesRecyclerView.setAdapter(mPhotoAdapter);
        mPhotoAdapter.notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return mCategoriesClassList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        RecyclerView mCategoriesRecyclerView;
        TextView mTitle;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mTitle=(TextView) itemView.findViewById(R.id.photo_title);
            mCategoriesRecyclerView=itemView.findViewById(R.id.photo_child);
        }
    }
}
