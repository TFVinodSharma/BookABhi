package tris.papa_applition;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LegalActivity extends AppCompatActivity  implements View.OnClickListener{
    public TextView CivilMatters,CriminalMatters,FamilyMatters,MatrimonialMatters,Intellectual,Otherlegal,Labor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legal);

        // find id's

        CivilMatters=findViewById(R.id.civilmatters);
        CriminalMatters=findViewById(R.id.criminalmatters);
        FamilyMatters=findViewById(R.id.familymatters);
        MatrimonialMatters=findViewById(R.id.matrimonial);
        Intellectual=findViewById(R.id.intellectual);
        Labor=findViewById(R.id.labormatters);
        Otherlegal=findViewById(R.id.otherslegal);

        // setclicklistner
        CivilMatters.setOnClickListener(this);
        CriminalMatters.setOnClickListener(this);
        FamilyMatters.setOnClickListener(this);
        MatrimonialMatters.setOnClickListener(this);
        Intellectual.setOnClickListener(this);
        Labor.setOnClickListener(this);
        Otherlegal.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v==CivilMatters)
        {
            Intent i= new Intent(this,CIVILMatters.class);
            startActivity(i);
        }
        else if (v==CriminalMatters)
        {
            Intent i= new Intent(this,CRIMINALMatters.class);
            startActivity(i);
        }
        else if (v==FamilyMatters)
        {
            Intent i= new Intent(this,FAMILYMatters.class);
            startActivity(i);
        }
        else if (v==MatrimonialMatters)
        {
            Intent i= new Intent(this,MATRIMONIALMatters.class);
            startActivity(i);
        }
        else if (v==Intellectual)
        {
            Intent i= new Intent(this,INTELLECTUALMatters.class);
            startActivity(i);
        }
        else if (v==Labor)
        {
            Intent i= new Intent(this,LABORMatters.class);
            startActivity(i);
        }
        else if (v==Otherlegal)
        {
            Intent i= new Intent(this,OTHERLEGALMAtters.class);
            startActivity(i);
        }

    }
}
