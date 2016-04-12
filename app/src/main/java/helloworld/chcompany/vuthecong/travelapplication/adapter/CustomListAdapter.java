package helloworld.chcompany.vuthecong.travelapplication.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;
import java.util.Objects;

import helloworld.chcompany.vuthecong.travelapplication.R;
import helloworld.chcompany.vuthecong.travelapplication.model.Location;

/**
 * Created by vuthecong on 1/31/16.
 */
public class CustomListAdapter extends BaseAdapter {
    private Activity activity;
    private LayoutInflater inflater;
    private List<Location> locationsItem;

    public CustomListAdapter(Activity activity, List<Location> locationsItem) {
        this.activity = activity;
        this.locationsItem = locationsItem;
    }

    @Override
    public int getCount() {
        return locationsItem.size();
    }

    @Override
    public Object getItem(int local) {
        return locationsItem.get(local);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (inflater == null)
            inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null)
            convertView = inflater.inflate(R.layout.list_row_top, null);
    //    if (imageLoader)
        TextView title = (TextView) convertView.findViewById(R.id.title);
        TextView location = (TextView) convertView.findViewById(R.id.location);
        TextView rating = (TextView) convertView.findViewById(R.id.rating);

        // geting location dara for the row
        Location l = locationsItem.get(position);
        // get title
        title.setText(l.getTitle());
        // get rating
        rating.setText("Rating:" +String.valueOf(l.getRating()));
        return convertView;
    }

}
