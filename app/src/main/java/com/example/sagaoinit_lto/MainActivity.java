package com.example.sagaoinit_lto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    Button btnSubmit;
    EditText editName, editAddress, editBdate, editSex, editHeight, editWeight, editNationality, editRestrictions, editConditions, editAGY, editExpiration;
    TextView txtError;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSubmit = findViewById(R.id.btnSubmit);
        editName = findViewById(R.id.editName);
        editAddress = findViewById(R.id.editAddress);
        editBdate = findViewById(R.id.editBdate);
        editSex = findViewById(R.id.editSex);
        editHeight = findViewById(R.id.editHeight);
        editWeight = findViewById(R.id.editWeight);
        editNationality = findViewById(R.id.editNationality);
        editRestrictions = findViewById(R.id.editRestrictions);
        editConditions = findViewById(R.id.editConditions);
        editAGY = findViewById(R.id.editAGY);
        editExpiration = findViewById(R.id.editExpiration);
        txtError = findViewById(R.id.txtError);

    }

    public void onClick(View view) {
        String name = editName.getText().toString();
        String address = editAddress.getText().toString();
        String bdate = editBdate.getText().toString();
        String sex = editSex.getText().toString();
        String height = editHeight.getText().toString();
        String weight = editWeight.getText().toString();
        String nationality = editNationality.getText().toString();
        String restrictions = editRestrictions.getText().toString();
        String conditions = editConditions.getText().toString();
        String agy = editAGY.getText().toString();
        String expiration = editExpiration.getText().toString();


        if (TextUtils.isEmpty(name) || TextUtils.isEmpty(address) ||
                TextUtils.isEmpty(bdate) || TextUtils.isEmpty(sex) || TextUtils.isEmpty(height) ||
                TextUtils.isEmpty(weight) || TextUtils.isEmpty(nationality) || TextUtils.isEmpty(restrictions) || TextUtils.isEmpty(conditions) || TextUtils.isEmpty(agy) ||
                TextUtils.isEmpty(expiration)){
                    txtError.setText("You must enter all fields!");
        }
        else{
            Intent intent = new Intent(MainActivity.this, output.class);
            intent.putExtra("keyName", name);
            intent.putExtra("keyAddress", address);
            intent.putExtra("keyBdate", bdate);
            intent.putExtra("keySex", sex);
            intent.putExtra("keyHeight", height);
            intent.putExtra("keyWeight", weight);
            intent.putExtra("keyNationality", nationality);
            intent.putExtra("keyRestrictions", restrictions);
            intent.putExtra("keyConditions", conditions);
            intent.putExtra("keyAGY", agy);
            intent.putExtra("keyExpiration", expiration);
            startActivity(intent);

        }
    }
}