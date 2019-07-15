package com.example.alc4phase1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class about_alc extends AppCompatActivity {
    public WebView webView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);
        WebView webView1=(WebView)findViewById(R.id.webView1);
        webView1.loadUrl("http://andela.com/alc/");
    }


}
