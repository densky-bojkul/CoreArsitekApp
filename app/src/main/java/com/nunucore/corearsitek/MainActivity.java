package com.nunucore.corearsitek;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        webView = new WebView(this);
        setContentView(webView);

        // Konfigurasi WebView
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);      // Aktifkan JS
        webSettings.setDomStorageEnabled(true);      // Aktifkan DOM Storage
        webSettings.setUseWideViewPort(true);
        webSettings.setLoadWithOverviewMode(true);

        // Biar link tetap di app, bukan ke browser eksternal
        webView.setWebViewClient(new WebViewClient());

        // Load URL kamu
        webView.loadUrl("https://corearsitek.id/");
    }

    @Override
    public void onBackPressed() {
        // Kalau bisa back di WebView, jangan keluar dulu
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
