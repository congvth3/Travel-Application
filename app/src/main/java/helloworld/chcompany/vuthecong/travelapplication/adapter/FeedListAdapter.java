package helloworld.chcompany.vuthecong.travelapplication.adapter;

import helloworld.chcompany.vuthecong.travelapplication.FeedImageView;
//import helloworld.chcompany.vuthecong.travelapplication.R;
import helloworld.chcompany.vuthecong.travelapplication.R;
import helloworld.chcompany.vuthecong.travelapplication.app.AppController;
import helloworld.chcompany.vuthecong.travelapplication.data.FeedItem;

import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.text.Html;
import android.text.TextUtils;

import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.android.volley.toolbox.ImageLoader;
//import com.android.volley.toolbox.NetworkImageView;

/**
 * Created by vuthecong on 2/25/16.
 */
public class FeedListAdapter extends BaseAdapter {
    private Activity activity;
    private LayoutInflater inflater;
    private List<FeedItem> feedItems;
    ImageLoader imageLoader = AppController.getInstance().getImageLoader();

    public FeedListAdapter(Activity activity, List<FeedItem> feedItems) {
        this.activity = activity;
        this.feedItems = feedItems;
    }

    @Override
    public int getCount() {
        return feedItems.size();
    }

    @Override
    public Object getItem(int location) {
        return feedItems.get(location);
    }

    @Override
    public long getItemId(int position){
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (inflater == null)
            inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null)
            convertView = inflater.inflate(R.layout.feed_item_list_location, null);
        if (imageLoader == null)
            imageLoader = AppController.getInstance().getImageLoader();

        TextView name = (TextView) convertView.findViewById(R.id.name);
        TextView statusMsg = (TextView) convertView.findViewById(R.id.txtStatusMsg);
        TextView url = (TextView) convertView.findViewById(R.id.txtUrl);
        FeedImageView feedImageView = (FeedImageView) convertView.findViewById(R.id.feedImage1);

        FeedItem item = feedItems.get(position);
        name.setText(item.getName());

        //Check for empty status massage
        if (!TextUtils.isEmpty(item.getStatus())) {
            statusMsg.setText(item.getStatus());
            statusMsg.setVisibility(View.VISIBLE);
        } else {
            // Status is empty, remove from view
            statusMsg.setVisibility(View.GONE);
        }

        //Checking for null feed Url
        if (item.getUrl() != null) {
            url.setText(Html.fromHtml("<a href =\"" + item.getUrl() + "\">" + item.getUrl() + "</a>"));
            // Making Url clickable
            url.setMovementMethod(LinkMovementMethod.getInstance());
            url.setVisibility(View.VISIBLE);
        } else {
            // Url is null, remove from the view
            url.setVisibility(View.GONE);
        }
        if (item.getImage() != null) {
            feedImageView.setImageUrl(item.getImage(), imageLoader);
            feedImageView.setVisibility(View.VISIBLE);
            feedImageView.setResponObserver(new FeedImageView.ResponObserver() {
                @Override
                public void onError() {
                }

                public void onSuccess() {
                }
            });
        } else {
            feedImageView.setVisibility(View.GONE);
        }
        return convertView;

    }
}
