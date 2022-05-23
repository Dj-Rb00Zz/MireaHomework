package ru.mirea.andreev.mireaproject;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CalculateFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CalculateFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public CalculateFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CalculateFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static CalculateFragment newInstance(String param1, String param2) {
        CalculateFragment fragment = new CalculateFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_calculate,container, false);
        EditText ed = (EditText) view.findViewById(R.id.num1);
        EditText ed1 = (EditText) view.findViewById(R.id.num2);
        TextView result = (TextView) view.findViewById(R.id.result);
        Button buttonSum = (Button) view.findViewById(R.id.sum);
        Button buttonSub = (Button) view.findViewById(R.id.subtraction);
        Button buttonMult = (Button) view.findViewById(R.id.mult);
        Button buttonDiv = (Button) view.findViewById(R.id.division);
        buttonSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(ed.getText().toString());
                int num2 = Integer.parseInt(ed1.getText().toString());
                int res = num1 + num2;
                result.setText(Integer.toString(res));
            }
        });
        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(ed.getText().toString());
                int num2 = Integer.parseInt(ed1.getText().toString());
                int res = num1 - num2;
                result.setText(Integer.toString(res));
            }
        });
        buttonMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(ed.getText().toString());
                int num2 = Integer.parseInt(ed1.getText().toString());
                int res = num1 * num2;
                result.setText(Integer.toString(res));
            }
        });
        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1 = Integer.parseInt(ed.getText().toString());
                float num2 = Integer.parseInt(ed1.getText().toString());
                float res = num1 / num2;
                result.setText(Float.toString(res));
            }
        });
        return view;
    }
}