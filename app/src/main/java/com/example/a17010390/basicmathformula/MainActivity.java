package com.example.a17010390.basicmathformula;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvFormula;
    ArrayList<Formula> alFormula;
    CustomAdapter caFormula;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvFormula = findViewById(R.id.lvFormula);
        alFormula = new ArrayList<>();
        Formula formula1 = new Formula("Area of rectangle", "Length x Length", "Area");
        Formula formula2 = new Formula("Area of triangle", "(Length of base x Length)/2", "Area");
        Formula formula3 = new Formula("Area of cube", "Length x Length x Length", "Volume");

        alFormula.add(formula1);
        alFormula.add(formula2);
        alFormula.add(formula3);

        caFormula = new CustomAdapter(this, R.layout.math_formula, alFormula);
        lvFormula.setAdapter(caFormula);
    }
}
