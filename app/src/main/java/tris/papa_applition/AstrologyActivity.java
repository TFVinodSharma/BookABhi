package tris.papa_applition;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class AstrologyActivity extends AppCompatActivity {
Button astrology;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_astrology);

        astrology=findViewById(R.id.asrt);
        astrology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(AstrologyActivity.this,HalfAccountActivity.class);
                startActivity(i);

            }
        });
    }

}
