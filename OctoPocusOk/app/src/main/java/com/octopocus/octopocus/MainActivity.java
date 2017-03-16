package com.octopocus.octopocus;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.InstrumentationInfo;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView objectText;
    private Button btnMenu;
    private Button btnHelp;
    private Button btnTest;
    private double timeGeste = 0;
    private double tmpTimeAction = 0;
    private double totalAction = 0;
    public static  String geste = null;
    public static boolean actionOcto = false;
    public String result;



    double[] tempsPriseEnMain = new double[8];
    int[] erreurPriseEnMain = new int[8];
    double[] tempsPriseEnMainM = new double[8];
    int[] erreurPriseEnMainM = new int[8];

    public Thread mThread1;
    public Thread mThread2;
    public Thread mThread3;
    public Thread mThread4;
    public Thread mThread5;
    public Thread mThread6;
    public Thread mThread7;
    public Thread mThread8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        objectText = (TextView) findViewById(R.id.object_name); // --> not used anymore
        btnMenu = (Button)findViewById(R.id.btnMenu);
        btnHelp = (Button)findViewById(R.id.btnHelp);
        btnTest = (Button)findViewById(R.id.button);

        mThread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                        boolean stop = false;
                        // a potentially  time consuming task
                        while(!stop) {
                            try {
                                mThread1.sleep(100);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            if(actionOcto == true)
                            {
                                actionOcto = false;
                                if(geste == "Paris")
                                {
                                    tempsPriseEnMain[0] = timeGeste;

                                    stop = true;
                                }
                                else
                                {
                                    erreurPriseEnMain[0] += 1;
                                }
                            }
                        }
                        mThread1.interrupt();
                        SecondTest();
            }
        });
        mThread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                boolean stop = false;
                // a potentially  time consuming task
                while(!stop) {
                    try {
                        mThread2.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if(actionOcto == true)
                    {
                        actionOcto = false;
                        if(geste == "Berlin")
                        {
                            tempsPriseEnMain[1] = timeGeste;

                            stop = true;
                        }
                        else
                        {
                            erreurPriseEnMain[1] += 1;
                        }
                    }
                }
                mThread2.interrupt();
                troisiemeTest();

            }
        });

        mThread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                boolean stop = false;
                // a potentially  time consuming task
                while(!stop) {
                    try {
                        mThread3.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if(actionOcto == true)
                    {
                        actionOcto = false;
                        if(geste == "Rome")
                        {
                            tempsPriseEnMain[2] = timeGeste;

                            stop = true;
                        }
                        else
                        {
                            erreurPriseEnMain[2] += 1;
                        }
                    }
                }
                mThread3.interrupt();
                quatriemeTest();

            }
        });

        mThread4 = new Thread(new Runnable() {
            @Override
            public void run() {
                boolean stop = false;
                // a potentially  time consuming task
                while(!stop) {
                    try {
                        mThread4.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if(actionOcto == true)
                    {
                        actionOcto = false;
                        if(geste == "Dublin")
                        {
                            tempsPriseEnMain[3] = timeGeste;

                            stop = true;
                        }
                        else
                        {
                            erreurPriseEnMain[3] += 1;
                        }
                    }
                }
                mThread4.interrupt();
                cinquiemeTest();

            }
        });

        mThread5 = new Thread(new Runnable() {
            @Override
            public void run() {
                boolean stop = false;
                // a potentially  time consuming task
                while(!stop) {
                    try {
                        mThread5.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if(actionOcto == true)
                    {
                        actionOcto = false;
                        if(geste == "Sydney")
                        {
                            tempsPriseEnMain[4] = timeGeste;

                            stop = true;
                        }
                        else
                        {
                            erreurPriseEnMain[4] += 1;
                        }
                    }
                }
                mThread5.interrupt();
                sixiemeTest();

            }
        });

        mThread6 = new Thread(new Runnable() {
            @Override
            public void run() {
                boolean stop = false;
                // a potentially  time consuming task
                while(!stop) {
                    try {
                        mThread6.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if(actionOcto == true)
                    {
                        actionOcto = false;
                        if(geste == "Miami")
                        {
                            tempsPriseEnMain[5] = timeGeste;

                            stop = true;
                        }
                        else
                        {
                            erreurPriseEnMain[5] += 1;
                        }
                    }
                }
                mThread6.interrupt();
                septiemeTest();

            }
        });

        mThread7 = new Thread(new Runnable() {
            @Override
            public void run() {
                boolean stop = false;
                // a potentially  time consuming task
                while(!stop) {
                    try {
                        mThread7.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if(actionOcto == true)
                    {
                        actionOcto = false;
                        if(geste == "Toronto")
                        {
                            tempsPriseEnMain[6] = timeGeste;

                            stop = true;
                        }
                        else
                        {
                            erreurPriseEnMain[6] += 1;
                        }
                    }
                }
                mThread7.interrupt();
                huitiemeTest();

            }
        });

        mThread8 = new Thread(new Runnable() {
            @Override
            public void run() {
                boolean stop = false;
                // a potentially  time consuming task
                while(!stop) {
                    try {
                        mThread8.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if(actionOcto == true)
                    {
                        actionOcto = false;
                        if(geste == "Oslo")
                        {
                            tempsPriseEnMain[7] = timeGeste;

                            stop = true;
                        }
                        else
                        {
                            erreurPriseEnMain[7] += 1;
                        }
                    }
                }
                mThread8.interrupt();
                afficherResult();
            }
        });

        for(int i = 0; i < 8; i++)
        {
            erreurPriseEnMain[i] = 0;
            tempsPriseEnMain[i] = 0;
            erreurPriseEnMainM[i] = 0;
            tempsPriseEnMainM[i] = 0;
        }

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

        btnTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlgTestAlerte = new AlertDialog.Builder(MainActivity.this);
                dlgTestAlerte.setTitle("Prise en main");
                dlgTestAlerte.setMessage("Vous allez effecutez 8 gestes Octopocus, et 8 actions sur le menu contextuelle pour comprendre l'application");
                //Création d'un bouton "OK" dans notre fenetre Dialog
                dlgTestAlerte.setPositiveButton("OK", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int wichButton){
                        dialog.dismiss();
                        startTest();
                    }
                });
                dlgTestAlerte.setCancelable(true);
                dlgTestAlerte.create().show();
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
        geste = dollar.result.Name;
    }

    public void executeCommand(double time) {
        timeGeste = time;
        actionOcto = true;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (requestCode == 1) {
            if(resultCode == Activity.RESULT_OK){
                totalAction = System.currentTimeMillis() - tmpTimeAction;
                result = data.getStringExtra("result");
                objectText.setText("Action: " + result + " Temps: " + totalAction);
            }
            if (resultCode == Activity.RESULT_CANCELED) {
                //Gestion d'erreur ?
            }
        }
    }

    public void startTest()
    {
        AlertDialog.Builder dlgTest1 = new AlertDialog.Builder(MainActivity.this);
        dlgTest1.setTitle("Prise en main");
        dlgTest1.setMessage("Geste Octopocus: Paris");
        //Création d'un bouton "OK" dans notre fenetre Dialog
        dlgTest1.setPositiveButton("OK", new DialogInterface.OnClickListener(){
            public void onClick(DialogInterface dialog, int wichButton){
                dialog.dismiss();
                mThread1.start();
            }
        });
        dlgTest1.setCancelable(true);
        dlgTest1.create().show();
    }

    public void SecondTest(){
        MainActivity.this.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                AlertDialog.Builder dlgTest2 = new AlertDialog.Builder(MainActivity.this);
                dlgTest2.setTitle("Prise en main");
                dlgTest2.setMessage("Geste Octopocus: Berlin");
                //Création d'un bouton "OK" dans notre fenetre Dialog
                dlgTest2.setPositiveButton("OK", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int wichButton){
                        dialog.dismiss();
                        mThread2.start();
                    }
                });
                dlgTest2.setCancelable(true);
                dlgTest2.create();
                dlgTest2.show();
            }
        });
    }

    public void troisiemeTest()
    {
        MainActivity.this.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                AlertDialog.Builder dlgTest3 = new AlertDialog.Builder(MainActivity.this);
                dlgTest3.setTitle("Prise en main");
                dlgTest3.setMessage("Geste Octopocus: Rome");
                //Création d'un bouton "OK" dans notre fenetre Dialog
                dlgTest3.setPositiveButton("OK", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int wichButton){
                        dialog.dismiss();
                        mThread3.start();
                    }
                });
                dlgTest3.setCancelable(true);
                dlgTest3.create();
                dlgTest3.show();
            }
        });
    }

    public void quatriemeTest()
    {
        MainActivity.this.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                AlertDialog.Builder dlgTest4 = new AlertDialog.Builder(MainActivity.this);
                dlgTest4.setTitle("Prise en main");
                dlgTest4.setMessage("Geste Octopocus: Dublin");
                //Création d'un bouton "OK" dans notre fenetre Dialog
                dlgTest4.setPositiveButton("OK", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int wichButton){
                        dialog.dismiss();
                        mThread4.start();
                    }
                });
                dlgTest4.setCancelable(true);
                dlgTest4.create();
                dlgTest4.show();
            }
        });
    }

    public void cinquiemeTest(){
        MainActivity.this.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                AlertDialog.Builder dlgTest5 = new AlertDialog.Builder(MainActivity.this);
                dlgTest5.setTitle("Prise en main");
                dlgTest5.setMessage("Geste Octopocus: Sydney");
                //Création d'un bouton "OK" dans notre fenetre Dialog
                dlgTest5.setPositiveButton("OK", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int wichButton){
                        dialog.dismiss();
                        mThread5.start();
                    }
                });
                dlgTest5.setCancelable(true);
                dlgTest5.create();
                dlgTest5.show();
            }
        });
    }

    public void sixiemeTest(){
        MainActivity.this.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                AlertDialog.Builder dlgTest6 = new AlertDialog.Builder(MainActivity.this);
                dlgTest6.setTitle("Prise en main");
                dlgTest6.setMessage("Geste Octopocus: Miami");
                //Création d'un bouton "OK" dans notre fenetre Dialog
                dlgTest6.setPositiveButton("OK", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int wichButton){
                        dialog.dismiss();
                        mThread6.start();
                    }
                });
                dlgTest6.setCancelable(true);
                dlgTest6.create();
                dlgTest6.show();
            }
        });
    }

    public void septiemeTest(){
        MainActivity.this.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                AlertDialog.Builder dlgTest7 = new AlertDialog.Builder(MainActivity.this);
                dlgTest7.setTitle("Prise en main");
                dlgTest7.setMessage("Geste Octopocus: Toronto");
                //Création d'un bouton "OK" dans notre fenetre Dialog
                dlgTest7.setPositiveButton("OK", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int wichButton){
                        dialog.dismiss();
                        mThread7.start();
                    }
                });
                dlgTest7.setCancelable(true);
                dlgTest7.create();
                dlgTest7.show();
            }
        });
    }

    public void huitiemeTest(){
        MainActivity.this.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                AlertDialog.Builder dlgTest8 = new AlertDialog.Builder(MainActivity.this);
                dlgTest8.setTitle("Prise en main");
                dlgTest8.setMessage("Geste Octopocus: Oslo");
                //Création d'un bouton "OK" dans notre fenetre Dialog
                dlgTest8.setPositiveButton("OK", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int wichButton){
                        dialog.dismiss();
                        mThread8.start();
                    }
                });
                dlgTest8.setCancelable(true);
                dlgTest8.create();
                dlgTest8.show();
            }
        });
    }

    public void afficherResult()
    {
        for(int i = 0; i < 8; i++)
        {
            Log.i("TEMPS+ERREUR", "Test n°"+ i +" Erreur: " + erreurPriseEnMain[i] + " Temps: " + tempsPriseEnMain[i]);
        }
    }
}
