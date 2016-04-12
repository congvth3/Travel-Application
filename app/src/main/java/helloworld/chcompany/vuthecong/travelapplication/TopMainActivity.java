package helloworld.chcompany.vuthecong.travelapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import helloworld.chcompany.vuthecong.travelapplication.adapter.CustomListAdapter;
import helloworld.chcompany.vuthecong.travelapplication.model.Location;

/**
 * Created by vuthecong on 1/31/16.
 */
public class TopMainActivity extends Activity {
    // Log tag
    private static final String TAG = TopMainActivity.class.getSimpleName();

    private List<Location> locationList = new ArrayList<Location>();
    private ListView listView;
    private CustomListAdapter adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.top_main);

        listView = (ListView)findViewById(R.id.list);
        adapter = new CustomListAdapter(this, locationList);
        listView.setAdapter(adapter);

    }
}
