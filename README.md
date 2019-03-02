# ProgramatikLinearLayout

package com.ismailhakkiaydin.basitlinearlayoutcalisma;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    LinearLayout ll;
    TextView tv;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        ll = new LinearLayout(this);
        tv= new TextView(this);
        btn = new Button(this);

        LinearLayout.LayoutParams boyutlar = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT);
        ll.setLayoutParams(boyutlar);



        LinearLayout.LayoutParams viewBoyut = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT);
        tv.setLayoutParams(viewBoyut);
        btn.setLayoutParams(viewBoyut);

        ll.setOrientation(LinearLayout.VERTICAL);

        tv.setText("Selam Dünya...");
        btn.setText("Beni Tıklayabilirsin");

        ll.addView(tv);
        ll.addView(btn);

        setContentView(ll);

    }
}
