package com.example.apple.navigate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.text.NumberFormat;
import java.text.DecimalFormat;
import java.util.Locale;

public class CalculateActivity extends AppCompatActivity {

    private TextView tvTitle, tvSubTitle, tvOutputName, tvOutputRate;
    private EditText etInput;
    private Button btnCalculate;
    private double billAmount = 0.0;
    private static final NumberFormat currencyFormat =
            NumberFormat.getCurrencyInstance();
    private String currencyName;
    private double currencyRate;
    private String Country;
    private TextView input;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);

        tvTitle = (TextView) findViewById(R.id.tvTitle);
        tvSubTitle = (TextView) findViewById(R.id.tvSubTitle);
        tvOutputName = (TextView) findViewById(R.id.tvOutputName);
        tvOutputRate = (TextView) findViewById(R.id.tvOutputRate);
        input = (TextView) findViewById(R.id.input);
        etInput = (EditText) findViewById(R.id.etInput);
        btnCalculate = (Button) findViewById(R.id.btnCalculate);

        Intent intent = getIntent();
        currencyName = intent.getStringExtra("currency_name");
        currencyRate = intent.getDoubleExtra("currency_rate", 0);
        Country = intent.getStringExtra("Country");

        input.setText((Country));
        tvTitle.setText(Country + " to " + currencyName.toUpperCase());
        tvSubTitle.setText("Rate 1:" + currencyRate);
        tvOutputName.setText(currencyName.toUpperCase() + ": ");
        etInput.addTextChangedListener(amountEditTextWatcher);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (etInput.getText().toString().length() == 0){
                    return;
                }

                double input;
                String formatedInput;
                try{
                    formatedInput = etInput.getText().toString().replaceAll(",", "");
                    input = Double.parseDouble(formatedInput);
                }
                catch (NumberFormatException e){
                    etInput.setText("");
                    return;
                }

                double output = input * currencyRate;
                DecimalFormat decimalFormat = new DecimalFormat("#,###.##");
                tvOutputRate.setText(decimalFormat.format(output));
            }
        });
    }
    private final TextWatcher amountEditTextWatcher = new TextWatcher() {
        // called when the user modifies the bill amount

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }


        @Override
        public void afterTextChanged(Editable s) {

            etInput.removeTextChangedListener(this);

            try {
                String originalString = s.toString();

                Long longval;
                if (originalString.contains(",")) {
                    originalString = originalString.replaceAll(",", "");
                }
                longval = Long.parseLong(originalString);


                DecimalFormat formatter = (DecimalFormat) NumberFormat.getInstance(Locale.US);
                formatter.applyPattern("#,###,###,###");
                String formattedString = formatter.format(longval);

                //setting text after format to EditText
                etInput.setText(formattedString);
                etInput.setSelection(etInput.getText().length());
            } catch (NumberFormatException nfe) {
                nfe.printStackTrace();
            }

            etInput.addTextChangedListener(this);

        }

        @Override
        public void beforeTextChanged(
                CharSequence s, int start, int count, int after) { }

    };
}

