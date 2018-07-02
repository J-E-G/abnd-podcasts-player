package com.example.android.podcasts;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class PodcastAdapter extends ArrayAdapter<Podcast> {

    private static final String KEY_PODCAST_TITLE = "KEY_PODCAST_TITLE";
    private static final String KEY_PODCAST_AUTHOR = "KEY_PODCAST_AUTHOR";

    PodcastAdapter(Activity context, ArrayList<Podcast> songs) {
        super(context, 0, songs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        final Podcast currentPodcast = getItem(position);

        TextView songNameTextView = listItemView.findViewById(R.id.podcast_title);
        songNameTextView.setText(currentPodcast.getPodcastTitle());

        TextView songArtistNameTextView = listItemView.findViewById(R.id.podcast_author);
        songArtistNameTextView.setText(currentPodcast.getPodcastAuthor());

        // click listener, handling click events and loading intent extras based on selected podcast item
        listItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nowPlaying = new Intent(getContext(), NowPlaying.class);

                nowPlaying.putExtra(KEY_PODCAST_TITLE, currentPodcast.getPodcastTitle());
                nowPlaying.putExtra(KEY_PODCAST_AUTHOR, currentPodcast.getPodcastAuthor());

                getContext().startActivity(nowPlaying);

            }
        });

        return listItemView;


    }

}
