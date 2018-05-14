package tris.papa_applition;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LABORMatters extends AppCompatActivity {
    Button Labor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_labormatters);
        Labor=findViewById(R.id.labor);

        Labor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(LABORMatters.this,HalfAccountActivity.class);
                startActivity(i);
            }
        });
    }
}
