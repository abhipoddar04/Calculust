package com.myprojectapp.calculust;

import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.graphics.Typeface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity
{
    TextView welcomeText,instText;   //Creating a TextView object for opening text
    Typeface t1;                    //Creating a typeface t1
    RadioGroup radioGrp;                        //Creating a RadioGroup instance

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialize the objects as textview/buttons
        welcomeText=(TextView) findViewById(R.id.textView1);
        instText=(TextView) findViewById(R.id.textView2);
        radioGrp=(RadioGroup) findViewById(R.id.radioGroup);

        //Assign fonts using Typeface.createFromAsset()
        t1=Typeface.createFromAsset(getAssets(),"fonts/UbuntuMono-R.ttf");

        //Link typeface font variable to textview for changing font
        welcomeText.setTypeface(t1);
        instText.setTypeface(t1);

        //Button creation 'Let's Calculust it!'
        final Button buttonCalc=(Button) findViewById(R.id.buttonCalc);

        //Imparting action to above button on clicking
        buttonCalc.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                int id=radioGrp.getCheckedRadioButtonId();
                RadioButton rbid=(RadioButton) findViewById(id);

                if(id==R.id.radioButton1)
                    openFunctionValActivity();
                else if(id==R.id.radioButton2)
                    openEvenFunctionCheckActivity();
                else if(id==R.id.radioButton3)
                    openOddFunctionCheckActivity();
                else if(id==R.id.radioButton4)
                    openLimitCalculatorActivity();
                else if(id==R.id.radioButton5)
                    openContinuityCheckActivity();
                else if(id==R.id.radioButton6)
                    openDifferentiationValueActivity();
                else if(id==R.id.radioButton7)
                    openDifferentiabilityCheckActivity();
                else if(id==R.id.radioButton8)
                    openDefiniteIntegralsActivity();
                else
                    openMoreOperationsActivity();
            }
        });
    }

    public void openFunctionValActivity()
    {
        Intent intent1= new Intent(this, MainActivityFunctionValue.class);
        startActivity(intent1);
    }

    public void openEvenFunctionCheckActivity()
    {
        Intent intent2= new Intent(this, MainActivityEvenFunction.class);
        startActivity(intent2);
    }

    public void openOddFunctionCheckActivity()
    {
        Intent intent3= new Intent(this, MainActivityOddFunction.class);
        startActivity(intent3);
    }

    public void openLimitCalculatorActivity()
    {
        Intent intent4= new Intent(this, MainActivityLimitCalc.class);
        startActivity(intent4);
    }

    public void openContinuityCheckActivity()
    {
        Intent intent5= new Intent(this, MainActivityContinuity.class);
        startActivity(intent5);
    }

    public void openDifferentiationValueActivity()
    {
        Intent intent6= new Intent(this, MainActivityDifferentiationValue.class);
        startActivity(intent6);
    }

    public void openDifferentiabilityCheckActivity()
    {
        Intent intent7= new Intent(this, MainActivityDifferentiabilityCheck.class);
        startActivity(intent7);
    }

    public void openDefiniteIntegralsActivity()
    {
        Intent intent8= new Intent(this, MainActivityDefiniteIntegrals.class);
        startActivity(intent8);
    }

    public void openFunctionValueActivity()
    {
        Intent intent9= new Intent(this, MainActivityFunctionValue.class);
        startActivity(intent9);
    }

    public void openMoreOperationsActivity()
    {
        Intent intent10= new Intent(this, MainActivityMoreOperations.class);
        startActivity(intent10);
    }
}
