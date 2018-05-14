package tris.papa_applition;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class EducationActivity extends AppCompatActivity implements View.OnClickListener{

    public TextView SchoolGuide,CollgeGuide,Caguide,Csguide,Cmaguide,Mbaguide,Lawguide,Foreignguide,Othersguide,Civilservicse,Medicalguide,Engineeringguide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education);


        // finds id's
        SchoolGuide=findViewById(R.id.schoolguide);
        CollgeGuide=findViewById(R.id.collegeguide);
        Caguide=findViewById(R.id.caguide);
        Csguide=findViewById(R.id.csguide);
        Cmaguide=findViewById(R.id.cmaguide);
        Mbaguide=findViewById(R.id.mbaguide);
        Lawguide=findViewById(R.id.lawguide);
        Foreignguide=findViewById(R.id.foreignguide);
        Civilservicse=findViewById(R.id.civilservice);
        Medicalguide=findViewById(R.id.medicalguide);
        Engineeringguide=findViewById(R.id.engineeringguide);
        Othersguide=findViewById(R.id.othersguide);

        // setclicklistner

        SchoolGuide.setOnClickListener(this);
        CollgeGuide.setOnClickListener(this);
        Caguide.setOnClickListener(this);
        Csguide.setOnClickListener(this);
        Cmaguide.setOnClickListener(this);
        Mbaguide.setOnClickListener(this);
        Lawguide.setOnClickListener(this);
        Foreignguide.setOnClickListener(this);
        Civilservicse.setOnClickListener(this);
        Medicalguide.setOnClickListener(this);
        Engineeringguide.setOnClickListener(this);
        Othersguide.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if (v==SchoolGuide)
        {
            Intent i=new Intent(this,SchoolGuidance.class);
            startActivity(i);
        }
        else if (v==CollgeGuide)
        {
            Intent i=new Intent(this,CollegeGuidance.class);
            startActivity(i);
        }
        else if (v==Caguide)
        {
            Intent i=new Intent(this,CAGuidance.class);
            startActivity(i);

        }
        else if (v==Csguide)
        {
            Intent i=new Intent(this,CSGuidance.class);
            startActivity(i);

        }
        else if (v==Cmaguide)
        {
            Intent i=new Intent(this,CMAGuidance.class);
            startActivity(i);
        }
        else if (v==Mbaguide)
        {
            Intent i=new Intent(this,MBAGuidance.class);
            startActivity(i);
        }
        else if (v==Lawguide)
        {
            Intent i=new Intent(this,LAWGuidance.class);
            startActivity(i);
        }
        else if (v==Foreignguide)
        {
            Intent i=new Intent(this,ForeignGuidance.class);
            startActivity(i);
        }
        else if (v==Civilservicse)
        {
            Intent i=new Intent(this,CivilServices.class);
            startActivity(i);
        }
        else if (v==Medicalguide)
        {
            Intent i=new Intent(this,MedicalGuidance.class);
            startActivity(i);
        }
        else if (v==Engineeringguide)
        {
            Intent i=new Intent(this,EngineeringGiudance.class);
            startActivity(i);
        }
        else if (v==Othersguide)
        {
            Intent i=new Intent(this,OthersFirstHone.class);
            startActivity(i);
        }






    }
}
