package net.STechBD.FreeFacebook;

import adrt.ADRTLogCatReader;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;
import android.widget.ProgressBar;
/* loaded from: classes.dex */
public class AAShemul extends Activity {
    private WebView AAShemul;
    private ProgressBar loader;
    private String osVersion = Build.VERSION.RELEASE;
    private String build = Build.DISPLAY;
    private String model = Build.MODEL;

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        ADRTLogCatReader.onContext(this, "com.aide.ui");
        super.onCreate(bundle);
        setContentView(R.layout.aashemul);
        this.AAShemul = (WebView) findViewById(R.id.AAShemul);
        this.loader = (ProgressBar) findViewById(R.id.loader);
        WebSettings settings = this.AAShemul.getSettings();
        settings.setLoadsImagesAutomatically(true);
        settings.setJavaScriptEnabled(true);
        settings.setSavePassword(true);
        settings.setUseWideViewPort(true);
        settings.setAllowFileAccess(true);
        settings.setAllowContentAccess(true);
        settings.setAllowFileAccessFromFileURLs(true);
        settings.setAllowUniversalAccessFromFileURLs(true);
        settings.setAppCacheEnabled(true);
        settings.setGeolocationEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setUserAgentString(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("Mozilla/5.0 (Linux; Android ").append(this.osVersion).toString()).append("; en-US; ").toString()).append(this.model).toString()).append(" Build/").toString()).append(this.build).toString()).append(") FreeFacebookByAAShemul/1.0").toString());
        this.AAShemul.setWebViewClient(new AAShemulBrowser(this));
        this.AAShemul.loadUrl("https://0.facebook.com");
        ImageButton imageButton = (ImageButton) findViewById(R.id.feed);
        ImageButton imageButton2 = (ImageButton) findViewById(R.id.messages);
        ImageButton imageButton3 = (ImageButton) findViewById(R.id.friends);
        ImageButton imageButton4 = (ImageButton) findViewById(R.id.notifications);
        ImageButton imageButton5 = (ImageButton) findViewById(R.id.fbmenu);
        ImageButton imageButton6 = (ImageButton) findViewById(R.id.back);
        ImageButton imageButton7 = (ImageButton) findViewById(R.id.forward);
        ImageButton imageButton8 = (ImageButton) findViewById(R.id.menu);
        ImageButton imageButton9 = (ImageButton) findViewById(R.id.reload);
        ImageButton imageButton10 = (ImageButton) findViewById(R.id.cancel);
        imageButton.setOnClickListener(new View.OnClickListener(this) { // from class: net.STechBD.FreeFacebook.AAShemul.100000000
            private final AAShemul this$0;

            {
                this.this$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                this.this$0.AAShemul.loadUrl(new StringBuffer().append("https://").append(Uri.parse(this.this$0.AAShemul.getUrl()).getHost()).toString());
            }
        });
        imageButton2.setOnClickListener(new View.OnClickListener(this) { // from class: net.STechBD.FreeFacebook.AAShemul.100000001
            private final AAShemul this$0;

            {
                this.this$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                this.this$0.AAShemul.loadUrl(new StringBuffer().append(new StringBuffer().append("https://").append(Uri.parse(this.this$0.AAShemul.getUrl()).getHost()).toString()).append("/messages/?").toString());
            }
        });
        imageButton3.setOnClickListener(new View.OnClickListener(this) { // from class: net.STechBD.FreeFacebook.AAShemul.100000002
            private final AAShemul this$0;

            {
                this.this$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                this.this$0.AAShemul.loadUrl(new StringBuffer().append(new StringBuffer().append("https://").append(Uri.parse(this.this$0.AAShemul.getUrl()).getHost()).toString()).append("/friends/center/mbasic/?").toString());
            }
        });
        imageButton4.setOnClickListener(new View.OnClickListener(this) { // from class: net.STechBD.FreeFacebook.AAShemul.100000003
            private final AAShemul this$0;

            {
                this.this$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                this.this$0.AAShemul.loadUrl(new StringBuffer().append(new StringBuffer().append("https://").append(Uri.parse(this.this$0.AAShemul.getUrl()).getHost()).toString()).append("/notifications.php?").toString());
            }
        });
        imageButton5.setOnClickListener(new View.OnClickListener(this) { // from class: net.STechBD.FreeFacebook.AAShemul.100000004
            private final AAShemul this$0;

            {
                this.this$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                this.this$0.AAShemul.loadUrl(new StringBuffer().append(new StringBuffer().append("https://").append(Uri.parse(this.this$0.AAShemul.getUrl()).getHost()).toString()).append("/menu/bookmarks/?").toString());
            }
        });
        imageButton6.setOnClickListener(new View.OnClickListener(this) { // from class: net.STechBD.FreeFacebook.AAShemul.100000005
            private final AAShemul this$0;

            {
                this.this$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                this.this$0.AAShemul.goBack();
            }
        });
        imageButton7.setOnClickListener(new View.OnClickListener(this) { // from class: net.STechBD.FreeFacebook.AAShemul.100000006
            private final AAShemul this$0;

            {
                this.this$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                this.this$0.AAShemul.goForward();
            }
        });
        imageButton8.setOnClickListener(new View.OnClickListener(this) { // from class: net.STechBD.FreeFacebook.AAShemul.100000007
            private final AAShemul this$0;

            {
                this.this$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                String host = Uri.parse(this.this$0.AAShemul.getUrl()).getHost();
                try {
                    Intent intent = new Intent(this.this$0.getApplicationContext(), Class.forName("net.STechBD.FreeFacebook.options"));
                    intent.putExtra("domain", host);
                    this.this$0.startActivity(intent);
                } catch (ClassNotFoundException e) {
                    throw new NoClassDefFoundError(e.getMessage());
                }
            }
        });
        imageButton9.setOnClickListener(new View.OnClickListener(this) { // from class: net.STechBD.FreeFacebook.AAShemul.100000008
            private final AAShemul this$0;

            {
                this.this$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                this.this$0.AAShemul.reload();
            }
        });
        imageButton10.setOnClickListener(new View.OnClickListener(this) { // from class: net.STechBD.FreeFacebook.AAShemul.100000009
            private final AAShemul this$0;

            {
                this.this$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                this.this$0.AAShemul.stopLoading();
            }
        });
        ((ImageButton) findViewById(R.id.exit)).setOnClickListener(new View.OnClickListener(this) { // from class: net.STechBD.FreeFacebook.AAShemul.100000010
            private final AAShemul this$0;

            {
                this.this$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                this.this$0.finish();
            }
        });
    }

    /* loaded from: classes.dex */
    private class AAShemulBrowser extends WebViewClient {
        private final AAShemul this$0;

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (!Uri.parse(str).getHost().equals("0.facebook.com") && !Uri.parse(str).getHost().equals("free.facebook.com") && !Uri.parse(str).getHost().equals("h.facebook.com")) {
                this.this$0.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                return true;
            }
            return false;
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            this.this$0.loader.setVisibility(0);
            ((ImageButton) this.this$0.findViewById(R.id.reload)).setVisibility(8);
            ((ImageButton) this.this$0.findViewById(R.id.cancel)).setVisibility(0);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            this.this$0.loader.setVisibility(8);
            ((ImageButton) this.this$0.findViewById(R.id.reload)).setVisibility(0);
            ((ImageButton) this.this$0.findViewById(R.id.cancel)).setVisibility(8);
        }

        public AAShemulBrowser(AAShemul aAShemul) {
            this.this$0 = aAShemul;
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        this.AAShemul = (WebView) findViewById(R.id.AAShemul);
        if (i != 4 || !this.AAShemul.canGoBack()) {
            return super.onKeyDown(i, keyEvent);
        }
        this.AAShemul.goBack();
        return true;
    }
}
