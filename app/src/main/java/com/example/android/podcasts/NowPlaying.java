package com.example.android.podcasts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.android.podcasts.MainActivity.KEY_PODCAST_TITLE;
import static com.example.android.podcasts.MainActivity.KEY_PODCAST_AUTHOR;

public class NowPlaying extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        // initializing placeholder String variables for the data passed from clicked podcast
        String nowPlayingTitle = null;
        String nowPlayingAuthor = null;

        // retrieving the values passed in the intent from the Main Activity
        Intent intent = getIntent();
        if (null != intent) {
            nowPlayingTitle = intent.getStringExtra(KEY_PODCAST_TITLE);
            nowPlayingAuthor = intent.getStringExtra(KEY_PODCAST_AUTHOR);
        }

        // set podcast title
        TextView nowPlayingPodcastTitle = findViewById(R.id.now_playing_title);
        nowPlayingPodcastTitle.setText(nowPlayingTitle);

        // set podcast author
        TextView nowPlayingPodcastAuthor = findViewById(R.id.now_playing_author);
        nowPlayingPodcastAuthor.setText(nowPlayingAuthor);

        // assign Button variables for each of the playback buttons
        Button rewindButton = findViewById(R.id.rewind_button);
        Button pauseButton = findViewById(R.id.pause_button);
        Button forwardButton = findViewById(R.id.fastfoward_button);

        // click listeners for playback buttons
        rewindButton.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(NowPlaying.this, R.string.toast_text_rewind_button, Toast.LENGTH_LONG).show();
            }
        });

        pauseButton.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(NowPlaying.this, R.string.toast_test_pause_button, Toast.LENGTH_LONG).show();
            }
        });

        forwardButton.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(NowPlaying.this, R.string.toast_text_forward_button, Toast.LENGTH_LONG).show();
            }
        });


    }
}
