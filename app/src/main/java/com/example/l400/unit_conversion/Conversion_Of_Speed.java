package com.example.l400.unit_conversion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Conversion_Of_Speed extends AppCompatActivity {

    Spinner spinner11, from, to;
    TextView result,tex2,text3,text4,text5;
    EditText value;
    String[] froms ;
    String f="",t="";
    Button enterresult,bu;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversion__of__speed);
        spinner11 = (Spinner)findViewById(R.id.spinner11);
        from = (Spinner)findViewById(R.id.spinner);
        to = (Spinner)findViewById(R.id.spinner1);
        result = (TextView)findViewById(R.id.tvresult);
        tex2 = (TextView)findViewById(R.id.tex2);
        text3 = (TextView)findViewById(R.id.text3);
        text5 = (TextView)findViewById(R.id.text5);
        text4 = (TextView)findViewById(R.id.text4);
        value = (EditText)findViewById(R.id.value);
        enterresult = (Button)findViewById(R.id.buttonn);
        setdisable();
        bu = (Button)findViewById(R.id.buttttt);
        String[] val = {"Length" ,"Temperature"   ,"Wieght","Time" };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,val);
        spinner11.setAdapter(adapter);

       bu.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               setenable();
               final String spinervalue =  spinner11.getSelectedItem().toString();
              // Toast.makeText(Conversion_Of_Speed.this, spinervalue, Toast.LENGTH_SHORT).show();
               switch (spinervalue){
                   case "Length":
                       lenth();
                       break;
                   case "Temperature":
                       temperature();
                       break;
                   case "Wieght":
                       wieght();
                       break;
                   case "Time":
                       time();
                       break;
               }
           }
       });


        enterresult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                f = from.getSelectedItem().toString();
                t = to.getSelectedItem().toString();
               // Toast.makeText(Conversion_Of_Speed.this, f+"\n"+t, Toast.LENGTH_SHORT).show();
                String r = value.getText().toString();
                double ress = 0;
                double re = Double.parseDouble(r);
               // Toast.makeText(Conversion_Of_Speed.this, re+"", Toast.LENGTH_SHORT).show();

                if(f.equals("Celcius") && t.equals("Celcius")){

                    ress = re*1;
                    result.setText(ress+"");


                }
                else if(f.equalsIgnoreCase("Celcius") && t.equalsIgnoreCase("kelvin")){

                    double ress1 = re*274.1504;
                    result.setText(ress1+"");
                }



                else if (f.equals("Celcius") && t.equals("Farenheit")){
                    double ress1 = re*33.80072;
                    result.setText(ress1+"");

                }
                else if (f.equals("kelvin") && t.equals("kelvin")){

                    ress = re*1;
                    result.setText(ress+"");
                }
                else if (f.equals("kelvin") && t.equals("Celcius")){
                    ress = re*(-272.1496);
                    result.setText(ress+"");
                }
                else if (f.equals("kelvin") && t.equals("Farenheit")){
                    ress = re*(-457.86928);
                    result.setText(ress+"");
                }
                else if (f.equals("Farenheit") && t.equals("Farenheit")){

                ress = re*1;
                result.setText(ress+"");

                } else if (f.equals("Farenheit") && t.equals("kelvin")){
                    ress = re*(255.928);
                    result.setText(ress+"");
                }
                else if (f.equals("Farenheit") && t.equals("Celcius")){
                    ress = re*(-17.2222);
                    result.setText(ress+"");
                }

                else if (f.equals("Kilogram") && t.equals("Kilogram")){
                    ress = re*1;
                    result.setText(ress+"");
                }
                else if (f.equals("Kilogram") && t.equals("Gram")){
                    ress = re*1000;
                    result.setText(ress+"");
                }
                else if (f.equals("Kilogram") && t.equals("Miligram")){
                    ress = re*1000000;
                    result.setText(ress+"");
                }
                else if (f.equals("Kilogram") && t.equals("Pound")){
                    ress = re*2.2046244202 ;
                    result.setText(ress+"");
                }
                else if (f.equals("Kilogram") && t.equals("Ounces")){
                    ress = re*35.273990723;
                    result.setText(ress+"");
                }
                else if (f.equals("Gram") && t.equals("Gram")){
                    ress = re*1;
                    result.setText(ress+"");
                }
                else if (f.equals("Gram") && t.equals("Kilogram")){
                    ress = re*0.001;
                    result.setText(ress+"");
                }
                else if (f.equals("Gram") && t.equals("Pound")){
                    ress = re*0.0022046244 ;
                    result.setText(ress+"");
                }
                else if (f.equals("Gram") && t.equals("Ounces")){
                    ress = re*0.0352739907 ;
                    result.setText(ress+"");
                }

                else if (f.equals("Gram") && t.equals("Miligram")){
                    ress = re*1000 ;
                    result.setText(ress+"");
                }
                else if (f.equals("Miligram") && t.equals("Miligram")){
                    ress = re*1;
                    result.setText(ress+"");
                }
                else if (f.equals("Miligram") && t.equals("Kilogram")){
                    ress = re*0.000001 ;
                    result.setText(ress+"");
                }
                else if (f.equals("Miligram") && t.equals("Ounces")){
                    ress = re*0.000035274 ;
                    result.setText(ress+"");
                }
                else if (f.equals("Miligram") && t.equals("Pound")){
                    ress = re*0.0000022046 ;
                    result.setText(ress+"");
                }
                else if (f.equals("Miligram") && t.equals("Gram")){
                    ress = re*0.001 ;
                    result.setText(ress+"");
                }
                else if (f.equals("Pound") && t.equals("Pound")){
                    ress = re*1;
                    result.setText(ress+"");
                }
                else if (f.equals("Pound") && t.equals("Kilogram")){
                    ress = re*0.453592 ;
                    result.setText(ress+"");
                }
                else if (f.equals("Pound") && t.equals("Gram")){
                    ress = re*453.592 ;
                    result.setText(ress+"");
                }
                else if (f.equals("Pound") && t.equals("Ounces")){
                    ress = re*16 ;
                    result.setText(ress+"");
                }
                else if (f.equals("Pound") && t.equals("Miligram")){
                    ress = re*453592 ;
                    result.setText(ress+"");
                }
                else if (f.equals("Ounces") && t.equals("Ounces")){
                    ress = re*1;
                    result.setText(ress+"");
                }
                else if (f.equals("Ounces") && t.equals("Miligram")){
                    ress = re*28349.5 ;
                    result.setText(ress+"");
                }
                else if (f.equals("Ounces") && t.equals("Kilogram")){
                    ress = re*0.0283495 ;
                    result.setText(ress+"");
                }
                else if (f.equals("Ounces") && t.equals("Gram")){
                    ress = re*28.3495 ;
                    result.setText(ress+"");
                }
                else if (f.equals("Ounces") && t.equals("Pound")){
                    ress = re*0.0625 ;
                    result.setText(ress+"");
                }

                else if (f.equals("Meter") && t.equals("Meter")){
                    ress = re*1;
                    result.setText(ress+"");
                }
                else if (f.equals("Meter") && t.equals("kilometer")){
                    ress = re*0.001 ;
                    result.setText(ress+"");
                }
                else if (f.equals("Meter") && t.equals("Centimeter")){
                    ress = re*100 ;
                    result.setText(ress+"");
                }
                else if (f.equals("Meter") && t.equals("Mile")){
                    ress = re*0.0006213689 ;
                    result.setText(ress+"");
                }
                else if (f.equals("Meter") && t.equals("Inch")){
                    ress = re*39.37007874 ;
                    result.setText(ress+"");
                }

                else if (f.equals("kilometer") && t.equals("kilometer")){
                    ress = re*1;
                    result.setText(ress+"");
                }
                else if (f.equals("kilometer") && t.equals("Meter")){
                    ress = re*1000 ;
                    result.setText(ress+"");
                }
                else if (f.equals("kilometer") && t.equals("Centimeter")){
                    ress = re*100000 ;
                    result.setText(ress+"");
                }
                else if (f.equals("kilometer") && t.equals("Mile")){
                    ress = re*0.6213688756 ;
                    result.setText(ress+"");
                }
                else if (f.equals("kilometer") && t.equals("Inch")){
                    ress = re*39370.07874 ;
                    result.setText(ress+"");
                }

                else if (f.equals("Centimeter") && t.equals("Centimeter")){
                    ress = re*1;
                    result.setText(ress+"");
                }
    else if (f.equals("Centimeter") && t.equals("Meter")){
        ress = re*0.01 ;
        result.setText(ress+"");
    }
    else if (f.equals("Centimeter") && t.equals("Kilometer")){
        ress = re*0.00001 ;
        result.setText(ress+"");
    }
    else if (f.equals("Centimeter") && t.equals("Mile")){
        ress = re*0.0000062137 ;
        result.setText(ress+"");
    }
    else if (f.equals("Centimeter") && t.equals("Inch")){
        ress = re*0.3937007874 ;
        result.setText(ress+"");
    }
                else if (f.equals("Mile") && t.equals("Mile")){
                    ress = re*1;
                    result.setText(ress+"");
                }
    else if (f.equals("Mile") && t.equals("Meter")){
        ress = re*1609.35 ;
        result.setText(ress+"");
    }
    else if (f.equals("Mile") && t.equals("kilometer")){
        ress = re*1.60935 ;
        result.setText(ress+"");
    }
    else if (f.equals("Mile") && t.equals("Centimeter")){
        ress = re*160935 ;
        result.setText(ress+"");
    }
    else if (f.equals("Mile") && t.equals("Inch")){
        ress = re*63360.23622 ;
        result.setText(ress+"");
    }
                else if (f.equals("Inch") && t.equals("Inch")){
                    ress = re*1;
                    result.setText(ress+"");
                }
    else if (f.equals("Inch") && t.equals("Meter")){
        ress = re*0.0254 ;
        result.setText(ress+"");
    }
    else if (f.equals("Inch") && t.equals("kilometer")){
        ress = re*0.0000254 ;
        result.setText(ress+"");
    }
    else if (f.equals("Inch") && t.equals("Centimeter")){
        ress = re*2.54 ;
        result.setText(ress+"");
    }
    else if (f.equals("Inch") && t.equals("Mile")){
        ress = re*0.0000157828 ;
        result.setText(ress+"");
    }

                else if (f.equals("Second") && t.equals("Second")){
                    ress = re*1 ;
                    result.setText(ress+"");
                }
                else if (f.equals("Second") && t.equals("Minute")){
                    ress = re*0.0166666667  ;
                    result.setText(ress+"");
                }
                else if (f.equals("Second") && t.equals("Hour")){
                    ress = re*0.0002777778  ;
                    result.setText(ress+"");
                }
                else if (f.equals("Second") && t.equals("Day")){
                    ress = re*0.0000115741  ;
                    result.setText(ress+"");
                }
                else if (f.equals("Second") && t.equals("Week")){
                    ress = re*0.0000016534  ;
                    result.setText(ress+"");
                }
                else if (f.equals("Second") && t.equals("Month")){
                    ress = re*3.802570537E-7 ;
                    result.setText(ress+"");
                }
                else if (f.equals("Minute") && t.equals("Minute")){
                    ress = re*1 ;
                    result.setText(ress+"");
                }
                else if (f.equals("Minute") && t.equals("Second")){
                    ress = re*60  ;
                    result.setText(ress+"");
                }
                else if (f.equals("Minute") && t.equals("Hour")){
                    ress = re*0.0166666667  ;
                    result.setText(ress+"");
                }
                else if (f.equals("Minute") && t.equals("Day")){
                    ress = re*0.0006944444  ;
                    result.setText(ress+"");
                }
                else if (f.equals("Minute") && t.equals("Week")){
                    ress = re*0.0000992063  ;
                    result.setText(ress+"");
                }
                else if (f.equals("Minute") && t.equals("Month")){
                    ress = re*0.0000228154  ;
                    result.setText(ress+"");
                }
                else if (f.equals("Hour") && t.equals("Hour")){
                    ress = re*1  ;
                    result.setText(ress+"");
                }
                else if (f.equals("Hour") && t.equals("Second")){
                    ress = re*3600   ;
                    result.setText(ress+"");
                }
                else if (f.equals("Hour") && t.equals("Minute")){
                    ress = re*60  ;
                    result.setText(ress+"");
                }
                else if (f.equals("Hour") && t.equals("Day")){
                    ress = re*0.0416666667   ;
                    result.setText(ress+"");
                }
                else if (f.equals("Hour") && t.equals("Week")){
                    ress = re*0.005952381   ;
                    result.setText(ress+"");
                }
                else if (f.equals("Hour") && t.equals("Month")){
                    ress = re*0.0013689254   ;
                    result.setText(ress+"");
                }
                else if (f.equals("Day") && t.equals("Day")){
                    ress = re*1  ;
                    result.setText(ress+"");
                }
                else if (f.equals("Day") && t.equals("Second")){
                    ress = re*86400   ;
                    result.setText(ress+"");
                }
                else if (f.equals("Day") && t.equals("Minute")){
                    ress = re*1440   ;
                    result.setText(ress+"");
                }
                else if (f.equals("Day") && t.equals("Hour")){
                    ress = re*24   ;
                    result.setText(ress+"");
                }
                else if (f.equals("Day") && t.equals("Week")){
                    ress = re*0.1428571429   ;
                    result.setText(ress+"");
                }
                else if (f.equals("Day") && t.equals("Month")){
                    ress = re*0.0328542094   ;
                    result.setText(ress+"");
                }
                else if (f.equals("Week") && t.equals("Week")){
                    ress = re*1  ;
                    result.setText(ress+"");
                }
                else if (f.equals("Week") && t.equals("Second")){
                    ress = re*604800   ;
                    result.setText(ress+"");
                }
                else if (f.equals("Week") && t.equals("Minute")){
                    ress = re*10080   ;
                    result.setText(ress+"");
                }
                else if (f.equals("Week") && t.equals("Hour")){
                    ress = re*168   ;
                    result.setText(ress+"");
                }
                else if (f.equals("Week") && t.equals("Day")){
                    ress = re*7  ;
                    result.setText(ress+"");
                }
                else if (f.equals("Week") && t.equals("Month")){
                    ress = re*0.2299794661   ;
                    result.setText(ress+"");
                }
                else if (f.equals("Month") && t.equals("Month")){
                    ress = re*1  ;
                    result.setText(ress+"");
                }
                else if (f.equals("Month") && t.equals("Second")){
                    ress = re*2629800   ;
                    result.setText(ress+"");
                }
                else if (f.equals("Month") && t.equals("Minute")){
                    ress = re*43830   ;
                    result.setText(ress+"");
                }
                else if (f.equals("Month") && t.equals("Hour")){
                    ress = re*730.5   ;
                    result.setText(ress+"");
                }
                else if (f.equals("Month") && t.equals("Day")){
                    ress = re*30.4375   ;
                    result.setText(ress+"");
                }
                else if (f.equals("Month") && t.equals("Week")){
                    ress = re*4.3482142857   ;
                    result.setText(ress+"");
                }
