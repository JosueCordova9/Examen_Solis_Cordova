package fisei.com.examen_solis_cordova;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;

public class CActividad2S extends AppCompatActivity {


    EditText numero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cactividad2_s);

        numero = findViewById(R.id.CNumero_IngresoS);



    }

    public void IngresarNumero(View view){
        ArrayList numeros = new ArrayList();
        numeros.add(numero);

    }
}