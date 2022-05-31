package fisei.com.examen_solis_cordova;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    int ACTIVITY2 = 1;
    private ListView listaOriginal;
    private ListView listaIndices;
    private ListView listaOrdenada;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //
    public void CSegundaActividadS(View view){
        Intent intent = new Intent(this,CActividad2S.class);
        startActivity(intent);
    }





}