//                else if (f.equals("Square Meter") && t.equals("Square Meter")){
//                    ress = re*1;
//                    result.setText(ress+"");
//                }
//                else if (f.equals("Square Meter") && t.equals("Square kilometer")){
//                    ress = re*0.000001 ;
//                    result.setText(ress+"");
//                }
//                else if (f.equals("Square Meter") && t.equals("Square Centimeter")){
//                    ress = re*10000 ;
//                    result.setText(ress+"");
//                }
//                else if (f.equals("Square Meter") && t.equals("Square Mile")){
//                    ress = re*3.861018768E-7;
//                    result.setText(ress+"");
//                }
//                else if (f.equals("Square Meter") && t.equals("Square Inch")){
//                    ress = re*1550.0031 ;
//                    result.setText(ress+"");
//                }
//                else if (f.equals("Square kilometer") && t.equals("Square kilometer")){
//                    ress = re*1 ;
//                    result.setText(ress+"");
//                }
//                else if (f.equals("Square kilometer") && t.equals("Square Meter")){
//                    ress = re*1000000  ;
//                    result.setText(ress+"");
//                }
//                else if (f.equals("Square kilometer") && t.equals("Square Centimeter")){
//                    ress = re*1000000000  ;
//                    result.setText(ress+"");
//                }
//                else if (f.equals("Square kilometer") && t.equals("Square Mile")){
//                    ress = re*0.3861018768  ;
//                    result.setText(ress+"");
//                }
//                else if (f.equals("Square kilometer") && t.equals("Square Inch")){
//                    ress = re*1550003100  ;
//                    result.setText(ress+"");
//                }
//                else if (f.equals("Square Centimeter") && t.equals("Square Centimeter")){
//                    ress = re*1 ;
//                    result.setText(ress+"");
//                }
//                else if (f.equals("Square Centimeter") && t.equals("Square Meter")){
//                    ress = re*0.0001 ;
//                    result.setText(ress+"");
//                }
//                else if (f.equals("Square Centimeter") && t.equals("Square kilometer")){
//                    ress = re*1.E-10  ;
//                    result.setText(ress+"");
//                }
//                else if (f.equals("Square Centimeter") && t.equals("Square Mile")){
//                    ress = re*3.861018768E-11 ;
//                    result.setText(ress+"");
//                }
//                else if (f.equals("Square Centimeter") && t.equals("Square Inch")){
//                    ress = re*0.15500031 ;
//                    result.setText(ress+"");
//                }
//                else if (f.equals("Square Mile") && t.equals("Square Mile")){
//                    ress = re*1 ;
//                    result.setText(ress+"");
//                }
//                else if (f.equals("Square Mile") && t.equals("Square Meter")){
//                    ress = re*492098100  ;
//                    result.setText(ress+"");
//                }
//                else if (f.equals("Square Mile") && t.equals("Square kilometer")){
//                    ress = re*492.0981  ;
//                    result.setText(ress+"");
//                }
//                else if (f.equals("Square Mile") && t.equals("Square Centimeter")){
//                    ress = re*4920981000000  ;
//                    result.setText(ress+"");
//                }
//                else if (f.equals("Square Mile") && t.equals("Square Inch")){
//                    ress = re*762753580507  ;
//                    result.setText(ress+"");
//                }
            }
        });


        }

    public void temperature(){
      froms = new String[]{"Celcius", "kelvin", "Farenheit"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,froms);
        from.setAdapter(adapter);
        to.setAdapter(adapter);



    }
    public void lenth(){
         froms = new String[]{"Meter" ,"kilometer" ,"Centimeter" , "Mile" ,"Inch"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,froms);
        from.setAdapter(adapter);
        to.setAdapter(adapter);
    }
