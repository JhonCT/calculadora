package com.example.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText screen;
    private double oper1, oper2, res;
    int ope;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        screen = findViewById(R.id.editText);
    }

    public void bt1 (View v){
        String cap = screen.getText().toString();
        cap=cap+"1";
        screen.setText(cap);
    }

    public void bt2 (View v){
        String cap= screen.getText().toString();
        cap=cap+"2";
        screen.setText(cap);

    }
    public void bt3 (View v){
        String cap= screen.getText().toString();
        cap=cap+"3";
        screen.setText(cap);

    }
    public void bt4 (View v){
        String cap= screen.getText().toString();
        cap=cap+"4";
        screen.setText(cap);

    }
    public void bt5 (View v){
        String cap= screen.getText().toString();
        cap=cap+"5";
        screen.setText(cap);

    }
    public void bt6 (View v){
        String cap= screen.getText().toString();
        cap=cap+"6";
        screen.setText(cap);

    }
    public void bt7 (View v){
        String cap= screen.getText().toString();
        cap=cap+"7";
        screen.setText(cap);

    }
    public void bt8 (View v){
        String cap= screen.getText().toString();
        cap=cap+"8";
        screen.setText(cap);
    }

    public void bt9 (View v){
        String cap= screen.getText().toString();
        cap=cap+"9";
        screen.setText(cap);
    }

    public void bt0 (View v){
        String cap= screen.getText().toString();
        cap=cap+"0";
        screen.setText(cap);
    }

    public void plus(View v){
        try{
            String aux1= screen.getText().toString();
            oper1= Double.parseDouble(aux1);
        }catch(NumberFormatException nfe){};
        screen.setText("");
        ope=1;
    }

    public void minus(View v){
        try{
            String aux1= screen.getText().toString();
            oper1= Double.parseDouble(aux1);
        }catch(NumberFormatException nfe){};
        screen.setText("");
        ope=2;
    }
    public void multiplication(View v){
        try{
            String aux1= screen.getText().toString();
            oper1= Double.parseDouble(aux1);
        }catch(NumberFormatException nfe){};
        screen.setText("");
        ope=3;
    }

    public void division(View v){
        try{
            String aux1= screen.getText().toString();
            oper1= Double.parseDouble(aux1);
        }catch(NumberFormatException nfe){};
        screen.setText("");
        ope=4;
    }

    public void empowered(View v){
        try{
            String aux1= screen.getText().toString();
            oper1= Double.parseDouble(aux1);
        }catch(NumberFormatException nfe){};
        screen.setText("");
        ope=5;
    }

    public void percentaje(View v) {
        try{ String aux1= screen.getText().toString();
            oper1= Double.parseDouble(aux1);
        }catch(NumberFormatException nfe){};
        screen.setText("");
        ope=6;
    }

    public void squatRoot(View v) {
        try{
            String aux1= screen.getText().toString();
            oper1= Double.parseDouble(aux1);
        }catch(NumberFormatException nfe){};
        screen.setText(" v(" +oper1+")");
        ope=7;
    }

    public void equal(View v){
        try{
            String aux2= screen.getText().toString();
            oper2= Double.parseDouble(aux2);
        }catch(NumberFormatException nfe){};
        screen.setText("");

        if (ope==1){
            res=oper1+oper2;

        }else if (ope==2){
            res=oper1-oper2;

        }else if (ope==3){
            res=oper1*oper2;

        }else if (ope==4){
            if(oper2==0){
                screen.setText("Numero no se puede dividir para 0");
            }else{
                res= oper1/oper2;
            }

        }else if (ope==5){
            res=Math.pow(oper1, oper2);

        }else if (ope==6){
            res=oper2*(oper1/100.0);

        }else if (ope==7){
            res=Math.sqrt(oper1);

        }else if(ope==8){
            double rad=Math.toRadians(oper1);
            res= (Math.sin(rad));

        }else if(ope==9){
            double rad=Math.toRadians(oper1);
            res= (Math.cos(rad));

        }else if(ope==10){
            double rad=Math.toRadians(oper1);
            res= (Math.tan(rad));

        }else if(ope==11){
            double angulo = (Math.asin(oper1));
            res=Math.toDegrees(angulo);

        }else if(ope==12){
            double angulo = (Math.acos(oper1));
            res=Math.toDegrees(angulo);

        }else if(ope==13){
            double angulo = (Math.atan(oper1));
            res=Math.toDegrees(angulo);

        }else if (ope==14){
            res=1;
            for(double i=oper1; i>=1; i--){
                res=res*i;
            }
        }
        screen.setText(""+res);
        oper1=res;
    }
}
