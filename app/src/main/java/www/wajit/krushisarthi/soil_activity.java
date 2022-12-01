package www.wajit.krushisarthi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class soil_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soil);
    }

    public void btnsilt(View view) {
            Intent i = new Intent(this, siltsoil.class);
            startActivity(i);
    }


    public void btnchalk(View view) {
        Intent i = new Intent(this, chalksoil.class);
        startActivity(i);
    }


    public void btnloam(View view) {
        Intent i = new Intent(this, lombsoil.class);
        startActivity(i);
    }

    public void btnpeat(View view) {
        Intent i = new Intent(this, peatsoil.class);
        startActivity(i);

    }

    public void btnsand(View view) {
        Intent i = new Intent(this, sandsoil.class);
        startActivity(i);
    }

    public void btnclay(View view) {
        Intent i = new Intent(this, claysoil.class);
        startActivity(i);
    }
}