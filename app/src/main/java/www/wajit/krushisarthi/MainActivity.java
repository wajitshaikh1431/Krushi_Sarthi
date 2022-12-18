package www.wajit.krushisarthi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    private FirebaseAuth firebaseAuth;
    private FirebaseAuth.AuthStateListener authListener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        firebaseAuth = FirebaseAuth.getInstance();


        authListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser user = firebaseAuth.getCurrentUser();
                if (user == null) {
                    Log.e("user", "null");
                    // user auth state is changed - user is null
                    // launch login activity
                    Toast.makeText(getApplicationContext(),
                            "User Dons't Exist",
                            Toast.LENGTH_LONG)
                    .show();
                } else {

                    Intent b = new Intent(MainActivity.this, login_activity.class);
                    startActivity(b);
                }
            }
        };
        firebaseAuth.addAuthStateListener(authListener);

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



