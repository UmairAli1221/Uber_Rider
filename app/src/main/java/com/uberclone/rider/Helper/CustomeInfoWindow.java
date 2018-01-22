package com.uberclone.rider.Helper;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;
import com.uberclone.rider.R;

/**
 * Created by Umair Ali on 1/17/2018.
 */

public class CustomeInfoWindow implements GoogleMap.InfoWindowAdapter {
    View myView;
    public CustomeInfoWindow(Context context){
        myView= LayoutInflater.from(context).inflate(R.layout.custome_rider_info_window,null);
    }
    @Override
    public View getInfoWindow(Marker marker) {
        TextView textPickUpTitile=(TextView)myView.findViewById(R.id.txtPickUpInfo);
        textPickUpTitile.setText(marker.getTitle());
        TextView textPickUpSnippet=(TextView)myView.findViewById(R.id.txtPickUpSnippet);
        textPickUpSnippet.setText(marker.getSnippet());
        return myView;
    }

    @Override
    public View getInfoContents(Marker marker) {
        return null;
    }
}
