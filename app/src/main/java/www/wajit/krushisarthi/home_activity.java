package www.wajit.krushisarthi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class home_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void btnprof(View view) {
        Intent i = new Intent(this, activity_profile.class);
        startActivity(i);
    }


    public void btnplantinfo(View view) {
        Intent b = new Intent(this, plantsinfo_activity.class);
        startActivity(b);
    }
}
