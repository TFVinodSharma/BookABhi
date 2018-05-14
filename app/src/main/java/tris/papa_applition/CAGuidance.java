package tris.papa_applition;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class CAGuidance extends AppCompatActivity {
Button CAGuide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caguidance);

        CAGuide=findViewById(R.id.caguide);
        CAGuide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(CAGuidance.this,HalfAccountActivity.class);
                startActivity(i);

            }
        });

    }
}
