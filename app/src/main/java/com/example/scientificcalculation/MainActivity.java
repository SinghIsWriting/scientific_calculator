package com.example.scientificcalculation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.io.IOError;
import java.io.IOException;
import java.util.function.DoubleUnaryOperator;

public
class MainActivity extends AppCompatActivity {

    TextView primary, secondary ;
    String sign, value1, specialFunction, value2;
    Double num1, num2, num3, result;
    String Pi = String.valueOf(3.14159265);
    String e = String.valueOf(2.7182818284);
    boolean hasdot, isSpecialFunction;

    @Override
    protected
    void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        primary = findViewById(R.id.idTvPrimary);
        secondary = findViewById(R.id.idTcSecondary);
        primary.setText("0");

        hasdot = false;
        isSpecialFunction = false;
    }

    public
    void btnSine(View view) {
        specialFunction = "sin";
        isSpecialFunction = true;
        primary.setText(null);
        secondary.setText("sin");
        hasdot = false;
    }

    public
    void btnCos(View view) {
        specialFunction = "cos";
        isSpecialFunction = true;
        primary.setText(null);
        secondary.setText("cos");
        hasdot = false;
    }

    public
    void btnTan(View view) {
        specialFunction = "tan";
        isSpecialFunction = true;
        primary.setText(null);
        secondary.setText("tan");
        hasdot = false;
    }

    public
    void btnLog(View view) {
        specialFunction = "log";
        isSpecialFunction = true;
        primary.setText(null);
        secondary.setText("log");
        hasdot = false;
    }

    public
    void btnLn(View view) {
        specialFunction = "ln";
        isSpecialFunction = true;
        primary.setText(null);
        secondary.setText("ln");
        hasdot = false;
    }

    public
    void btn_exponent(View view) {
        specialFunction = "ex";
        isSpecialFunction = true;
        primary.setText(null);
        secondary.setText("e^");
        hasdot = false;
    }

    public
    void btn_power(View view){
        specialFunction = "power";
        isSpecialFunction = true;
        value1 = primary.getText().toString();
        secondary.setText((value1+""));
        primary.setText(null);
        hasdot = false;
    }

    public
    void btn_inverse(View view){
        specialFunction = "inverse";
        isSpecialFunction = true;
        value1 = primary.getText().toString();
        if (value1.equals("0")) {
            secondary.setText("Error !");
        }
        if(value1 != ""){
            num1 = Double.parseDouble(value1);
            num2 = 1 / num1;
            primary.setText(num2 + "");
            secondary.setText("1/" + num1 + "");
        } else{
            secondary.setText("Error !");
        }
        hasdot = false;
    }

    public
    void btn_nine(View view) {
        if(primary.getText().toString() != "0") {
            primary.setText(primary.getText() + "9");
        }else{
            primary.setText("9");
        }
    }

    public
    void btn_eight(View view) {
        if(primary.getText().toString() != "0") {
            primary.setText(primary.getText() + "8");
        }else{
            primary.setText("8");
        }
    }

    public
    void btn_seven(View view) {
        if(primary.getText().toString() != "0") {
            primary.setText(primary.getText() + "7");
        }else{
            primary.setText("7");
        }
    }

    public
    void btn_six(View view) {
        if(primary.getText().toString() != "0") {
            primary.setText(primary.getText() + "6");
        }else{
            primary.setText("6");
        }
    }

    public
    void btn_five(View view) {
        if(primary.getText().toString() != "0") {
            primary.setText(primary.getText() + "5");
        }else{
            primary.setText("5");
        }
    }

    public
    void btn_four(View view) {
        if(primary.getText().toString() != "0") {
            primary.setText(primary.getText() + "4");
        }else{
            primary.setText("4");
        }
    }

    public
    void btn_three(View view) {
        if(primary.getText().toString() != "0") {
            primary.setText(primary.getText() + "3");
        }else{
            primary.setText("3");
        }
    }

    public
    void btn_two(View view) {
        if(primary.getText().toString() != "0") {
            primary.setText(primary.getText() + "2");
        }else{
            primary.setText("2");
        }
    }

    public
    void btn_one(View view) {
        if(primary.getText().toString() != "0") {
            primary.setText(primary.getText() + "1");
        }else{
            primary.setText("1");
        }
    }

    public
    void btn_zero(View view) {
        primary.setText(primary.getText() + "0");
    }

    public
    void btn_divide(View view) {
        value1 = primary.getText().toString();
        if (value1 != null){
            sign = "/";
            primary.setText(null);
            secondary.setText(value1+"/");
            hasdot = false;
        }else {
            secondary.setText("Error !");
        }
    }

    public
    void btn_multiplication(View view) {
        value1 = primary.getText().toString();
        if (value1 != null){
            sign = "*";
            value1 = primary.getText().toString();
            primary.setText(null);
            secondary.setText(value1+"*");
            hasdot = false;
        }else{
            secondary.setText("Error !");
        }

    }

    public
    void btn_minus(View view) {
        value1 = primary.getText().toString();
        if (value1 != null){
            sign = "-";
            value1 = primary.getText().toString();
            primary.setText(null);
            secondary.setText(value1+"-");
            hasdot = false;
        }else{
            secondary.setText("Error !");
        }

    }

    public
    void btn_plus(View view) {
        value1 = primary.getText().toString();
        if (value1 != null){
            sign = "+";
            value1 = primary.getText().toString();
            primary.setText(null);
            secondary.setText(value1+"+");
            hasdot = false;
        }else{
            secondary.setText("Error !");
        }

    }

    public
    void btn_pi(View view) {
        if(primary.getText().toString() != "0") {
            primary.setText(primary.getText() + Pi);
        }else{
            primary.setText(Pi);
        }
    }

    public
    void btn_dot(View view) {
        if (!hasdot){
            if (primary.getText().equals("")){
                primary.setText("0.");
            }else{
                primary.setText(primary.getText() + ".");
            }
            hasdot = true;
        }
    }

    public
    void btn_equal(View view) {
        if ((specialFunction == null && sign == null && value2 ==null) || primary.getText().equals("")){
            secondary.setText("Error !");
        }else if (specialFunction != null) {
            switch (specialFunction){
                default:
                    break;
                case "log":
                    value1 = primary.getText().toString();
                    num1 = Double.parseDouble(value1);
                    primary.setText(Math.log10(num1) + "");
                    specialFunction = null;
                    isSpecialFunction = false;
                    secondary.setText(null);
                    break;
                case "ex":
                    value1 = primary.getText().toString();
                    num1 = Double.parseDouble(value1);
                    num2 = Math.pow(Double.parseDouble(e), num1);
                    primary.setText(num2 + "");
                    secondary.setText("e^"+value1);
                    break;
                case "power":
                    value1 = secondary.getText().toString();
                    value2 = primary.getText().toString();
                    num1 = Double.parseDouble(value1);
                    num2 = Double.parseDouble(value2);
                    primary.setText(Math.pow(num1, num2)+"");
                    secondary.setText(num1+"^"+num2);
                    break;
                case "inverse":
                    secondary.setText(null);
                    break;
                case "ln":
                    value1 = primary.getText().toString();
                    num1 = Double.parseDouble(value1);
                    primary.setText(Math.log(num1) + "");
                    specialFunction = null;
                    isSpecialFunction = false;
                    secondary.setText(null);
                    break;
                case "sin":
                    value1 = primary.getText().toString();
                    num1 = Double.parseDouble(value1);
                    primary.setText(Math.sin(num1) + "");
                    specialFunction = null;
                    isSpecialFunction = false;
                    secondary.setText(null);
                    break;
                case "cos":
                    value1 = primary.getText().toString();
                    num1 = Double.parseDouble(value1);
                    primary.setText(Math.cos(num1) + "");
                    specialFunction = null;
                    isSpecialFunction = false;
                    secondary.setText(null);
                    break;
                case "tan":
                    value1 = primary.getText().toString();
                    num1 = Double.parseDouble(value1);
                    primary.setText(Math.tan(num1) + "");
                    specialFunction = null;
                    isSpecialFunction = false;
                    secondary.setText(null);
                    break;
                case "factorial":
                    secondary.setText("!");
                    value1 = primary.getText().toString();
                    num1 = Double.parseDouble(value1);
                    num3 = num1;
                    int i = Integer.parseInt(value1) - 1;
                    if(num3==0){
                        num1 = num3 + 1;
                    }else{
                        while (i>0){
                            num1 = num1 * i;
                            i--;
                        }
                    }
                    primary.setText(num1 + "");
                    specialFunction = null;
                    isSpecialFunction = false;
                    secondary.setText(null);
                    break;
                case "sqroot":
                    value1 = primary.getText().toString();
                    num1 = Double.parseDouble(value1);
                    if (num1>=0){
                        primary.setText(Math.sqrt(num1) + "");
                        specialFunction = null;
                        isSpecialFunction = false;
                        secondary.setText(null);
                        break;
                    }else{
                        secondary.setText("Error !");
                    }

            }
        }else if (sign != null){
                    value2 = primary.getText().toString();
                    num1 = Double.parseDouble(value1);
                    num2 = Double.parseDouble(value2);
                    primary.setText(null);

                    switch (sign){
                        default:
                            break;
                        case "+":
                            result = num1 + num2;
                            primary.setText(result + "");
                            break;
                        case "-":
                            result = num1 - num2;
                            primary.setText(result + "");
                            break;
                        case "*":
                            result = num1 * num2;
                            primary.setText(result + "");
                            break;
                        case "/":
                            if (num2 != 0){
                                result = num1 / num2;
                                primary.setText(result + "");
                                break;
                            }else {
                                secondary.setText("Error !");
                            }
                    }
                }
                else primary.setText("Error !");
            }


    public
    void btn_ac(View view) {
        primary.setText(null);
        secondary.setText(null);
        value2 = null;
        value1 = null;
        hasdot = false;
        sign = null;
    }

    public
    void btn_c(View view) {
        if (primary.getText().equals("")){
            primary.setText(null);
        }else {
            int len = primary.getText().length();
            String s = primary.getText().toString();
            if (s.charAt(len - 1) == '.'){
                hasdot = false;
                primary.setText(primary.getText().subSequence(0 , primary.getText().length() - 1));
            }else {
                primary.setText(primary.getText().subSequence(0 , primary.getText().length() - 1));
            }
        }
    }

    public
    void btn_fact(View view) {
        specialFunction = "factorial";
        isSpecialFunction = true;
        primary.setText(null);
        secondary.setText("!");
        hasdot = false;
    }

    public
    void btn_sqroot(View view) {
        specialFunction = "sqroot";
        isSpecialFunction = true;
        primary.setText(null);
        secondary.setText("√");
        hasdot = false;

    }

    public
    void btn_e(View view) {
        if(primary.getText().toString() != "0") {
            primary.setText(primary.getText() + e);
        }else{
            primary.setText(e);
        }
    }
}
