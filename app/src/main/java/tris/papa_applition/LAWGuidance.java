package tris.papa_applition;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LAWGuidance extends AppCompatActivity {
    Button Law;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lawguidance);
        Law=findViewById(R.id.law);

        Law.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(LAWGuidance.this,HalfAccountActivity.class);
                startActivity(i);
            }
        });

    }
}
