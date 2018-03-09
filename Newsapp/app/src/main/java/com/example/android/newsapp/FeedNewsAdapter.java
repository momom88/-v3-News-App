package com.example.android.newsapp;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.android.newsapp.FeedNews;
import com.example.android.newsapp.R;

import java.util.Date;
import java.util.List;

public class FeedNewsAdapter extends ArrayAdapter<FeedNews> {
    public FeedNewsAdapter(Context context, List<FeedNews> earthquakes) {
        super(context, 0, earthquakes);
    }

    /**
     * Returns a list item view that displays information about the feed news at the given position
     * in the list of feeds news.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.feed_news_list_item, parent, false);
        }
        // Find the feed news at the given position in the list of feed news
        FeedNews currentFeedNews = getItem(position);

        // Find the TextView with view ID Title ,
        //Display the Title of the current feed news in that TextView
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title);
        // Display the Title of the current feed news in that TextView
        titleTextView.setText(currentFeedNews.getTitle());
        // Find the TextView with view ID Title ,
        //Display the Author of the current feed news in that TextView
        TextView authorTextView = (TextView) listItemView.findViewById(R.id.author);
        authorTextView.setText(currentFeedNews.getSectionName());
        // Find the TextView with view ID Title ,
        //Display the Date of the current feed news in that TextView
        TextView dateTextView = (TextView) listItemView.findViewById(R.id.date);
        dateTextView.setText(currentFeedNews.getDate());
        // Find the TextView with view ID Title ,
        //Display the Section of the current feed news in that TextView
        TextView sectionTextView = (TextView) listItemView.findViewById(R.id.section);
        sectionTextView.setText(currentFeedNews.getSectionName());

        // Return the list item view that is now showing the appropriate data
        return listItemView;
    }
}
