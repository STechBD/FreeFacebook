package net.STechBD.FreeFacebook;

import adrt.ADRTLogCatReader;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
/* loaded from: classes.dex */
public class options extends Activity {
    private Button AAShemul;
    private Button about;
    private Button changeLog;
    private Button contact;
    private Button help;
    private Button update;
    private Button website;

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        ADRTLogCatReader.onContext(this, "com.aide.ui");
        super.onCreate(bundle);
        setContentView(R.layout.options);
        getIntent().getStringExtra("domain");
        this.AAShemul = (Button) findViewById(R.id.developer);
        this.about = (Button) findViewById(R.id.about);
        this.help = (Button) findViewById(R.id.help);
        this.contact = (Button) findViewById(R.id.contact);
        this.update = (Button) findViewById(R.id.update);
        this.website = (Button) findViewById(R.id.website);
        this.changeLog = (Button) findViewById(R.id.changeLog);
        this.AAShemul.setOnClickListener(new View.OnClickListener(this) { // from class: net.STechBD.FreeFacebook.options.100000000
            private final options this$0;

            {
                this.this$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                this.this$0.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.facebook.com/AAShemul")));
            }
        });
        this.about.setOnClickListener(new View.OnClickListener(this) { // from class: net.STechBD.FreeFacebook.options.100000001
            private final options this$0;

            {
                this.this$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    this.this$0.startActivity(new Intent(this.this$0, Class.forName("net.STechBD.FreeFacebook.about")));
                } catch (ClassNotFoundException e) {
                    throw new NoClassDefFoundError(e.getMessage());
                }
            }
        });
        this.help.setOnClickListener(new View.OnClickListener(this) { // from class: net.STechBD.FreeFacebook.options.100000002
            private final options this$0;

            {
                this.this$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                this.this$0.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.freefbapp.gq/help")));
            }
        });
        this.contact.setOnClickListener(new View.OnClickListener(this) { // from class: net.STechBD.FreeFacebook.options.100000003
            private final options this$0;

            {
                this.this$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                this.this$0.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.freefbapp.gq/contact")));
            }
        });
        this.update.setOnClickListener(new View.OnClickListener(this) { // from class: net.STechBD.FreeFacebook.options.100000004
            private final options this$0;

            {
                this.this$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                this.this$0.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.freefbapp.gq/update/1")));
            }
        });
        this.website.setOnClickListener(new View.OnClickListener(this) { // from class: net.STechBD.FreeFacebook.options.100000005
            private final options this$0;

            {
                this.this$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                this.this$0.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.freefbapp.gq")));
            }
        });
        this.changeLog.setOnClickListener(new View.OnClickListener(this) { // from class: net.STechBD.FreeFacebook.options.100000006
            private final options this$0;

            {
                this.this$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    this.this$0.startActivity(new Intent(this.this$0, Class.forName("net.STechBD.FreeFacebook.changeLog")));
                } catch (ClassNotFoundException e) {
                    throw new NoClassDefFoundError(e.getMessage());
                }
            }
        });
    }
}
