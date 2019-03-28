package com.example.myapp3;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.Toast;
import java.util.ArrayList;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class MainActivity extends AppCompatActivity {

//    EditText e;
//    Button b;
//    TextView t;
//    String userName;
//    LinearLayout linearLayout;
//    Switch s;

    GridView gridView;
    ArrayList<String> list;
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        e=findViewById(R.id.e);
//        b=findViewById(R.id.b);
//        t=findViewById(R.id.t);
//
//        b.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                userName = e.getText().toString();
//
//                t.setText(userName);
//            }
//        });
//        s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
//                if (b){
//                    linearLayout.setBackgroundColor(Color.parseColor("red"));
//                }
//                else{
//                    linearLayout.setBackgroundColor(Color.parseColor("blue"));
//                }
//            }
//        });

        list = new ArrayList<>();
        list.add(0,"Justin Mathews");
        list.add(1,"Myla Micheal");
        list.add(2,"Celia Ware");
        list.add(3,"Stella Carter");
        list.add(4,"Wendy Anthony");
        list.add(5,"Agustin Casey");
        list.add(6,"Carina Benson");
        list.add(7,"Isaac Gonzales");
        list.add(8,"Jagger Mills");
        list.add(9,"Sofia Bush");

        adapter = new ArrayAdapter<String>(this,R.layout.custom_row,R.id.txt,list);
        gridView=findViewById(R.id.Glist);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                    LayoutInflater inflater=getLayoutInflater();
                    View layout=inflater.inflate(R.layout.custom_row,(ViewGroup) findViewById(R.id.linear));
                    Toast toast=new Toast(MainActivity.this);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.show();

            }
        });

    }
}
