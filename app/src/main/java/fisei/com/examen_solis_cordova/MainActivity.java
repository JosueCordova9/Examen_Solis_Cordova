package fisei.com.examen_solis_cordova;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    int ACTIVITY2 = 1;
    private List<Integer> miLista = new ArrayList<Integer>();
    private String listaOriginalS;
    private ListView listaOriginal;
    private ListView listaIndices;
    private ListView listaOrdenada;
    private ArrayAdapter<Integer> arreglo;
    private Button mostrar;
    private Button ordenar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaOriginal = findViewById(R.id.CVectorOriginalS);
        listaIndices = findViewById(R.id.CVectorIndicesS);
        listaOrdenada = findViewById(R.id.CVectorOrdenadoS);
        mostrar = findViewById(R.id.Cbutton_mostrarS);
        ordenar = findViewById(R.id.Cbutton_ordenarS);


    }
    //
    public void CSegundaActividadS(View view){
        Intent intent = new Intent(this,CActividad2S.class);
        startActivityForResult(intent,ACTIVITY2);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == ACTIVITY2){
            if(resultCode == Activity.RESULT_OK){
                listaOriginalS = data.getStringExtra("lista");
                Integer valor2 = Integer.parseInt(listaOriginalS);
                miLista.add(valor2);
                arreglo = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,miLista);
                listaOriginal.setAdapter(arreglo);



            }

        }
    }

    public void Mostrar(View view){

    }





}