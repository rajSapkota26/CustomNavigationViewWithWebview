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

public class AlJazeeraFragment extends Fragment {
WebView webView;

    public View onCreateView(@NonNull LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {
///
        View root = inflater.inflate(R.layout.aljazera_fragment, container, false);
        webView = root.findViewById(R.id.alj_webview);
        webView.loadUrl("https://ekantipur.com");
        webView.setWebViewClient(new WebviewController());
        return root;
    }
}