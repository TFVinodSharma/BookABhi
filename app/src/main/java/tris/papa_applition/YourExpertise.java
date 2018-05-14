package tris.papa_applition;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class YourExpertise extends AppCompatActivity {
Button  buttonexpertise;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_your_expertise);
        buttonexpertise=findViewById(R.id.yourexpertise);
    }
}
