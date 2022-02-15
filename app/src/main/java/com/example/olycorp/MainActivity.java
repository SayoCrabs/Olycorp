package com.example.olycorp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView video = findViewById(R.id.background);
        video.start();

        Uri uri = Uri.parse("https://file-examples-com.github.io/uploads/2017/04/file_example_MP4_640_3MG.mp4");
        video.setVideoURI(uri);
    }

    public void OnBtnVisit(View v)
    {
        Intent credit = new Intent(this, ToVisit.class);
        startActivity(credit);
    }

}