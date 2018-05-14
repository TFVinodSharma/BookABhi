package tris.papa_applition;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Documents extends AppCompatActivity  implements View.OnClickListener{
        Button  btn10th,btn12th,btngard,btnpro,btnanyothercertificate,btnresume,btnproofofcurrentoccupation,btnimageoffice,
    btnadhar,btnpan;
        EditText editnumber,editrelationnumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_documents);


        btn10th=findViewById(R.id.upload10thmarksheet);
        btn12th=findViewById(R.id.upload12thmarksheet);
        btngard=findViewById(R.id.uploadgraduationcertificate);
        btnpro=findViewById(R.id.uploadprofesionalmarksheets);
        btnanyothercertificate=findViewById(R.id.anyothercertificate);
        btnresume=findViewById(R.id.pdfword);
        btnproofofcurrentoccupation=findViewById(R.id.proofofcurrentoccupation);
        btnimageoffice=findViewById(R.id.uploadofficeimage);
        btnadhar=findViewById(R.id.uploadadhar);
        btnpan=findViewById(R.id.uploadpan);

        editnumber=findViewById(R.id.number);
        editrelationnumber=findViewById(R.id.ralationnumber);

        btn10th.setOnClickListener(this);
        btn12th.setOnClickListener(this);
        btngard.setOnClickListener(this);
        btnpro.setOnClickListener(this);
        btnanyothercertificate.setOnClickListener(this);
        btnresume.setOnClickListener(this);
        btnproofofcurrentoccupation.setOnClickListener(this);
        btnimageoffice.setOnClickListener(this);
        btnadhar.setOnClickListener(this);
        btnpan.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v==btn10th)
        {
            Intent i=new Intent(this,TenthclassMarksheetUpload.class);
            startActivity(i);
        }
        else if (v==btn12th)
        {
            Intent i=new Intent(this,TwelfthMarksheetUpload.class);
            startActivity(i);
        }
    else if (v==btngard)
        {
            Intent i=new Intent(this,GraduationCertificate.class);
            startActivity(i);
        }
        else if (v==btnpro)
        {
            Intent i=new Intent(this,ProfessionalMarksheet.class);
            startActivity(i);
        }
        else if (v==btnanyothercertificate)
        {
            Intent i=new Intent(this,AnyOtherCertificate.class);
            startActivity(i);
        }
        else if (v==btnresume)
        {
            Intent i=new Intent(this,Resume.class);
            startActivity(i);
        }
        else if (v==btnproofofcurrentoccupation)
        {
            Intent i=new Intent(this,ProofOfCurrentOccupation.class);
            startActivity(i);
        }
        else if (v==btnimageoffice)
        {
            Intent i=new Intent(this,OfficeImage.class);
            startActivity(i);
        }
        else if (v==btnadhar)
        {
            Intent i=new Intent(this,AadharUpload.class);
            startActivity(i);
        }
        else if (v==btnpan)
        {
            Intent i=new Intent(this,PANUpload.class);
            startActivity(i);
        }
    }
}
