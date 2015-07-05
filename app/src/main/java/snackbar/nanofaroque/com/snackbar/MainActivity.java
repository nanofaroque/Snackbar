package snackbar.nanofaroque.com.snackbar;
import android.app.Activity;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button popUp;
    View snackBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        popUp=(Button)findViewById(R.id.popUp);
        snackBar=findViewById(R.id.snackBar);
    }

    View.OnClickListener clickListener= new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this, "It has gone", Toast.LENGTH_SHORT).show();
        }
    };

    public void popUp(View view){
        Snackbar.make(snackBar,"Hey Snackbar is here",Snackbar.LENGTH_LONG).
                setAction(R.string.snackbar_action,clickListener).show();
    }
}
