package tris.papa_applition;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class InvestmentsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_investments);
    }
    public void gotohalfaccount1(View v)
    {
        Intent i=new Intent(this,HalfAccountActivity.class);
        startActivity(i);

    }
}