//    public void area(){
//         froms = new String[] {"Square Meter" ,"Square kilometer" ,"Square Centimeter" , "Square Mile" ,"Square Inch"};
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,froms);
//        from.setAdapter(adapter);
//        to.setAdapter(adapter);
//    }
//    public void volume(){
//         froms = new String[]{"Cubic Meter" ,"Cubic kilometer" ,"Cubic Centimeter" };
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,froms);
//        from.setAdapter(adapter);
//        to.setAdapter(adapter);
   // }
    public void wieght(){
         froms =new String[] {"Kilogram" ,"Gram" ,"Miligram" , "Pound" , "Ounces"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,froms);
        from.setAdapter(adapter);
        to.setAdapter(adapter);
    }
    public void time(){
         froms = new String[] {"Second"  , "Minute" , "Hour" , "Day" , "Week" ,"Month"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,froms);
        from.setAdapter(adapter);
        to.setAdapter(adapter);
    
    }
    public void setenable(){
        from.setEnabled(true);
        to.setEnabled(true);
        value.setEnabled(true);
        result.setEnabled(true);
        enterresult.setEnabled(true);
        tex2.setEnabled(true);
        text3.setEnabled(true);
        text4.setEnabled(true);
        text5.setEnabled(true);

    }
    public void setdisable(){

        from.setEnabled(false);
        to.setEnabled(false);
        value.setEnabled(false);
        result.setEnabled(false);
        enterresult.setEnabled(false);
        tex2.setEnabled(false);
        text3.setEnabled(false);
        text4.setEnabled(false);
        text5.setEnabled(false);
    }}










