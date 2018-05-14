package tris.papa_applition;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class YogaActivity extends AppCompatActivity {
Button yoga;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yoga);
        yoga=findViewById(R.id.yog);

        yoga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(YogaActivity.this,HalfAccountActivity.class);
                startActivity(i);
            }
        });

    }
}
