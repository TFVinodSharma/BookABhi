package tris.papa_applition;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PhysiotherapistActivity extends AppCompatActivity {
Button physio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physiotherapist);
        physio=findViewById(R.id.phy);

        physio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(PhysiotherapistActivity.this,HalfAccountActivity.class);
                startActivity(i);
            }
        });

    }
}
