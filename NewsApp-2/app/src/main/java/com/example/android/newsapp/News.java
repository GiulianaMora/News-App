package com.example.android.newsapp;

public class News {
    private String mTitle;
    private String mAuthor;
    private String mSection;
    private String mDate;
    private String mUrl;

    public News(String title, String section, String author, String date, String url) {
        mTitle = title;
        mAuthor = author;
        mSection = section;
        mDate = date;
        mUrl = url;
    }

    /**
     * Returns the Title of the feed news.
     */
    public String getTitle() {
        return mTitle;
    }

    /**
     * Returns the Author name of the feed news.
     */
    public String getAuthor() {return mAuthor;}

    /**
     * Returns the Section of the feed news.
     */
    public String getSection() {
        return mSection;
    }


    /**
     * Returns the date of the feed news.
     */
    public String getDate() {
        return mDate;
    }

    /**
     * Returns the URL of the feed news.
     */
    public String getUrl() {
        return mUrl;
    }
}