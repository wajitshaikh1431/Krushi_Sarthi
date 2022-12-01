package www.wajit.krushisarthi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class fruits_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruits);
    }

    public void btnapple(View view) {
        Intent a = new Intent (this, apple.class);
                startActivity(a);
    }

    public void btnbanana(View view) {
        Intent a = new Intent (this, banana.class);
                startActivity(a);
    }


    public void btngreps(View view) {
        Intent i = new Intent (this, greps.class);
                startActivity(i);
    }


    public void btnmango(View view) {
        Intent i = new Intent(this, mango.class);
        startActivity(i);
    }

    public void btnorange(View view) {
        Intent i = new Intent(this, orange.class);
        startActivity(i);
    }


    public void btnwatermelon(View view) {
        Intent i = new Intent(this, watermelon.class);
        startActivity(i);
    }

    public void btnpineapple(View view) {
        Intent i = new Intent(this, pineapple.class);
        startActivity(i);
    }

    public void btnpapai(View view) {
        Intent i = new Intent(this, papai.class);
        startActivity(i);
    }
}