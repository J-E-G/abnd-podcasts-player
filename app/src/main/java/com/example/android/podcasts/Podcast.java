package com.example.android.podcasts;

public class Podcast {

    private String mPodcastTitle;
    private String mPodcastAuthor;

    public Podcast(String podcastTitle, String podcastAuthor) {
        mPodcastTitle = podcastTitle;
        mPodcastAuthor = podcastAuthor;
    }

    public String getPodcastTitle() {
        return mPodcastTitle;
    }

    public String getPodcastAuthor() {
        return mPodcastAuthor;
    }
}
