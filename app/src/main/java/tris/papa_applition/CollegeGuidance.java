package tris.papa_applition;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CollegeGuidance extends AppCompatActivity {
    Button College;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_college_guidance);
        College=findViewById(R.id.college);

        College.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(CollegeGuidance.this,HalfAccountActivity.class);
                startActivity(i);
            }
        });

    }
}
