package www.wajit.krushisarthi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class vegetable_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vegetable);
    }

    public void btntomato(View view) {
        Intent i = new Intent(this, tomato.class);
        startActivity(i);
    }
    public void btnspinach(View view) {
        Intent i = new Intent(this, spinach_activity.class);
        startActivity(i);
    }
    public void btnfenugreek(View view) {
        Intent i = new Intent(this, fenugreek.class);
        startActivity(i);
    }
    public void btnchilli(View view) {
        Intent i = new Intent(this, chilli.class);
        startActivity(i);
    }
    public void btncarrot(View view) {
        Intent i = new Intent(this, carrot.class);
        startActivity(i);
    }
    public void btnladyfinger(View view) {
        Intent i = new Intent(this, ladyfinger.class);
        startActivity(i);
    }
    public void btnpotato(View view) {
        Intent i = new Intent(this, potato.class);
        startActivity(i);
    }
    public void btnonion(View view) {
        Intent i = new Intent(this, onion.class);
        startActivity(i);
    }


}