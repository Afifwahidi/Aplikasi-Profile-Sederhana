package app.my.pmobile2024_3_21311008_royhannasrul;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class alamat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alamat);
    }

    public void TampilPeta(View view) {
        Uri gmmIntentUri = Uri.parse("geo:0,0?q=Jalan Harapan Gang Sakura 78, Labuhan Ratu");

        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);

        mapIntent.setPackage("com.google.android.apps.maps");

        if (mapIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(mapIntent);
        } else {

            Uri mapStoreUri = Uri.parse("google.navigation:q=Jalan Harapan Gang Sakura 78 Labuhan Ratu Kota Bandar Lampung");
            Intent mapStoreIntent = new Intent(Intent.ACTION_VIEW, mapStoreUri);
            startActivity(mapStoreIntent);
        }
    }
}
