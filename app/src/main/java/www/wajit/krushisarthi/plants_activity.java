package www.wajit.krushisarthi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class plants_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plants);
    }

    public void buttoncrop(View view) {
        Intent i = new Intent(this, crops_activity.class);
        startActivity(i);
    }
    public void buttonvegetable(View view) {
        Intent i = new Intent(this, vegetable_activity.class);
        startActivity(i);
    }
    public void buttonfruit(View view) {
        Intent i = new Intent(this, fruits_activity.class);
        startActivity(i);
    }
    public void buttonsoil(View view) {
        Intent i = new Intent(this, soil_activity.class);
        startActivity(i);
    }
    public void buttonagri(View view) {
        Intent i = new Intent(this, smart_indian_agriculture_activity.class);
        startActivity(i);
    }
}