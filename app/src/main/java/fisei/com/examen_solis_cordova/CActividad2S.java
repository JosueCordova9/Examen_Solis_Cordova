package fisei.com.examen_solis_cordova;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CActividad2S extends AppCompatActivity {


    EditText numero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cactividad2_s);
    }

    public void CCerrarS(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

}