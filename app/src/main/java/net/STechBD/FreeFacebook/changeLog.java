package net.STechBD.FreeFacebook;

import adrt.ADRTLogCatReader;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
/* loaded from: classes.dex */
public class changeLog extends Activity {
    private WebView changes;

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        ADRTLogCatReader.onContext(this, "com.aide.ui");
        super.onCreate(bundle);
        setContentView(R.layout.changelog);
        this.changes = (WebView) findViewById(R.id.changes);
        this.changes.loadUrl("file:///android_asset/changes.html");
    }
}
