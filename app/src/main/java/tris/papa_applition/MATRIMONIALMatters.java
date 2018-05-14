package tris.papa_applition;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MATRIMONIALMatters extends AppCompatActivity {
Button matri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matrimonialmatters);
        matri=findViewById(R.id.matri);

        matri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MATRIMONIALMatters.this,HalfAccountActivity.class);
                startActivity(i);
            }
        });
    }
}
