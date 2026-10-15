package com.dcg0.dcvswiz;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.view.Window;

public class MainActivity extends Activity {
  @Override public void onCreate(Bundle state) {
    super.onCreate(state);
    requestWindowFeature(Window.FEATURE_NO_TITLE);
    WebView view = new WebView(this);
    view.setWebViewClient(new WebViewClient());
    WebSettings settings = view.getSettings();
    settings.setJavaScriptEnabled(true);
    settings.setDomStorageEnabled(true);
    settings.setAllowFileAccess(true);
    settings.setAllowContentAccess(true);
    settings.setMediaPlaybackRequiresUserGesture(false);
    view.setOverScrollMode(WebView.OVER_SCROLL_NEVER);
    view.loadUrl("file:///android_asset/game.html");
    setContentView(view);
  }
  @Override public void onBackPressed() { super.onBackPressed(); }
}
