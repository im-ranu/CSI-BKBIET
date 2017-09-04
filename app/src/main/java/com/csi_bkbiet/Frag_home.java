package com.csi_bkbiet;

import android.app.Fragment;
import android.media.Image;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.squareup.picasso.MemoryPolicy;
import com.squareup.picasso.Picasso;

/**
 * Created by guysapp on 1/9/17.
 */

public class Frag_home extends android.support.v4.app.Fragment {


    View inf;
    public static ProgressBar progressBar;
    public static ImageView imageView;
    private StorageReference mStorageRef;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment



         inf = inflater.inflate(R.layout.frag_home, container, false);

        progressBar = (ProgressBar) inf.findViewById(R.id.progressBar2);


         imageView = (ImageView) inf.findViewById(R.id.frag_home_img1);

        new MyTask().execute();

        progressBar.setVisibility(View.GONE);


        return inf;


    }

    private class MyTask extends AsyncTask<Void, Void, Void> {
        @Override
        protected Void doInBackground(Void... voids) {



            mStorageRef = FirebaseStorage.getInstance().getReference();



            mStorageRef.child("home_banner/home_banner.webp").getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri) {
                    Picasso.with(getContext()).load(uri).placeholder(R.drawable.image_sample).memoryPolicy(MemoryPolicy.NO_CACHE).fit().into(imageView);
                }
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception exception) {
                    // Handle any errors
                }
            });
            return null;

        }

    }

}
