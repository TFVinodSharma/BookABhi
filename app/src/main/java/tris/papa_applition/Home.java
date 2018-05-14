package tris.papa_applition;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Home extends AppCompatActivity implements View.OnClickListener {
    public TextView Education,Investments,Taxation,Legal,Astrology,LifeManagement,Tutor,Doctor,Others;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // find id's

        Education =findViewById(R.id.education);
        Investments=findViewById(R.id.investment);
        Taxation=findViewById(R.id.taxation);
        Legal=findViewById(R.id.legal);
        Astrology=findViewById(R.id.astrology);
        LifeManagement=findViewById(R.id.lifemanagement);
        Tutor=findViewById(R.id.tutor);
        Doctor=findViewById(R.id.doctor);
        Others=findViewById(R.id.others);

        // setclicklistner

        Education.setOnClickListener(this);
        Investments.setOnClickListener(this);
        Taxation.setOnClickListener(this);
        Legal.setOnClickListener(this);
        Astrology.setOnClickListener(this);
        LifeManagement.setOnClickListener(this);
        Tutor.setOnClickListener(this);
        Doctor.setOnClickListener(this);
        Others.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v==Education)
        {
            Intent i=new Intent(this,EducationActivity.class);
            startActivity(i);
        }
        if (v==Investments)
        {
            Intent i=new Intent(this,InvestmentsActivity.class);
            startActivity(i);
        }
        if (v==Taxation)
        {
            Intent i=new Intent(this,TaxationActivity.class);
            startActivity(i);
        }
        if (v==Legal)
        {
            Intent i=new Intent(this,LegalActivity.class);
            startActivity(i);
        }
        if (v==LifeManagement)
        {
            Intent i=new Intent(this,LifeManagementActivity.class);
            startActivity(i);
        }
        if (v==Astrology)
        {
            Intent i=new Intent(this,AstrologyActivity.class);
            startActivity(i);
        }
        if (v==Tutor)
        {
            Intent i=new Intent (this,TutorActivity.class);
            startActivity(i);
        }
        if (v==Doctor)
        {
            Intent i=new Intent(this,DoctorActivity.class);
            startActivity(i);
        }
        if (v==Others)
        {
            Intent i=new Intent(this,OtherMain.class);
            startActivity(i);
        }


    }
}
