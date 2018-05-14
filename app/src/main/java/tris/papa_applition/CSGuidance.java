package tris.papa_applition;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CSGuidance extends AppCompatActivity {
    Button csguide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csguidance);
        csguide=findViewById(R.id.cs);
        csguide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(CSGuidance.this,HalfAccountActivity.class);
                startActivity(i);
            }
        });

    }
}
