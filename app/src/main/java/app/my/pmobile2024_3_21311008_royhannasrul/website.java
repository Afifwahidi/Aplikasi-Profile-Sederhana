package app.my.pmobile2024_3_21311008_royhannasrul;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class website extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_website);

        WebView myWebView = findViewById(R.id.web_uti);
        myWebView.setWebViewClient(new WebViewClient());
        myWebView.loadUrl("https://spada.teknokrat.ac.id/");
    }
}
