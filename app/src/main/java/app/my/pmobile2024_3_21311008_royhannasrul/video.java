package app.my.pmobile2024_3_21311008_royhannasrul;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class video extends AppCompatActivity {

    MediaController mediaController;
    DisplayMetrics displayMetrics;
    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        // Views
        videoView = findViewById(R.id.vdvsaya);

        // Media Controller
        mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);

        // Display Metrics
        displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int height = displayMetrics.heightPixels;
        int width = displayMetrics.widthPixels;

        // Minimum Lebar dan Tinggi pada Video View
        videoView.setMinimumWidth(width);
        videoView.setMinimumHeight(height);
    }

    // Metode untuk play video
    public void mainkanvideo(View view) {
        String videoPath = "android.resource://" + getPackageName() + "/raw/royhannasrulvid";
        videoView.setVideoPath(videoPath);
        videoView.start();
    }
}
