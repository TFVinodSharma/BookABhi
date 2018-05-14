package tris.papa_applition;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CMAGuidance extends AppCompatActivity {
    Button CMAguide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cmaguidance);
        CMAguide=findViewById(R.id.cma);

        CMAguide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(CMAGuidance.this,HalfAccountActivity.class);
                startActivity(i);
            }
        });

    }
}
