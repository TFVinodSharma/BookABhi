package tris.papa_applition;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class HalfAccountActivity extends AppCompatActivity implements View.OnClickListener {
    TextView Expert, Documents, Payments, Setting, Help, Suggestion, About, ShareAbhi, Signout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_half_account);
        Expert = findViewById(R.id.expertprofile);
        Documents = findViewById(R.id.documents);
        Payments = findViewById(R.id.payments);
        Setting = findViewById(R.id.settings);
        Help = findViewById(R.id.help);
        Suggestion = findViewById(R.id.suggestion);
        About = findViewById(R.id.about);
        ShareAbhi = findViewById(R.id.share);
        Signout = findViewById(R.id.signout);


        Expert.setOnClickListener(this);
        Documents.setOnClickListener(this);
        Payments.setOnClickListener(this);
        Setting.setOnClickListener(this);
        Help.setOnClickListener(this);
        Suggestion.setOnClickListener(this);
        About.setOnClickListener(this);
        ShareAbhi.setOnClickListener(this);
        Signout.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v == Expert) {
            Intent i = new Intent(this, ExpertProfile.class);
            startActivity(i);
                }
        else if (v == Documents)
        {
            Intent i = new Intent(this, Documents.class);
            startActivity(i);
        }

        else if (v == Payments)
        {
            Intent i = new Intent(this, Payment.class);
            startActivity(i);
        }

        else if (v == Setting)
        {
            Intent i = new Intent(this, Settings.class);
            startActivity(i);
        }
        else if (v == Help)
        {
            Intent i = new Intent(this, Help.class);
            startActivity(i);
        }
        else if (v == About)
        {
            Intent i = new Intent(this, About.class);
            startActivity(i);
        }

        else if (v==ShareAbhi )
        {
            Intent intent=new Intent();
            intent.setAction(Intent.ACTION_SEND);
            intent.putExtra(Intent.EXTRA_TEXT,"https://www.aadityajain.com/");
            intent.setType("text/plain");
            startActivity(Intent.createChooser(intent,"choose app to share link or text"));

        }
        else if (v == Signout)
        {
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
        }


    }
}
