package tris.papa_applition;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Class1to5Activity extends AppCompatActivity {
Button btnclass1to5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class1to5);

        btnclass1to5=findViewById(R.id.c1to5);

        btnclass1to5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Class1to5Activity.this,HalfAccountActivity.class);
                startActivity(i);
            }
        });
    }
}
