package com.example.calculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import static com.example.calculator.Calculate.calculate;
import static com.example.calculator.Calculate.sc_calculate;


public class MainActivity extends AppCompatActivity {

    Button select;
    String string = "";
    TextView show;
    private static String TAG = "LIFTCYCLE";
    int which;
    TextView newShow;
    Button selectTranslator;



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);

        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null){
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        return true;
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.simpleCalculator:
                //Toast.makeText(this, "标准计算器！", Toast.LENGTH_SHORT).show();
                setContentView(R.layout.activity_main);
                show = (TextView) findViewById(R.id.input);
                click();
                select = (Button) findViewById(R.id.equal);
                select.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        string += "=";
                        double stringAdd = calculate(string);
                        string = string + stringAdd;
                        show.append("=" + stringAdd);
                    }
                });
                clear();
                break;
            case R.id.scientificCalculator:
                //Toast.makeText(this, "科学计算器！", Toast.LENGTH_SHORT).show();
                string = "";
                setContentView(R.layout.sc_calculator);
                show = (TextView) findViewById(R.id.input);
                sc_click();
                select = (Button) findViewById(R.id.equal);
                select.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        string += "=";
                        double stringAdd = sc_calculate(string);
                        string = string + stringAdd;
                        show.append("=" + stringAdd);
                    }
                });
                clear();
                break;
            case R.id.translator:
                //Toast.makeText(this, "换算器！", Toast.LENGTH_SHORT).show();
                selectTranslator();
                break;
            case R.id.history:
                //Toast.makeText(this, "历史记录！", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, History.class);
                startActivity(intent);
                break;
            case R.id.help:
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                final LayoutInflater inflater = getLayoutInflater();
                final View v1 = inflater.inflate(R.layout.help_dialog, null);
                builder.setView(v1).setTitle("帮助");
                builder.show();
                break;
            case android.R.id.home:
                //this.finish(); // back button
                selectTranslator();
