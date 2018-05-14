package tris.papa_applition;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CRIMINALMatters extends AppCompatActivity {
    Button criminal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criminalmatters);

        criminal=findViewById(R.id.cri);

        criminal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(CRIMINALMatters.this,HalfAccountActivity.class);
                startActivity(i);
            }
        });

    }
}
