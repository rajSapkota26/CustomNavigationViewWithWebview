package com.technoabinash.navigationdrawernewsapp.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.technoabinash.navigationdrawernewsapp.R;
import com.technoabinash.navigationdrawernewsapp.controller.WebviewController;


public class FoxnewsFragment extends Fragment {
WebView webView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root=inflater.inflate(R.layout.fragment_foxnews, container, false);
        webView = root.findViewById(R.id.fox_webview);
        webView.loadUrl("https://gorkhapatraonline.com/");
        webView.setWebViewClient(new WebviewController());
        return root;
    }
}