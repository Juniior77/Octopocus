package com.octopocus.octopocus;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.InstrumentationInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView objectText;
    private Button btnMenu;
    private Button btnHelp;
    private double timeGeste = 0;
    private double tmpTimeAction = 0;
    private double totalAction = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        objectText = (TextView) findViewById(R.id.object_name); // --> not used anymore
        btnMenu = (Button)findViewById(R.id.btnMenu);
        btnHelp = (Button)findViewById(R.id.btnHelp);

        btnHelp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startHelp();
            }
        });

        btnMenu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                tmpTimeAction = System.currentTimeMillis();
                startMenu();
            }
        });
    }

    public void startHelp(){
        Intent intentHelp = new Intent(this, help.class);
        startActivity(intentHelp);
    }

    public void startMenu(){
        Intent intent = new Intent(this, menu.class);
        startActivityForResult(intent, 1);
    }

    public void writeDollar(Dollar dollar){   // --> not used anymore
        objectText.setText("Geste: " + dollar.result.Name + " Temps: " + timeGeste);
    }

    public void executeCommand(double time) {
        timeGeste = time;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (requestCode == 1) {
            if(resultCode == Activity.RESULT_OK){
                totalAction = System.currentTimeMillis() - tmpTimeAction;
                String result=data.getStringExtra("result");
                objectText.setText("Action: " + result + " Temps: " + totalAction);
            }
            if (resultCode == Activity.RESULT_CANCELED) {
                //Gestion d'erreur ?
            }
        }
    }
}
