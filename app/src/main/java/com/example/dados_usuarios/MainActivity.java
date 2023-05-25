package com.example.dados_usuarios;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editTextUsername;
    private EditText editTextPassword;
    private Button buttonLogin;
    private TextView textViewError;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextUsername = findViewById(R.id.editTextUsername);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonLogin = findViewById(R.id.buttonLogin);
        textViewError = findViewById(R.id.textViewError);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = editTextUsername.getText().toString();
                String password = editTextPassword.getText().toString();

                if (password.equals("12345")) {
                    textViewError.setVisibility(View.GONE);

                    // Dados fakes
                    String fakeData = "Dados Fakes: 1234567890";
                    // Navegar para a próxima atividade e passar os dados
                    Intent intent = new Intent(MainActivity.this, UserDetailsActivity.class);
                    intent.putExtra("username", username);
                    intent.putExtra("password", password);
                    intent.putExtra("fakeData", fakeData);
                    startActivity(intent);
                } else {
                    textViewError.setVisibility(View.VISIBLE);
                    textViewError.setText("Senha incorreta!");
                }
            }
        });
    }
}
