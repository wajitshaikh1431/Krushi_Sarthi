package www.wajit.krushisarthi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class crops_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crops);
    }
    public void btnbajri(View view) {
        Intent i = new Intent(this, bajri.class);
        startActivity(i);
    }
    public void btnjawari(View view) {
        Intent i = new Intent(this, jawari.class);
        startActivity(i);
    }
    public void btncorn(View view) {
        Intent i = new Intent(this, corn.class);
        startActivity(i);
    }
    public void btnmung(View view) {
        Intent i = new Intent(this, mung.class);
        startActivity(i);
    }
    public void btnpieon(View view) {
        Intent i = new Intent(this, pieon.class);
        startActivity(i);
    }
    public void btnwheat(View view) {
        Intent i = new Intent(this, wheat.class);
        startActivity(i);
    }

    public void btnwatana(View view) {
        Intent i = new Intent(this, watana.class);
        startActivity(i);
    }
    public void btncotton(View view) {
        Intent i = new Intent(this, cotton.class);
        startActivity(i);
    }





}