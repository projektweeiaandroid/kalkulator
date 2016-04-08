package brt.kalkulator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class kalkulator extends AppCompatActivity {

    private static Button button_sbm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);
        OnClickButtonprosty();
        OnClickButtonzaawansowany();
        OnClickButtonautor();
        OnClickButtonwyjscie();
    }

    public void OnClickButtonprosty() {
        button_sbm = (Button) findViewById(R.id.button);
        button_sbm.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //Intent intent = new Intent("com.example.artur.kalkulator.kalkulatorprosty");
                        Intent myIntent = new Intent(kalkulator.this, kalkulatorprosty.class);
                        startActivity(myIntent);
                    }
                }
        );

    }

    public void OnClickButtonzaawansowany() {
        button_sbm = (Button) findViewById(R.id.button2);
        button_sbm.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent myIntent = new Intent(kalkulator.this, kalkulatorzaawansowany.class);
                        startActivity(myIntent);
                    }
                }
        );
    }
    public void OnClickButtonautor() {
        button_sbm = (Button) findViewById(R.id.button3);
        button_sbm.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent myIntent = new Intent(kalkulator.this, oautorze.class);
                        startActivity(myIntent);
                    }
                }
        );
    }
    public void OnClickButtonwyjscie() {
        button_sbm = (Button) findViewById(R.id.button4);
        button_sbm.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent myIntent = new Intent(kalkulator.this, kalkulatorzaawansowany.class);
                        finish();
                    }
                }
        );
    }

}
