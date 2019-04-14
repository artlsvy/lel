package com.example.lel;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int OPERATION = 0;
    String FIRSTVAR;
    String SECONDVAR;
    TextView window;

    public void writeText(String input) {

        String current = window.getText().toString();
        window.setText(current + input);
    }

    public void deleteText() {
        window.setText("");
    }

    public void createFirstVar() {
        FIRSTVAR = window.getText().toString();
    }

    public void createSecondVar() {
        SECONDVAR = window.getText().toString();
    }

    public String calculate(int operation, int firstvar, int secondvar) {
        String res = "";
        if ((secondvar == 0) && (operation == 4)) {
            res = "cannot /0";
        }
        switch (operation) {
            case 1:
                res = Integer.toString(firstvar + secondvar);
                break;
            case 2:
                res = Integer.toString(firstvar - secondvar);
                break;
            case 3:
                res = Integer.toString(firstvar * secondvar);
                break;
            case 4:
                res = Integer.toString(firstvar / secondvar);
                break;
        }
        return res;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btn1 = findViewById(R.id.button);
        final Button btn2 = findViewById(R.id.button2);
        final Button btn3 = findViewById(R.id.button3);
        final Button btn4 = findViewById(R.id.button4);
        final Button btn5 = findViewById(R.id.button5);
        final Button btn6 = findViewById(R.id.button6);
        final Button btn7 = findViewById(R.id.button7);
        final Button btn8 = findViewById(R.id.button8);
        final Button btn9 = findViewById(R.id.button9);
        final Button btn0 = findViewById(R.id.button10);
        final Button btnC = findViewById(R.id.cBtn);
        final Button btnPlus = findViewById(R.id.addBtn);
        final Button btn1Minus = findViewById(R.id.minusBtn);
        final Button btnSub = findViewById(R.id.subBtn);
        final Button btnTimes = findViewById(R.id.timesBtn);
        final Button btnEquals = findViewById(R.id.equals);

        window = findViewById(R.id.textView);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeText("1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeText("2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeText("3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeText("4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeText("5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeText("6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeText("7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeText("8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeText("9");
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeText("0");
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createFirstVar();
                OPERATION = 1;
                deleteText();
            }
        });
        btn1Minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createFirstVar();
                OPERATION = 2;
                deleteText();
            }
        });

        btnTimes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createFirstVar();
                OPERATION = 3;
                deleteText();
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createFirstVar();
                OPERATION = 4;
                deleteText();
            }
        });


        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deleteText();
            }
        });

        btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createSecondVar();
                window.setText(calculate(OPERATION, Integer.parseInt(FIRSTVAR), Integer.parseInt(SECONDVAR)));
            }
        });
    }


}
