package dmi.com.perfil;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    TextView nombre;
    TextView codigo;
    Button btn_coe;
    Button btn_algebra;
    Button btn_logica;
    Button btn_bidi;
    Button btn_diseño;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = findViewById(R.id.tv_nombre);
        codigo = findViewById(R.id.tv_codigo);
        btn_coe = findViewById(R.id.btn_coe);
        btn_algebra = findViewById(R.id.btn_algebra);
        btn_logica = findViewById(R.id.btn_logica);
        btn_diseño = findViewById(R.id.btn_diseño);
        btn_bidi = findViewById(R.id.btn_bidi);

       // db.getReference().child("usuarios").Aqui hay que leer el codigo del usuario y sacar el nombre;

        btn_coe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Coe.class);
                startActivity(intent);

            }
        });
    }
}
