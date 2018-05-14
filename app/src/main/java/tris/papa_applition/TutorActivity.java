package tris.papa_applition;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class TutorActivity extends AppCompatActivity  implements View.OnClickListener{
    public TextView Nursery,Class1to5,Class6to10,Class11to12,English,Maths,Science,Dance,Sports,
            Computer,Foreign,Yoga,Physiotherapist,Otherstutor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutor);

        // find id's

        Nursery=findViewById(R.id.nursery);
        Class1to5=findViewById(R.id.class1to5);
        Class6to10=findViewById(R.id.class6to10);
        Class11to12=findViewById(R.id.class11to12);
        English=findViewById(R.id.english);
        Maths=findViewById(R.id.maths);
        Science=findViewById(R.id.science);
        Dance=findViewById(R.id.danceandmusic);
        Sports=findViewById(R.id.sports);
        Computer=findViewById(R.id.computer);
        Foreign=findViewById(R.id.foreignlang);
        Yoga=findViewById(R.id.yoga);
        Physiotherapist=findViewById(R.id.physiotherapist);
        Otherstutor=findViewById(R.id.othettutor);

        // setclicklistner

        Nursery.setOnClickListener(this);
        Class1to5.setOnClickListener(this);
        Class6to10.setOnClickListener(this);
        Class11to12.setOnClickListener(this);
        English.setOnClickListener(this);
        Maths.setOnClickListener(this);
        Science.setOnClickListener(this);
        Dance.setOnClickListener(this);
        Sports.setOnClickListener(this);
        Computer.setOnClickListener(this);
        Foreign.setOnClickListener(this);
        Yoga.setOnClickListener(this);
        Physiotherapist.setOnClickListener(this);
        Otherstutor.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v==Nursery)
        {
            Intent i =new Intent(this,NurseryActivity.class);
            startActivity(i);
        }
        else if (v==Class1to5)
        {
            Intent i =new Intent(this,Class1to5Activity.class);
            startActivity(i);
        }
        else if (v==Class6to10)
        {
            Intent i =new Intent(this,Class6thto10thActivity.class);
            startActivity(i);
        }
        else if (v==Class11to12)
        {
            Intent i =new Intent(this,Class11thto12thAcitvity.class);
            startActivity(i);
        }

        else if (v==English)
        {
            Intent i =new Intent(this,EnglishActivity.class);
            startActivity(i);
        }

        else if (v==Maths)
        {
            Intent i =new Intent(this,MathematicsActivity.class);
            startActivity(i);
        }

        else if (v==Science)
        {
            Intent i =new Intent(this,Science.class);
            startActivity(i);
        }

        else if (v==Dance)
        {
            Intent i =new Intent(this,DanceAndMusic.class);
            startActivity(i);
        }

        else if (v==Sports)
        {
            Intent i =new Intent(this,Sports.class);
            startActivity(i);
        }
        else if (v==Computer)
        {
            Intent i =new Intent(this,ComputerActivity.class);
            startActivity(i);
        }
        else if (v==Foreign)
        {
            Intent i =new Intent(this,ForeignLanguage.class);
            startActivity(i);
        }
        else if (v==Yoga)
        {
            Intent i =new Intent(this,YogaActivity.class);
            startActivity(i);
        }
        else if (v==Physiotherapist)
        {
            Intent i =new Intent(this,PhysiotherapistActivity.class);
            startActivity(i);
        }

        else if (v==Otherstutor)
        {
            Intent i =new Intent(this,MainActivity.class);
            startActivity(i);
        }







    }
}
