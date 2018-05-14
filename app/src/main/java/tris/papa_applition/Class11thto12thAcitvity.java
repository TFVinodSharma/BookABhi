package tris.papa_applition;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Class11thto12thAcitvity extends AppCompatActivity {
    Button btnclass11to12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class11thto12th_acitvity);
        btnclass11to12=findViewById(R.id.c11to12);

        btnclass11to12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Class11thto12thAcitvity.this,HalfAccountActivity.class);
                startActivity(i);
            }
        });

    }
}
