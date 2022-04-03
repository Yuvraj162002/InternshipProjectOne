package com.ecommerce.android.internshipprojectone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebActivity extends AppCompatActivity {
    private WebView mywebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        mywebView = (WebView) findViewById(R.id.webview);
        WebSettings webSettings= mywebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mywebView.loadUrl("https://erishikul.com/mittsure/alian-mcq-1/start.html");
        mywebView.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed() {
        if(mywebView.canGoBack())
        {
            mywebView.goBack();
        }

        else
        {
            super.onBackPressed();
        }
    }
    }
