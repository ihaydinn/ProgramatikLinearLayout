package com.ismailhakkiaydin.programatiklinearlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {

    private LinearLayout pnl;
    private ScrollView sv;
    private CheckBox chk;
    private Button btn;



    private void init(){

        sv = new ScrollView(this);
        pnl = new LinearLayout(this);
        pnl.setOrientation(LinearLayout.VERTICAL);

        for (int i=1; i<=15; i++){
            if(i % 2 == 0){
                chk = new CheckBox(this);
               // chk.setId(i);
                chk.setText("CheckBox" + i);

                LinearLayout.LayoutParams lp1 = new LinearLayout.LayoutParams(800, 180);
                lp1.setMargins(10,5,10,5);
                chk.setLayoutParams(lp1);
                lp1.gravity = Gravity.RIGHT;

                pnl.addView(chk);
            }
            else{
                btn = new Button(this);
                //btn.setId(i);
                btn.setText("Button" + i);

                LinearLayout.LayoutParams lp2 = new LinearLayout.LayoutParams(850, 190);
                lp2.setMargins(10,5,10,5);
                btn.setLayoutParams(lp2);
                lp2.gravity = Gravity.LEFT;

                pnl.addView(btn);
            }
        }

        sv.addView(pnl);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        init();
        setContentView(sv);
    }

}
