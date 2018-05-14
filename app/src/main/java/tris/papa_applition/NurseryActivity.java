package tris.papa_applition;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NurseryActivity extends AppCompatActivity {
Button nursery;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nursery);
        nursery=findViewById(R.id.nur);

        nursery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(NurseryActivity.this,HalfAccountActivity.class);
                startActivity(i);
            }
        });


    }
}
