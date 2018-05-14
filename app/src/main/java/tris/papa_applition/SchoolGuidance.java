package tris.papa_applition;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SchoolGuidance extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school_guidance);
    }
    public void  gotohalfaccount(View v)
    {
        Intent i=new Intent(this,HalfAccountActivity.class);
        startActivity(i);
    }
}
