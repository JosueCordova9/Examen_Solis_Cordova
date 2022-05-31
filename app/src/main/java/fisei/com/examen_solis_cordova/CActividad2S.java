package fisei.com.examen_solis_cordova;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class CActividad2S extends AppCompatActivity {


    private EditText numero;
    private ListView lista;
    private Button ingresar;
    private List<Integer> miLista = new ArrayList<Integer>();
    private ArrayAdapter<Integer> arreglo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cactividad2_s);

        numero = findViewById(R.id.CNumero_IngresoS);
        lista = findViewById(R.id.CListaNumerosS);
        ingresar = findViewById(R.id.CbuttonIngresarS);

    }

    public void CIngresarNumeroS(View view){
        switch (view.getId()){
            case R.id.CbuttonIngresarS: String valor = numero.getText().toString().trim();
            Integer valor2 = Integer.parseInt(valor);
            miLista.add(valor2);
            numero.getText().clear();
            arreglo = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,miLista);
            lista.setAdapter(arreglo);
        }

//        lista = numeros;
//
//        Intent intent = new Intent();
//
//        intent.putExtra("numeros",numeros);
//
//        setResult(Activity.RESULT_OK,intent);
    }

    public void CCerrarS(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

}