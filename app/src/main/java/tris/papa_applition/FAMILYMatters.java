package tris.papa_applition;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FAMILYMatters extends AppCompatActivity {
Button forlang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_familymatters);
        forlang=findViewById(R.id.family);

        forlang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(FAMILYMatters.this,HalfAccountActivity.class);
                startActivity(i);
            }
        });

    }
}
