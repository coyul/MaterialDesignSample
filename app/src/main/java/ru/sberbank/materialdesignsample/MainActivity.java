package ru.sberbank.materialdesignsample;

import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setSupportActionBar((Toolbar)findViewById(R.id.toolbar));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextInputLayout textInputLayout = (TextInputLayout) findViewById(R.id.text_input_layout);
        textInputLayout.setError("error");

        android.support.v7.app.AlertDialog dialog = new AlertDialog.Builder(this)
                .setTitle("title")
                .setMessage("message")
                .setPositiveButton("OK", null)
                .setNegativeButton("NO", null)
                .setNeutralButton("Whatever", null)
                .create();
        dialog.show();


        Snackbar snackbar = Snackbar.make(findViewById(R.id.coordinator_layout), "some text", Snackbar.LENGTH_LONG);
        snackbar.show();
    }
}
