package www.wajit.krushisarthi;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class home_activity extends AppCompatActivity {

    private TextView  UserNameText;
    private Button Btn;

    private FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        UserNameText = findViewById(R.id.username);
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        String username = user.getDisplayName();
    }
    public void btnprof(View view) {
        Intent i = new Intent(this, activity_profile.class);
        startActivity(i);
    }

    public void btnplantinfo(View view) {
        Intent b = new Intent(this, plants_activity.class);
        startActivity(b);
    }
    public void btnweather(View view) {
        Intent b = new Intent(this, weather_activity.class);
        startActivity(b);
    }
    public void platBuybtn(View view) {
        Intent b = new Intent(this, activity_plant_buy.class);
        startActivity(b);
    }
    public void agreeView(View view) {
        Intent b = new Intent(this, agricluture_view.class);
        startActivity(b);
    }
    public void btnfertilizers(View view) {
        Intent b = new Intent(this, activity_fertilizers.class);
        startActivity(b);
    }


    public void onBackPressed() {
        super.onBackPressed();
        finishAffinity();
    }


    public void btncontactus(View view) {
        Intent b = new Intent(this, contact_us.class);
        startActivity(b);

    }
}



