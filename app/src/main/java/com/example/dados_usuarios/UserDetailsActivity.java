package com.example.dados_usuarios;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class UserDetailsActivity extends AppCompatActivity {
    private TextView textViewUsername;
    private TextView textViewPassword;
    private TextView textViewFakeData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_details);

        textViewUsername = findViewById(R.id.textViewUsername);
        textViewPassword = findViewById(R.id.textViewPassword);
        textViewFakeData = findViewById(R.id.textViewFakeData);

        // Obter os dados passados da atividade anterior
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String username = extras.getString("username");
            String password = extras.getString("password");
            String fakeData = extras.getString("fakeData");

            // Exibir os dados do usuário na nova atividade
            textViewUsername.setText("Nome de Usuário: " + username);
            textViewPassword.setText("Senha: " + password);
            textViewFakeData.setText(fakeData);
        }
    }
}
