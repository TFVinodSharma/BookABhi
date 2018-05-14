package tris.papa_applition;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ForeignGuidance extends AppCompatActivity {
Button foregin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foreign_guidance);
        foregin=findViewById(R.id.forguide);

        foregin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(ForeignGuidance.this,HalfAccountActivity.class);
                startActivity(i);
            }
        });
    }
}
