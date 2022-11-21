package www.wajit.krushisarthi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {


    private FirebaseAuth mAuth;
    String currentUser = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);

    }


    public void btnnext(View view) {
        Intent i = new Intent(MainActivity.this, signup_activity.class);
        startActivity(i);


    }

    public void btnlogin(View view) {
        Intent b = new Intent(MainActivity.this, login_activity.class);
        startActivity(b);

    }

    private void reload() { }
}




