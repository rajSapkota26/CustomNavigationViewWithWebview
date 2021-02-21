package com.technoabinash.navigationdrawernewsapp.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.technoabinash.navigationdrawernewsapp.R;
import com.technoabinash.navigationdrawernewsapp.controller.WebviewController;

public class CnnFragment extends Fragment {

WebView webView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_cnn, container, false);
        webView = root.findViewById(R.id.cnn_webview);
        webView.loadUrl("https://nagariknews.nagariknetwork.com/");
        webView.setWebViewClient(new WebviewController());
        return root;
    }
}