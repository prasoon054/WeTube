package com.pkr54.android.wetube;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private CategoriesAdapter mCategoriesAdapter;
    private ArrayList<Categories> mCategoriesArrayList;
    private ArrayList<String> mFollowingNames;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView=findViewById(R.id.parent_view);
        mFollowingNames=getFollowingNames();
        mCategoriesArrayList=new ArrayList<>();
        int mFollowing=getNumberOfFollowing();
        for(int i=0; i<mFollowing; i++){
            ArrayList<Photo> currAccount=new ArrayList<>();
            int totalPhotos=Math.min(10, getPostCount());
            for(int j=0; j<totalPhotos; j++){
        /*
            Won't be used in later stage as we would we fetching photos from api so
            hardcoding all the image resources id
            Also always taking totalPhotos=10 and mFollowing=5
         */
                if(i==0){
                    switch(j){
                        case 0:
                            currAccount.add(new Photo(R.drawable.p00));
                            break;
                        case 1:
                            currAccount.add(new Photo(R.drawable.p01));
                            break;
                        case 2:
                            currAccount.add(new Photo(R.drawable.p02));
                            break;
                        case 3:
                            currAccount.add(new Photo(R.drawable.p03));
                            break;
                        case 4:
                            currAccount.add(new Photo(R.drawable.p04));
                            break;
                        case 5:
                            currAccount.add(new Photo(R.drawable.p05));
                            break;
                        case 6:
                            currAccount.add(new Photo(R.drawable.p06));
                            break;
                        case 7:
                            currAccount.add(new Photo(R.drawable.p07));
                            break;
                        case 8:
                            currAccount.add(new Photo(R.drawable.p08));
                            break;
                        case 9:
                            currAccount.add(new Photo(R.drawable.p09));
                            break;
                    }
                }
                else if(i==1){
                    switch(j){
                        case 0:
                            currAccount.add(new Photo(R.drawable.p10));
                            break;
                        case 1:
                            currAccount.add(new Photo(R.drawable.p11));
                            break;
                        case 2:
                            currAccount.add(new Photo(R.drawable.p12));
                            break;
                        case 3:
                            currAccount.add(new Photo(R.drawable.p13));
                            break;
                        case 4:
                            currAccount.add(new Photo(R.drawable.p14));
                            break;
                        case 5:
                            currAccount.add(new Photo(R.drawable.p15));
                            break;
                        case 6:
                            currAccount.add(new Photo(R.drawable.p16));
                            break;
                        case 7:
                            currAccount.add(new Photo(R.drawable.p17));
                            break;
                        case 8:
                            currAccount.add(new Photo(R.drawable.p18));
                            break;
                        case 9:
                            currAccount.add(new Photo(R.drawable.p19));
                            break;
                    }
                }
                else if(i==2){
                    switch(j){
                        case 0:
                            currAccount.add(new Photo(R.drawable.p20));
                            break;
                        case 1:
                            currAccount.add(new Photo(R.drawable.p21));
                            break;
                        case 2:
                            currAccount.add(new Photo(R.drawable.p22));
                            break;
                        case 3:
                            currAccount.add(new Photo(R.drawable.p23));
                            break;
                        case 4:
                            currAccount.add(new Photo(R.drawable.p24));
                            break;
                        case 5:
                            currAccount.add(new Photo(R.drawable.p25));
                            break;
                        case 6:
                            currAccount.add(new Photo(R.drawable.p26));
                            break;
                        case 7:
                            currAccount.add(new Photo(R.drawable.p27));
                            break;
                        case 8:
                            currAccount.add(new Photo(R.drawable.p28));
                            break;
                        case 9:
                            currAccount.add(new Photo(R.drawable.p29));
                            break;
                    }
                }
                else if(i==3){
                    switch(j){
                        case 0:
                            currAccount.add(new Photo(R.drawable.p30));
                            break;
                        case 1:
                            currAccount.add(new Photo(R.drawable.p31));
                            break;
                        case 2:
                            currAccount.add(new Photo(R.drawable.p32));
                            break;
                        case 3:
                            currAccount.add(new Photo(R.drawable.p33));
                            break;
                        case 4:
                            currAccount.add(new Photo(R.drawable.p34));
                            break;
                        case 5:
                            currAccount.add(new Photo(R.drawable.p35));
                            break;
                        case 6:
                            currAccount.add(new Photo(R.drawable.p36));
                            break;
                        case 7:
                            currAccount.add(new Photo(R.drawable.p37));
                            break;
                        case 8:
                            currAccount.add(new Photo(R.drawable.p38));
                            break;
                        case 9:
                            currAccount.add(new Photo(R.drawable.p39));
                            break;
                    }
                }
                else if(i==4){
                    switch(j){
                        case 0:
                            currAccount.add(new Photo(R.drawable.p40));
                            break;
                        case 1:
                            currAccount.add(new Photo(R.drawable.p41));
                            break;
                        case 2:
                            currAccount.add(new Photo(R.drawable.p42));
                            break;
                        case 3:
                            currAccount.add(new Photo(R.drawable.p43));
                            break;
                        case 4:
                            currAccount.add(new Photo(R.drawable.p44));
                            break;
                        case 5:
                            currAccount.add(new Photo(R.drawable.p45));
                            break;
                        case 6:
                            currAccount.add(new Photo(R.drawable.p46));
                            break;
                        case 7:
                            currAccount.add(new Photo(R.drawable.p47));
                            break;
                        case 8:
                            currAccount.add(new Photo(R.drawable.p48));
                            break;
                        case 9:
                            currAccount.add(new Photo(R.drawable.p49));
                            break;
                    }
                }
                // Completed
            }
            mCategoriesArrayList.add(new Categories(mFollowingNames.get(i), currAccount));
        }
        mCategoriesAdapter=new CategoriesAdapter(mCategoriesArrayList, MainActivity.this);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(mCategoriesAdapter);
        mCategoriesAdapter.notifyDataSetChanged();
    }

    private int getNumberOfFollowing(){
        /*
        Will be used at a later stage to find the number of following of the current account.
        Basically we will be showing the latest 10 posts from the account we follow
        */
        return 5;
    }

    private int getPostCount(){
        /*
        Will be used at a later stage to find the count of posts of a specific account.
        */
        return 11;
    }

    private ArrayList<String> getFollowingNames(){
        /*
            Will be used at later stage to get name of followers
         */
        ArrayList<String> following=new ArrayList<>();
        following.add("Cristiano Ronaldo");
        following.add("Lionel Messi");
        following.add("Kylian Mbappe");
        following.add("Erling Haaland");
        following.add("Paul Pogba");
        return following;
    }
}
