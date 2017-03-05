package com.example.fengzc.godutch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String amount;
    EditText totalAmount,PersNbr;
    TextView display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        totalAmount = (EditText)findViewById(R.id.et_Amount);
        PersNbr = (EditText)findViewById(R.id.et_Nbr);
        display = (TextView)findViewById(R.id.tv_AmountPerPerson);

    }

    public void btnCompute(View V){
        Double total = Double.parseDouble(totalAmount.getText().toString());
        Double persons = Double.parseDouble(PersNbr.getText().toString());
        Double share = total/persons;
        share = Double.valueOf(Math.round(share*100));
        share = share/100;

        Toast.makeText(getBaseContext(),"The amount to share is :"+ share,Toast.LENGTH_SHORT).show();
        display.setText("You should pay $"+String.valueOf(share));

    }
}