//                Intent intentHome = new Intent(this, MainActivity.class);
//                intentHome.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//                this.startActivity(intentHome);

                return true;
            default:
        }
        return true;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        show = (TextView) findViewById(R.id.input);
        click();
        select = (Button) findViewById(R.id.equal);
        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string += "=";
                double stringAdd = calculate(string);
                string = string + stringAdd;
                show.append("=" + stringAdd);
            }
        });
        clear();

        //感知横屏状态
        if(this.getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE){

            string = "";
            setContentView(R.layout.activity_main_land);
            show = (TextView) findViewById(R.id.input);
            sc_click();
            select = (Button) findViewById(R.id.equal);
            select.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    string += "=";
                    double stringAdd = sc_calculate(string);
                    string = string + stringAdd;
                    show.append("=" + stringAdd);
                }
            });
            clear();
        }
    }

    public void selectTranslator(){
        setContentView(R.layout.translator);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        selectTranslator = (Button)findViewById(R.id.length);
        selectTranslator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.length_translator);
                Resources res =getResources();
                String[] length = res.getStringArray(R.array.length);
                spinnerDesign(length, "length");
            }
        });

        selectTranslator = (Button)findViewById(R.id.volume);
        selectTranslator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.volume_translator);
                Resources res =getResources();
                String[] volume = res.getStringArray(R.array.volume);
                spinnerDesign(volume, "volume");
            }
        });

        selectTranslator = (Button)findViewById(R.id.square);
        selectTranslator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.square_translator);
                Resources res =getResources();
                String[] square = res.getStringArray(R.array.square);
                spinnerDesign(square, "square");
            }
        });

        selectTranslator = (Button)findViewById(R.id.math);
        selectTranslator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.math_translator);
                Resources res =getResources();
                String[] math = res.getStringArray(R.array.math);
                num_spinnerDesign(math, "math");
            }
        });

        selectTranslator = (Button)findViewById(R.id.rate);
        selectTranslator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.rate_translator);
                Resources res =getResources();
                String[] rate = res.getStringArray(R.array.rate);
                spinnerDesign(rate, "rate");
            }
        });

        selectTranslator = (Button)findViewById(R.id.time);
        selectTranslator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.time_translator);
                Calendar calendar = Calendar.getInstance();
                String mYear = String.valueOf(calendar.get(Calendar.YEAR));
                String mMonth = String.valueOf(calendar.get(Calendar.MONTH) + 1);        //获取日期的月
                String mDay = String.valueOf(calendar.get(Calendar.DAY_OF_MONTH));      //获取日期的天
                final EditText formerDate = (EditText)findViewById(R.id.formerDate);
                final EditText laterDate = (EditText)findViewById(R.id.laterDate);
                formerDate.setText(mYear + "-" + mMonth + "-" + mDay);
                final String[] result = {""};
                Button button = (Button)findViewById(R.id.translate);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        try {
                            result[0] = "" + timeCalculate(formerDate.getText().toString(), laterDate.getText().toString());
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        TextView output = (TextView)findViewById(R.id.output);
                        output.setText(result[0] + "天");
                    }
                });

                final EditText formerDate2 = (EditText)findViewById(R.id.formerDate2);
                final EditText laterDate2 = (EditText)findViewById(R.id.laterDate2);
                formerDate2.setText(mYear + "-" + mMonth + "-" + mDay);
                Button button2 = (Button)findViewById(R.id.translate2);
                button2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        try {
                            result[0] = afterTimeCalculate(formerDate2.getText().toString(), laterDate2.getText().toString());
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        TextView output2 = (TextView)findViewById(R.id.output2);
                        output2.setText("(日期)" + result[0]);
                    }
                });

            }
        });
    }

    public int timeCalculate(String formerDate, String laterDate) throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
        cal.setTime(sdf.parse(formerDate));
        long time1 = cal.getTimeInMillis();
        cal.setTime(sdf.parse(laterDate));
        long time2 = cal.getTimeInMillis();
        long between_days = (time2 - time1) / (1000 * 3600 * 24);
        return Integer.parseInt(String.valueOf(between_days));
    }
    public String afterTimeCalculate(String formerDate, String plusDate) throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
        cal.setTime(sdf.parse(formerDate));
        long time1 = cal.getTimeInMillis();
        long day = (Integer.parseInt(plusDate) * 24 * 3600 * 1000) + time1;
        cal.setTimeInMillis(day);
        return sdf.format(day);
    }

    public void spinnerDesign(final String[] design, final String type){
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, design);  //创建一个数组适配器
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);     //设置下拉列表框的下拉选项样式
        final Spinner spinner1 = findViewById(R.id.spinner1);
        spinner1.setAdapter(adapter1);

        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, design);  //创建一个数组适配器
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);     //设置下拉列表框的下拉选项样式
        final Spinner spinner2 = findViewById(R.id.spinner2);
        spinner2.setAdapter(adapter2);

        show = (TextView) findViewById(R.id.in);
        translate_click();
        select = (Button) findViewById(R.id.translate);
        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                newShow = (TextView) findViewById(R.id.out);
                newShow.setText("");
                String former = spinner1.getSelectedItem().toString();
                String later = spinner2.getSelectedItem().toString();
                String afterTranslate = null;
                try {
                    afterTranslate = Translate.translate(former, later, string, type);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                newShow.append(afterTranslate);
            }
        });
        translate_clear();
    }

    public void num_spinnerDesign(final String[] design, final String type){
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, design);  //创建一个数组适配器
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);     //设置下拉列表框的下拉选项样式
        final Spinner spinner1 = findViewById(R.id.spinner1);
        spinner1.setAdapter(adapter1);

        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, design);  //创建一个数组适配器
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);     //设置下拉列表框的下拉选项样式
        final Spinner spinner2 = findViewById(R.id.spinner2);
        spinner2.setAdapter(adapter2);

        show = (TextView) findViewById(R.id.in);
        num_translate_click();
        select = (Button) findViewById(R.id.translate);
        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                newShow = (TextView) findViewById(R.id.out);
                newShow.setText("");
                String former = spinner1.getSelectedItem().toString();
                String later = spinner2.getSelectedItem().toString();
                String afterTranslate = null;
                try {
                    afterTranslate = Translate.translate(former, later, string, type);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                newShow.append(afterTranslate);
            }
        });
        translate_clear();
    }

    public void translate_click(){
        select = (Button) findViewById(R.id.button9);
        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string += "9";
                show.append("9");
            }
        });
        select = (Button) findViewById(R.id.button8);
        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string += "8";
                show.append("8");
            }
        });
        select = (Button) findViewById(R.id.button7);
        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string += "7";
                show.append("7");
            }
        });
        select = (Button) findViewById(R.id.button6);
        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string += "6";
                show.append("6");
            }
        });
        select = (Button) findViewById(R.id.button5);
        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string += "5";
                show.append("5");
            }
        });
        select = (Button) findViewById(R.id.button4);
        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string += "4";
                show.append("4");
            }
        });
        select = (Button) findViewById(R.id.button3);
        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string += "3";
                show.append("3");
            }
        });
        select = (Button) findViewById(R.id.button2);
        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string += "2";
                show.append("2");
            }
        });
        select = (Button) findViewById(R.id.button1);
        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string += "1";
                show.append("1");
            }
        });
        select = (Button) findViewById(R.id.button0);
        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string += "0";
                show.append("0");
            }
        });
        select = (Button) findViewById(R.id.point);
        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string += ".";
                show.append(".");
            }
        });

    }

    public void num_translate_click(){
        translate_click();
        select = (Button) findViewById(R.id.buttonA);
        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string += "a";
                show.append("A");
            }
        });
        select = (Button) findViewById(R.id.buttonB);
        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string += "b";
                show.append("B");
            }
        });
        select = (Button) findViewById(R.id.buttonC);
        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string += "c";
                show.append("C");
            }
        });
        select = (Button) findViewById(R.id.buttonD);
        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string += "d";
                show.append("D");
            }
        });
        select = (Button) findViewById(R.id.buttonE);
        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string += "e";
                show.append("E");
            }
        });
        select = (Button) findViewById(R.id.buttonF);
        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string += "f";
                show.append("F");
            }
        });
    }

    public void translate_clear() {
        select = (Button) findViewById(R.id.c);
        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show.setText("");
                string = "";
                newShow.setText("");
//                result = 0;
//                sc_result = 0;
            }
        });
        select = (Button) findViewById(R.id.back);
        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                char[] calculateChar = string.toCharArray();
                string = "";
                for (int i = 0; i < calculateChar.length - 1; i++) {
                    string = string + calculateChar[i];
                }
                show.setText(string);
            }
        });
    }


    public void click() {
        select = (Button) findViewById(R.id.button9);
        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string += "9";
                show.append("9");
            }
        });
        select = (Button) findViewById(R.id.button8);
        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string += "8";
                show.append("8");
            }
        });
        select = (Button) findViewById(R.id.button7);
        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string += "7";
                show.append("7");
            }
        });
        select = (Button) findViewById(R.id.button6);
        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string += "6";
                show.append("6");
            }
        });
        select = (Button) findViewById(R.id.button5);
        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string += "5";
                show.append("5");
            }
        });
        select = (Button) findViewById(R.id.button4);
        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string += "4";
                show.append("4");
            }
        });
        select = (Button) findViewById(R.id.button3);
        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string += "3";
                show.append("3");
            }
        });
        select = (Button) findViewById(R.id.button2);
        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string += "2";
                show.append("2");
            }
        });
        select = (Button) findViewById(R.id.button1);
        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string += "1";
                show.append("1");
            }
        });
        select = (Button) findViewById(R.id.button0);
        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string += "0";
                show.append("0");
            }
        });
