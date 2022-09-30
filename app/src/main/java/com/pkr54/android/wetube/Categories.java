package com.pkr54.android.wetube;

import java.util.List;

public class Categories {
    private String mTitle;
    private List<Photo> mPhotoList;

    public Categories(String title, List<Photo> photoList) {
        mTitle = title;
        mPhotoList = photoList;
    }
    public String getTitle(){
        return mTitle;
    }
    public List<Photo> getPhotoList(){
        return mPhotoList;
    }
}
