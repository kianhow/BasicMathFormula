package com.example.a17010390.basicmathformula;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 17010390 on 18/7/2018.
 */

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<Formula> math_formula;

    public CustomAdapter(@NonNull Context context, int resource, ArrayList<Formula> movieList) {
        super(context, resource, movieList);
        this.parent_context = context;
        this.layout_id = resource;
        this.math_formula = movieList;
    }

    public View getView(int position, @NonNull View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(layout_id, parent, false);
        TextView tvArea = rowView.findViewById(R.id.tvArea);
        TextView tvLength = rowView.findViewById(R.id.tvLength);
        TextView tvType = rowView.findViewById(R.id.tvType);

        Formula currentItem = math_formula.get(position);

        tvArea.setText(currentItem.getArea());
        tvLength.setText(currentItem.getLength());
        tvType.setText(currentItem.getType());

        return rowView;
    }
}
