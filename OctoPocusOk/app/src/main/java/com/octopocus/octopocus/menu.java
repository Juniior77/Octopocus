package com.octopocus.octopocus;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class menu extends Activity {

    private Button Athens;
    private Button Berlin;
    private Button Brussels;
    private Button Dublin;
    private Button London;
    private Button Miami;
    private Button Moscow;
    private Button Oslo;
    private Button Paris;
    private Button Rio;
    private Button Rome;
    private Button Sofia;
    private Button Sydney;
    private Button Tokyo;
    private Button Toronto;
    private Button Vienna;
    private String idAction = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Athens = (Button)findViewById(R.id.btnAthens);
        Berlin = (Button)findViewById(R.id.btnBerlin);
        Brussels = (Button)findViewById(R.id.btnBrussels);
        Dublin = (Button)findViewById(R.id.btnDublin);
        London = (Button)findViewById(R.id.btnLondon);
        Miami = (Button)findViewById(R.id.btnMiami);
        Moscow = (Button)findViewById(R.id.btnMoscow);
        Oslo = (Button)findViewById(R.id.btnOslo);
        Paris = (Button)findViewById(R.id.btnParis);
        Rio = (Button)findViewById(R.id.btnRio);
        Rome = (Button)findViewById(R.id.btnRome);
        Sofia = (Button)findViewById(R.id.btnSofia);
        Sydney = (Button)findViewById(R.id.btnSydney);
        Tokyo = (Button)findViewById(R.id.btnTokyo);
        Toronto = (Button)findViewById(R.id.btnToronto);
        Vienna = (Button)findViewById(R.id.btnVienna);

        Athens.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                idAction = "Athens";
                retourActivity();
            }
        });
        Berlin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                idAction = "Berlin";
                retourActivity();
            }
        });
        Brussels.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                idAction = "Brussels";
                retourActivity();
            }
        });
        Dublin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                idAction = "Dublin";
                retourActivity();
            }
        });
        London.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                idAction = "London";
                retourActivity();
            }
        });
        Miami.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                idAction = "Miami";
                retourActivity();
            }
        });
        Moscow.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                idAction = "Moscow";
                retourActivity();
            }
        });
        Oslo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                idAction = "Oslo";
                retourActivity();
            }
        });
        Paris.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                idAction = "Paris";
                retourActivity();
            }
        });
        Rio.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                idAction = "Rio";
                retourActivity();
            }
        });
        Rome.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                idAction = "Rome";
                retourActivity();
            }
        });
        Sofia.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                idAction = "Sofia";
                retourActivity();
            }
        });
        Sydney.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                idAction = "Sydney";
                retourActivity();
            }
        });
        Tokyo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                idAction = "Tokyo";
                retourActivity();
            }
        });
        Toronto.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                idAction = "Toronto";
                retourActivity();
            }
        });
        Vienna.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                idAction = "Vienna";
                retourActivity();
            }
        });
    }

    private void retourActivity(){
        Intent returnIntent = new Intent();
        returnIntent.putExtra("result", idAction);
        setResult(Activity.RESULT_OK, returnIntent);
        finish();
    }
}

