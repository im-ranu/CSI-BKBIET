package com.csi_bkbiet;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by guysapp on 1/9/17.
 */

public class Frag_notification extends android.support.v4.app.Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View inf = inflater.inflate(R.layout.frag_notification, container, false);
        TextView tv = (TextView) inf.findViewById(R.id.textView);
        tv.setText("New Notification");

        return inf;

    }
}
