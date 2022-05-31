package fisei.com.examen_solis_cordova;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class CActividad2S extends AppCompatActivity {


    private EditText numero;
    private ListView lista;
    private Button ingresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cactividad2_s);

        numero = findViewById(R.id.CNumero_IngresoS);
        lista = findViewById(R.id.CListaNumerosS);
        ingresar = findViewById(R.id.CbuttonIngresarS);

    }

    public void CIngresarNumeroS(View view){
        ArrayList numeros = new ArrayList();
        numeros.add(numero);

        lista = numeros;

        Intent intent = new Intent();

        intent.putExtra("numeros",numeros);

        setResult(Activity.RESULT_OK,intent);


    }

    public void CCerrarS(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

}