package com.technoabinash.navigationdrawernewsapp.controller;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebviewController extends WebViewClient {
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String request) {
        view.loadUrl(request);
        return true;
    }
}
