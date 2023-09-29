package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myapplication.CalculoMediaController;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private EditText nota1, nota2, nota3;
    private Button calcular;
    private TextView media;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nota1 = findViewById(R.id.nota1);
        nota2 = findViewById(R.id.nota2);
        nota3 = findViewById(R.id.nota3);
        calcular = findViewById(R.id.buttonCalcular);
        media = findViewById(R.id.resultadoMedia);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Float mediaCalculada = CalculoMediaController.getCalcularMedia(
                        nota1.getText().toString(),
                        nota2.getText().toString(),
                        nota3.getText().toString()
                );

                media.setVisibility(View.VISIBLE);
                media.setText(String.format(Locale.getDefault(), "Média: %.2f", mediaCalculada));
            }
        });
    }
}
