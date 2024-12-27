package app.my.pmobile2024_3_21311008_royhannasrul;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void menuAlamat(View view) {
        Intent intent = new Intent(this, alamat.class);
        startActivity(intent);
    }

    public void menuWebsite(View view) {
        Intent intent = new Intent(this, website.class);
        startActivity(intent);
    }

    public void menuVideo(View view) {
        Intent intent = new Intent(this, video.class);
        startActivity(intent);
    }
}
