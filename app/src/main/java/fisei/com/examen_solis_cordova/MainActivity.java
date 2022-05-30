package fisei.com.examen_solis_cordova;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

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