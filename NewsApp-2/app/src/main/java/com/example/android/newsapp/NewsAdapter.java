package com.example.android.newsapp;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * {@link NewsAdapter} knows how to create a list item layout for each article
 * in the data source (a list of {@link News} objects).
 *
 * These list item layouts will be provided to an adapter view like ListView
 * to be displayed to the user.
 */
public class NewsAdapter extends ArrayAdapter<News> {

    /**
     * Constructs a new {@link NewsAdapter}.
     *
     * @param context of the app
     * @param news is the list of news articles, which is the data source of the adapter
     */
    public NewsAdapter(Context context, List<News> news) {
        super(context, 0, news);
    }

    /**
     * Returns a list item view that displays information about the article at the given position
     * in the list of news.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Find the news article at the given position in the list of news
        News currentNews = getItem(position);

        // Find the TextView with view ID article_title
        TextView articleTitleView = listItemView.findViewById(R.id.title);

        // Display the title of the current article in that TextView
        articleTitleView.setText(currentNews.getTitle());

        // Find the TextView with the view ID article_author
        TextView articleAuthorView = listItemView.findViewById(R.id.author);

        // Display the author name of the current article in that TextView
        articleAuthorView.setText(currentNews.getAuthor());

        // Find the TextView with view ID article_section
        TextView articleSectionView = listItemView.findViewById(R.id.section);

        // Display the section of the current article in that TextView
        articleSectionView.setText(currentNews.getSection());

        // Find the TextView with view ID article_publish_date
        TextView articlePublishDateView = listItemView.findViewById(R.id.date);

        // Display the date of the current article in that TextView
        articlePublishDateView.setText(currentNews.getDate());

        // Return the list item view that is now showing the appropriate data
        return listItemView;
    }
}