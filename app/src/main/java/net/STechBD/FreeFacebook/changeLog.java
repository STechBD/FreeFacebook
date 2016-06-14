package net.STechBD.FreeFacebook;

import adrt.ADRTLogCatReader;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
/* loaded from: classes.dex */
public class changeLog extends Activity {
    private WebView changes;
    private String html;

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        ADRTLogCatReader.onContext(this, "com.aide.ui");
        super.onCreate(bundle);
        setContentView(R.layout.changelog);
        this.changes = (WebView) findViewById(R.id.changes);
        this.html = "<font size=\"6\"><b>Change Log:</b></font><br><ul><b>Version 1.0.1:</b></ul><li>Added Change Log option.</li><li>Added option to go <b>Ashraful Alam Shemul</b>'s profile.</li><li>Fixed some bugs.</li>";
        this.changes.loadDataWithBaseURL(null, this.html, "text/html", "utf-8", null);
    }
}
