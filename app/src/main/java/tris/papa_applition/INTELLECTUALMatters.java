package tris.papa_applition;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class INTELLECTUALMatters extends AppCompatActivity {
Button Inte;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intellectualmatters);
        Inte=findViewById(R.id.inte);

        Inte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(INTELLECTUALMatters.this,HalfAccountActivity.class);
                startActivity(i);
            }
        });

    }
}
