package www.wajit.krushisarthi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity_fertilizers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fertilizers);
    }

    public void btnammonium(View view) {
        Intent i = new Intent(this, activity_ammonium.class);
        startActivity(i);
    }

    public void btnsodium(View view) {
        Intent i = new Intent(this, activity_sodium.class);
        startActivity(i);
    }

    public void btncalcium(View view) {
        Intent i = new Intent(this, activity_calcium.class);
        startActivity(i);
    }

    public void btnphosphate(View view) {
        Intent i = new Intent(this, activity_phosphate.class);
        startActivity(i);
    }
}