package tris.papa_applition;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class EngineeringGiudance extends AppCompatActivity {
Button engguide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_engineering_giudance);
        engguide=findViewById(R.id.engerring);

        engguide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(EngineeringGiudance.this,HalfAccountActivity.class);
                startActivity(i);
            }
        });

    }
}
