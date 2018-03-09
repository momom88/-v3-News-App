package com.example.android.newsapp;

public class FeedNews {
    private String mTitle;
    private String mSectionName;
    private String mDate;
    private String mUrl;

    public FeedNews(String title, String sectionName, String date, String url) {
        mTitle = title;
        mSectionName = sectionName;
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
     * Returns the SectionName of the feed news.
     */
    public String getSectionName() {
        return mSectionName;
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
