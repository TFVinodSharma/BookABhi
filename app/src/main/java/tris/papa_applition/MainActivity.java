package tris.papa_applition;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button  signin;
TextView forget;
EditText email,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        signin=findViewById(R.id.loginbutton);
        forget=findViewById(R.id.forgetpasswordtextview);
        email=findViewById(R.id.useremail);
        password=findViewById(R.id.userpassword);

        signin.setOnClickListener(this);
        forget.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.loginbutton)
        {
            SharedPreferences sp=getSharedPreferences("My_Data",MODE_PRIVATE);

            // SharedPreferences.Editor et=sp.edit();

            String Email=email.getText().toString();
            String Pass=password.getText().toString();
            if (Email.equals(sp.getString("A",null))&& Pass.equals(sp.getString("B",null))){
                startActivity(new Intent(this,Home.class));
            }
            else
            {
                Toast.makeText(this, "Incorrect Email or Password", Toast.LENGTH_SHORT).show();
            }


        }
        else if (v.getId()==R.id.forgetpasswordtextview)
        {
            Intent i=new Intent(MainActivity.this,ForgetPassword.class);
            startActivity(i);
        }

    }
}
