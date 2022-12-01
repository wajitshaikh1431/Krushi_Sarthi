package www.wajit.krushisarthi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class smart_indian_agriculture_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smart_indian_agriculture);


        WebView webView = new WebView(this);
        setContentView(webView);
        webView.loadUrl("https://www.google.com");
    }
}