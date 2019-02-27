package com.example.androidrsa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.androidrsa.utils.RSA;

public class MainActivity extends AppCompatActivity {

    TextView tvEncrypted;
    Button bEncrypt;
    EditText etText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();



        bEncrypt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = etText.getText().toString().trim();
                if (text.isEmpty()){
                    etText.setError("enter text");
                    return;
                }

                String encryptedText = RSA.encryptData(text);


                tvEncrypted.setText(encryptedText);


            }
        });
    }

    private void initView() {

        etText = findViewById(R.id.et_to_encypt);
        bEncrypt = findViewById(R.id.button);
        tvEncrypted = findViewById(R.id.textView2);


    }


}
