package com.csi_bkbiet;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by guysapp on 1/9/17.
 */

public class Frag_home extends android.support.v4.app.Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View inf = inflater.inflate(R.layout.frag_home, container, false);
        TextView tv = (TextView) inf.findViewById(R.id.textView);
        tv.setText("New text");
        return inf;


    }


}
