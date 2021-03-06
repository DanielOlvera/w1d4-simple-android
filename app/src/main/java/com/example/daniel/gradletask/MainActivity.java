package com.example.daniel.gradletask;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    // Example of a call to a native method
    //TextView tv = (TextView) findViewById(R.id.sample_text);
    //tv.setText(stringFromJNI());

        //HelloWorld
        //Hello Commit XD
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    public void doMagic(View view){
        Toast.makeText(this, "Hello World", Toast.LENGTH_SHORT).show();
        Log.d("TAG_", "doSomething: ");
        Intent intent = new Intent(this, DetailsActivity.class);
        startActivity(intent);

        TextView textView = (TextView) findViewById(R.id.a_main_text);
        textView.setText("This text changed");
    }

}
