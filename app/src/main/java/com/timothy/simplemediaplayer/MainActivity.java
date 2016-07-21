package com.timothy.simplemediaplayer;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    private static final String URL = "http://techslides.com/demos/sample-videos/small.mp4";

    private VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Uri uri = Uri.parse(URL);

        videoView = (VideoView) findViewById(R.id.videoView);

        videoView.setVideoURI(uri);
        videoView.requestFocus();
        videoView.start();

    }
}