//        select = (Button) findViewById(R. id.percent);
//        select.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                string += "%";
//                show.append("%");
//            }
//        });
        select = (Button) findViewById(R.id.plus);
        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string += "+";
                show.append("+");
            }
        });
        select = (Button) findViewById(R.id.minus);
        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string += "-";
                show.append("-");
            }
        });
        select = (Button) findViewById(R.id.multiple);
        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string += "×";
                show.append("×");
            }
        });
        select = (Button) findViewById(R.id.divide);
        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string += "÷";
                show.append("÷");
            }
        });
        select = (Button) findViewById(R.id.point);
        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string += ".";
                show.append(".");
            }
        });
    }

    public void sc_click() {
        click();
        select = (Button) findViewById(R.id.radical);
        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string += "√";
                show.append("√");
            }
        });
        select = (Button) findViewById(R.id.square);
        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string += "^2";
                show.append("^2");
            }
        });
        select = (Button) findViewById(R.id.math);
        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string += "^(-1)";
                show.append("^(-1)");
            }
        });
        select = (Button) findViewById(R.id.sin);
        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string += "sin(";
                show.append("sin(");
            }
        });
        select = (Button) findViewById(R.id.cos);
        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string += "cos(";
                show.append("cos(");
            }
        });
        select = (Button) findViewById(R.id.tan);
        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string += "tan(";
                show.append("tan(");
            }
        });
        select = (Button) findViewById(R.id.zyx);
        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string += "!";
                show.append("!");
            }
        });
        select = (Button) findViewById(R.id.lg);
        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string += "lg(";
                show.append("lg(");
            }
        });
        select = (Button) findViewById(R.id.ln);
        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string += "ln(";
                show.append("ln(");
            }
        });
        select = (Button) findViewById(R.id.bracket1);
        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string += "(";
                show.append("(");
            }
        });
        select = (Button) findViewById(R.id.bracket2);
        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string += ")";
                show.append(")");
            }
        });
        select = (Button) findViewById(R.id.e);
        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string += "e";
                show.append("e");
            }
        });
        select = (Button) findViewById(R.id.pai);
        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string += "Π";
                show.append("Π");
            }
        });
    }

    String[] history = new String[10];
    int num = 0;
    public void clear() {
        select = (Button) findViewById(R.id.c);
        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                history[num] = string;
                num++;
                show.setText("");
                string = "";
//                result = 0;
//                sc_result = 0;
            }
        });
        select = (Button) findViewById(R.id.back);
        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                char[] calculateChar = string.toCharArray();
                string = "";
                for (int i = 0; i < calculateChar.length - 1; i++) {
                    string = string + calculateChar[i];
                }
                show.setText(string);
            }
        });
    }

}