package helloworld.chcompany.vuthecong.travelapplication;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;

import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

/**
 * Created by vuthecong on 1/30/16.
 */


public class TabHostActivity extends TabActivity {

    @Override
    public void onCreate (Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main);
        TabHost tabHost = getTabHost();

        // Tab for Home
        TabSpec homeSpec = tabHost.newTabSpec("Home");
        // Setting Title and Icon for the tab
        homeSpec.setIndicator("",getResources().getDrawable(R.drawable.tab_home));
        Intent homeIntent = new Intent(this, NewFeed.class);
        homeSpec.setContent(homeIntent);

        // Tab for Map
        TabSpec mapSpec = tabHost.newTabSpec("Map");
        // Setting Title and Icon for the tab
        mapSpec.setIndicator("", getResources().getDrawable(R.drawable.tab_map));
        Intent mapIntent = new Intent(this, NearbyActivity.class);
        mapSpec.setContent(mapIntent);

        /*// Tab for List
        TabSpec listSpec = tabHost.newTabSpec("Travel");
        // Setting Title and Icon for the tab
        listSpec.setIndicator("", getResources().getDrawable(R.drawable.tab_list_location));
        Intent listIntent = new Intent(this, NewFeed.class);
        listSpec.setContent(listIntent);  */

        // Tab for Profile
        TabSpec profileSpec = tabHost.newTabSpec("Profile");
        // Setting Title and Icon for the tab
        profileSpec.setIndicator("", getResources().getDrawable(R.drawable.tab_profile));
        Intent profileIntent = new Intent(this, ProfileActivity.class);
        profileSpec.setContent(profileIntent);

        tabHost.addTab(homeSpec);
        tabHost.addTab(mapSpec);
        //tabHost.addTab(listSpec);
        tabHost.addTab(profileSpec);
    }
}
