package www.wajit.krushisarthi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }


        public void btnnext(View view) {
        Intent i = new Intent(MainActivity.this, signin_activity.class);
        startActivity(i);


    }

    public void btnlogin(View view) {
        Intent b = new Intent(MainActivity.this, login_activity.class);
        startActivity(b);

    }
}




