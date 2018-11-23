package dmi.com.perfil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

public class Coe extends AppCompatActivity {

    FirebaseAuth auth;
    FirebaseDatabase db;

    Button btn_escritura;
    Button btn_lectura;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coe);

        btn_escritura = findViewById(R.id.btn_escritura);
        btn_lectura = findViewById(R.id.btn_lectura);


        btn_lectura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
