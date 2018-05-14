package tris.papa_applition;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ExpertProfile extends AppCompatActivity implements View.OnClickListener {
Button Edit1,Edit2,Edit3,Edit4,Edit5,Edit6,Edit7,Edit8;
TextView PreferredLang,ModeofLang,Describeyourself,Currentdoing
        ,Expertise,LifeAchievment,UploadVedio,AnyOther;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expert_profile);

        // find id's for textview

        PreferredLang=findViewById(R.id.prelang);
        ModeofLang=findViewById(R.id.inwhichmode);
        Describeyourself=findViewById(R.id.describeyourself);
        Currentdoing=findViewById(R.id.currentlydoing);
        Expertise=findViewById(R.id.expertise);
        LifeAchievment=findViewById(R.id.lifebestachi);
        UploadVedio=findViewById(R.id.uploadvedio);
        AnyOther=findViewById(R.id.anyother);


        // find id's for button

        Edit1=findViewById(R.id.edit1);
        Edit2=findViewById(R.id.edit2);
        Edit3=findViewById(R.id.edit3);
        Edit4=findViewById(R.id.edit4);
        Edit5=findViewById(R.id.edit5);
        Edit6=findViewById(R.id.edit6);
        Edit7=findViewById(R.id.edit7);
        Edit8=findViewById(R.id.edit8);

        // set click listener

        PreferredLang.setOnClickListener(this);
        ModeofLang.setOnClickListener(this);
        Describeyourself.setOnClickListener(this);
        Currentdoing.setOnClickListener(this);
        Expertise.setOnClickListener(this);
        LifeAchievment.setOnClickListener(this);
        UploadVedio.setOnClickListener(this);
       // Edit8.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v==PreferredLang)
        {
            Intent i=new Intent(this,PreferredLanuage.class);
            startActivity(i);
        }
       else if (v == ModeofLang)
        {
            Intent i=new Intent(this,ModeOfGuidance.class);
            startActivity(i);

        }
        else if (v == Describeyourself)
        {
            Intent i=new Intent(this,DescribeYourself.class);
            startActivity(i);

        }
        else if (v == Currentdoing)
        {
            Intent i=new Intent(this,CurrentelyDoing.class);
            startActivity(i);

        }
        else if (v == Expertise)
        {
            Intent i=new Intent(getApplicationContext(),YourExpertise.class);
            startActivity(i);


        }
        else if (v == LifeAchievment)
        {
            Intent i=new Intent(getApplicationContext(),LifeBestAchievements.class);
            startActivity(i);

        }
        else if (v== UploadVedio)
        {
            Intent i=new Intent(getApplicationContext(),UploadOneMinutes.class);
            startActivity(i);

        }


    }
}
