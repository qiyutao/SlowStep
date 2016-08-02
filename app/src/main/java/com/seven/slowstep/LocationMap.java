package com.seven.slowstep;

import android.app.Activity;
import android.os.Bundle;

import com.baidu.mapapi.map.MapView;

/**
 * Created by seven on 02/08/16.
 */

public class LocationMap extends Activity {

    private MapView mMapView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.locationmap);
        mMapView = (MapView) findViewById(R.id.bmapView);
    }
}
