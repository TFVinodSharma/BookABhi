package tris.papa_applition;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LifeManagementActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_management);
    }
    public void gotolifemanagement(View v)
    {
        Intent i=new Intent(this,HalfAccountActivity.class);
        startActivity(i);
    }
}
