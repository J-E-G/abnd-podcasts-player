package com.example.android.podcasts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static final String KEY_PODCAST_TITLE = "KEY_PODCAST_TITLE";
    public static final String KEY_PODCAST_AUTHOR = "KEY_PODCAST_AUTHOR";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Podcast> podcasts = new ArrayList<>();

        podcasts.add(new Podcast("Everything is Shade","The Read"));
        podcasts.add(new Podcast("Choose Financial Independence", "The Side Hustle Show"));
        podcasts.add(new Podcast("Two Days Later", "The Friend Zone"));
        podcasts.add(new Podcast("Everything is finite","Bodega Boys"));
        podcasts.add(new Podcast("d'Oh My Zsh", "The freeCodeCamp Podcast"));
        podcasts.add(new Podcast("gRPC on Android with Sam Bobra", "Fragmented - Android Developer Podcast"));
        podcasts.add(new Podcast("Episode 94: TV Time", "Android Developers Backstage"));
        podcasts.add(new Podcast("What's it like to be the CTO of Microsoft?", "CodeNewbie"));
        podcasts.add(new Podcast("Logarithm is gonna get you", "Base.cs Podcast"));
        podcasts.add(new Podcast("Days of Future_Open", "Command Line Heroes"));
        podcasts.add(new Podcast("Beychella", "The Read"));
        podcasts.add(new Podcast("The Passive Income Service Business", "The Side Hustle Show"));
        podcasts.add(new Podcast("Schoolin' Life", "The Friend Zone"));
        podcasts.add(new Podcast("Free Mero", "Bodega Boys"));
        podcasts.add(new Podcast("Explain Bitcoin like I'm 5", "The freeCodeCamp Podcast"));
        podcasts.add(new Podcast("Multi-Module Builds in Gradle","Fragmented - Android Developer Podcast"));
        podcasts.add(new Podcast("Episode 88: Autofill", "Android Developers Backstage"));
        podcasts.add(new Podcast("What happens in a technical interview?", "CodeNewbie"));
        podcasts.add(new Podcast("Let's get graphic", "Base.cs Podcast"));
        podcasts.add(new Podcast("The Agile_Revolution", "Command Line Heroes"));

        PodcastAdapter podcastAdapter = new PodcastAdapter(this, podcasts);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(podcastAdapter);

    }
}
