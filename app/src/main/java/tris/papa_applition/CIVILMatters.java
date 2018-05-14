package tris.papa_applition;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class CIVILMatters extends AppCompatActivity {
    Button civilmatters;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civilmatters);
        civilmatters=findViewById(R.id.civilmat);

        civilmatters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(CIVILMatters.this,HalfAccountActivity.class);
                startActivity(i);
            }
        });
    }

}
