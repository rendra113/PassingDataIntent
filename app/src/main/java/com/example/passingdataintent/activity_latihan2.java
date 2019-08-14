package com.example.passingdataintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class activity_latihan2 extends AppCompatActivity implements View.OnClickListener {

    public Button btnMoveAcivity;
    public Button btnMoveWithDataAcivity;
    public Button btnMoveWithObject;
    Button btnDialNumber;
    Button btnMoveResult;
    TextView tvResult;

    int REQUEST_CODE = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan2);
        btnMoveAcivity = (Button) findViewById(R.id.btn_move_activity);
        btnMoveAcivity.setOnClickListener(this);

        btnMoveWithObject = (Button) findViewById(R.id.btn_move_activity_object);
        btnMoveWithObject.setOnClickListener(this);

        btnMoveWithDataAcivity = (Button) findViewById(R.id.btn_move_with_data_activity);
        btnMoveWithDataAcivity.setOnClickListener(this);

        btnDialNumber = (Button) findViewById(R.id.btn_dial_number);
        btnDialNumber.setOnClickListener(this);

        btnMoveResult= (Button) findViewById(R.id.btn_move_for_result);
        btnMoveResult.setOnClickListener(this);

        tvResult = findViewById(R.id.tv_result);

    }

    @Override
    public void onClick(View v) {
       switch (v.getId()){
           case R.id.btn_move_activity:
                Intent moveIntent = new Intent(activity_latihan2.this,Activity_move.class);
                startActivity(moveIntent);
               break;

               case R.id.btn_move_with_data_activity:
                Intent moveIntentWithData = new Intent(activity_latihan2.this,Activity_move_with_data.class);
                moveIntentWithData.putExtra(Activity_move_with_data.EXTRA_NAME,"Rendra Muhammad Fadhil");
                moveIntentWithData.putExtra(Activity_move_with_data.EXTRA_AGE,"17");
                startActivity(moveIntentWithData);
                break;
           case R.id.btn_move_activity_object:
               Person mPerson = new Person();
               mPerson.setName("Rendra Muhammad Fadhil");
               mPerson.setAge(24);

               mPerson.setEmail("rendramuhammad113@gmail.com");

               mPerson.setCity("Bandung");
               Intent moveWithObjectIntent = new Intent(activity_latihan2.this,
                       Activity_move_with_object.class);
               moveWithObjectIntent.putExtra(Activity_move_with_object.EXTRA_PERSON, mPerson);
               startActivity(moveWithObjectIntent);

               break;

           case R.id.btn_dial_number:
               String phoneNumber = "085861513938";
               Intent dialPhoneIntent = new Intent(Intent.ACTION_DIAL,
                       Uri.parse("tel:" + phoneNumber));
               startActivity(dialPhoneIntent);

               break;

           case R.id.btn_move_for_result:
               Intent moveForResultIntent = new Intent(activity_latihan2.this,
                       Activity_move_with_result.class);
               startActivityForResult(moveForResultIntent, REQUEST_CODE);
               break;
       }
    }
}
