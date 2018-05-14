package tris.papa_applition;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CivilServices extends AppCompatActivity {
Button btnCivil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civil_services);

        btnCivil=findViewById(R.id.civil);
        btnCivil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(CivilServices.this,HalfAccountActivity.class);
                startActivity(i);
            }
        });

    }
}
