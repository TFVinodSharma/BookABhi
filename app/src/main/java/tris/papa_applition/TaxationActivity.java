package tris.papa_applition;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TaxationActivity extends AppCompatActivity  implements View.OnClickListener{
    public TextView GST,INCOMETAX;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taxation);

        // find id's

        GST=findViewById(R.id.gstexpert);
        INCOMETAX=findViewById(R.id.incometax);

        // setclicklistner
        GST.setOnClickListener(this);
        INCOMETAX.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v==GST)
        {
            Intent i= new Intent(this,GSTActivity.class);
            startActivity(i);
        }
        else if (v==INCOMETAX)
        {
            Intent i= new Intent(this,INCOMETAXActivity.class);
            startActivity(i);
        }

    }
}
