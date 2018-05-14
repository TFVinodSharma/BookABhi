package tris.papa_applition;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class GSTActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gst);
    }
    public void gotogst(View v)
    {
        Intent i=new Intent(this,HalfAccountActivity.class);
        startActivity(i);
    }

}
