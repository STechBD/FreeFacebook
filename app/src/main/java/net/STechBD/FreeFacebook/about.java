package net.STechBD.FreeFacebook;

import adrt.ADRTLogCatReader;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
/* loaded from: classes.dex */
public class about extends Activity {
    private Button AAShemul;
    private Button STechBD;

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        ADRTLogCatReader.onContext(this, "com.aide.ui");
        super.onCreate(bundle);
        setContentView(R.layout.about);
        this.STechBD = (Button) findViewById(R.id.STechBD);
        this.AAShemul = (Button) findViewById(R.id.AAShemul);
        this.STechBD.setOnClickListener(new View.OnClickListener(this) { // from class: net.STechBD.FreeFacebook.about.100000000
            private final about this$0;

            {
                this.this$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                this.this$0.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.STechBD.Net")));
            }
        });
        this.AAShemul.setOnClickListener(new View.OnClickListener(this) { // from class: net.STechBD.FreeFacebook.about.100000001
            private final about this$0;

            {
                this.this$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                this.this$0.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.facebook.com/aashemul")));
            }
        });
    }
}
