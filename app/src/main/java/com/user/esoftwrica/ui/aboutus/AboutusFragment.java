package com.user.esoftwrica.ui.aboutus;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.user.esoftwrica.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AboutusFragment extends Fragment {


    public AboutusFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_aboutus, container, false);

        WebView myWebView = view.findViewById(R.id.webview);
        myWebView.loadUrl("https://softwarica.edu.np");

        //enable javascript setting
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setAppCacheEnabled(true);

        myWebView.setWebViewClient(new WebViewClient());


        return view;
    }

}
