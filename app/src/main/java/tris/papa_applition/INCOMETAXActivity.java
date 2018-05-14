package tris.papa_applition;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class INCOMETAXActivity extends AppCompatActivity {
Button income;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_incometax);
        income=findViewById(R.id.intax);

        income.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(INCOMETAXActivity.this,HalfAccountActivity.class);
                startActivity(i);
            }
        });

    }
}
