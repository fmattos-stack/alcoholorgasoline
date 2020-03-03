package com.example.alcoholorgasoline;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MainActivity extends AppCompatActivity {

    private EditText var_text_input;
    private TextView var_text_view_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        var_text_input = findViewById(R.id.text_input);
        var_text_view_result = findViewById(R.id.text_view_result);
    }

    public void function_button_calculate(View v){
        Double constant_value_of_diff = 0.7;
        Double gasoline_price = Double.parseDouble(var_text_input.getText().toString());
        Double result = gasoline_price * constant_value_of_diff;
        Double result_trunc = BigDecimal.valueOf(result).setScale(2, RoundingMode.HALF_UP).doubleValue();
        String show_result = getString(R.string.result_text);
        var_text_view_result.setText(show_result + result_trunc);
    }
}
