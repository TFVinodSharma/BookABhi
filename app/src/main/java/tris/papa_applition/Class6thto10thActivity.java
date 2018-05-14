package tris.papa_applition;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Class6thto10thActivity extends AppCompatActivity {
    Button btnclass6to10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class6thto10th);
        btnclass6to10=findViewById(R.id.c6to10);

        btnclass6to10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Class6thto10thActivity.this,HalfAccountActivity.class);
                startActivity(i);
            }
        });
    }
}
