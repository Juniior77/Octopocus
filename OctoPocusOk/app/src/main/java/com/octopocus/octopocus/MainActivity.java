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
    public boolean actionOcto = false;
    public String resultat;

    public boolean test1 = true, test2 = true, test3 = true, test4 = true, test5 = true, test6 = true, test7 = true, test8 = true;
    public boolean exp1 = true, exp2 = true, exp3 = true, exp4 = true, exp5 = true, exp6 = true, exp7 = true, exp8 = true,
    exp9 = true, exp10 = true, exp11 = true, exp12 = true, exp13 = true, exp14 = true, exp15 = true, exp16 = true;

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

    double[] tempsExp = new double[16];
    int[] erreurExp = new int[16];
    double[] tempsExpM = new double[16];
    int[] erreurExpM = new int[16];

    public Thread mThread10;
    public Thread mThread11;
    public Thread mThread12;
    public Thread mThread13;
    public Thread mThread14;
    public Thread mThread15;
    public Thread mThread16;
    public Thread mThread17;
    public Thread mThread18;
    public Thread mThread19;
    public Thread mThread20;
    public Thread mThread21;
    public Thread mThread22;
    public Thread mThread23;
    public Thread mThread24;
    public Thread mThread25;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        objectText = (TextView) findViewById(R.id.object_name); // --> not used anymore
        btnMenu = (Button)findViewById(R.id.btnMenu);
        btnHelp = (Button)findViewById(R.id.btnHelp);
        btnTest = (Button)findViewById(R.id.button);

    //region THREAD1
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
                startTestMenu();
                mThread1.interrupt();
            }
        });
        //endregion

    //region THREAD2
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
                startTestMenu2();
                mThread2.interrupt();
            }
        });
//endregion

    //region THREAD3
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
                startTestMenu3();
                mThread3.interrupt();
            }
        });
    //endregion

    //region THREAD4
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
                startTestMenu4();
                mThread4.interrupt();
            }
        });
//endregion

    //region THREAD5
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
                startTestMenu5();
                mThread5.interrupt();
            }
        });
    //endregion

    //region THREAD6
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
                startTestMenu6();
                mThread6.interrupt();
            }
        });
//endregion

    //region THREAD7
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
                startTestMenu7();
                mThread7.interrupt();
            }
        });
//endregion

    //region THREAD8
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
                startTestMenu8();
                mThread8.interrupt();
            }
        });
//endregion

        //region THREAD10
        mThread10 = new Thread(new Runnable() {
            @Override
            public void run() {
                boolean stop = false;
                // a potentially  time consuming task
                while(!stop) {
                    try {
                        mThread10.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if(actionOcto == true)
                    {
                        actionOcto = false;
                        if(geste == "Athens")
                        {
                            tempsExp[0] = timeGeste;

                            stop = true;
                        }
                        else
                        {
                            erreurExp[0] += 1;
                        }
                    }
                }
                startExpMenu();
                mThread10.interrupt();
            }
        });
        //endregion

        //region THREAD11
        mThread11 = new Thread(new Runnable() {
            @Override
            public void run() {
                boolean stop = false;
                // a potentially  time consuming task
                while(!stop) {
                    try {
                        mThread11.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if(actionOcto == true)
                    {
                        actionOcto = false;
                        if(geste == "Rio")
                        {
                            tempsExp[1] = timeGeste;

                            stop = true;
                        }
                        else
                        {
                            erreurExp[1] += 1;
                        }
                    }
                }
                startExpMenu2();
                mThread11.interrupt();
            }
        });
        //endregion

        //region THREAD12
        mThread12 = new Thread(new Runnable() {
            @Override
            public void run() {
                boolean stop = false;
                // a potentially  time consuming task
                while(!stop) {
                    try {
                        mThread12.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if(actionOcto == true)
                    {
                        actionOcto = false;
                        if(geste == "Brussels")
                        {
                            tempsExp[2] = timeGeste;

                            stop = true;
                        }
                        else
                        {
                            erreurExp[2] += 1;
                        }
                    }
                }
                startExpMenu3();
                mThread12.interrupt();
            }
        });
        //endregion

        //region THREAD13
        mThread13 = new Thread(new Runnable() {
            @Override
            public void run() {
                boolean stop = false;
                // a potentially  time consuming task
                while(!stop) {
                    try {
                        mThread13.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if(actionOcto == true)
                    {
                        actionOcto = false;
                        if(geste == "Sofia")
                        {
                            tempsExp[3] = timeGeste;

                            stop = true;
                        }
                        else
                        {
                            erreurExp[3] += 1;
                        }
                    }
                }
                startExpMenu4();
                mThread13.interrupt();
            }
        });
        //endregion

        //region THREAD14
        mThread14 = new Thread(new Runnable() {
            @Override
            public void run() {
                boolean stop = false;
                // a potentially  time consuming task
                while(!stop) {
                    try {
                        mThread14.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if(actionOcto == true)
                    {
                        actionOcto = false;
                        if(geste == "London")
                        {
                            tempsExp[4] = timeGeste;

                            stop = true;
                        }
                        else
                        {
                            erreurExp[4] += 1;
                        }
                    }
                }
                startExpMenu5();
                mThread14.interrupt();
            }
        });
        //endregion

        //region THREAD15
        mThread15 = new Thread(new Runnable() {
            @Override
            public void run() {
                boolean stop = false;
                // a potentially  time consuming task
                while(!stop) {
                    try {
                        mThread15.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if(actionOcto == true)
                    {
                        actionOcto = false;
                        if(geste == "Tokyo")
                        {
                            tempsExp[5] = timeGeste;

                            stop = true;
                        }
                        else
                        {
                            erreurExp[5] += 1;
                        }
                    }
                }
                startExpMenu6();
                mThread15.interrupt();
            }
        });
        //endregion

        //region THREAD16
        mThread16 = new Thread(new Runnable() {
            @Override
            public void run() {
                boolean stop = false;
                // a potentially  time consuming task
                while(!stop) {
                    try {
                        mThread16.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if(actionOcto == true)
                    {
                        actionOcto = false;
                        if(geste == "Moscow")
                        {
                            tempsExp[6] = timeGeste;

                            stop = true;
                        }
                        else
                        {
                            erreurExp[6] += 1;
                        }
                    }
                }
                startExpMenu7();
                mThread16.interrupt();
            }
        });
        //endregion

        //region THREAD17
        mThread17 = new Thread(new Runnable() {
            @Override
            public void run() {
                boolean stop = false;
                // a potentially  time consuming task
                while(!stop) {
                    try {
                        mThread17.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if(actionOcto == true)
                    {
                        actionOcto = false;
                        if(geste == "Vienna")
                        {
                            tempsExp[7] = timeGeste;

                            stop = true;
                        }
                        else
                        {
                            erreurExp[7] += 1;
                        }
                    }
                }
                startExpMenu8();
                mThread17.interrupt();
            }
        });
        //endregion

        //region THREAD18
        mThread18 = new Thread(new Runnable() {
            @Override
            public void run() {
                boolean stop = false;
                // a potentially  time consuming task
                while(!stop) {
                    try {
                        mThread18.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if(actionOcto == true)
                    {
                        actionOcto = false;
                        if(geste == "Oslo")
                        {
                            tempsExp[8] = timeGeste;

                            stop = true;
                        }
                        else
                        {
                            erreurExp[8] += 1;
                        }
                    }
                }
                startExpMenu9();
                mThread18.interrupt();
            }
        });
        //endregion

        //region THREAD19
        mThread19 = new Thread(new Runnable() {
            @Override
            public void run() {
                boolean stop = false;
                // a potentially  time consuming task
                while(!stop) {
                    try {
                        mThread19.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if(actionOcto == true)
                    {
                        actionOcto = false;
                        if(geste == "Toronto")
                        {
                            tempsExp[9] = timeGeste;

                            stop = true;
                        }
                        else
                        {
                            erreurExp[9] += 1;
                        }
                    }
                }
                startExpMenu10();
                mThread19.interrupt();
            }
        });
        //endregion

        //region THREAD20
        mThread20 = new Thread(new Runnable() {
            @Override
            public void run() {
                boolean stop = false;
                // a potentially  time consuming task
                while(!stop) {
                    try {
                        mThread20.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if(actionOcto == true)
                    {
                        actionOcto = false;
                        if(geste == "Miami")
                        {
                            tempsExp[10] = timeGeste;

                            stop = true;
                        }
                        else
                        {
                            erreurExp[10] += 1;
                        }
                    }
                }
                startExpMenu11();
                mThread20.interrupt();
            }
        });
        //endregion

        //region THREAD21
        mThread21 = new Thread(new Runnable() {
            @Override
            public void run() {
                boolean stop = false;
                // a potentially  time consuming task
                while(!stop) {
                    try {
                        mThread21.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if(actionOcto == true)
                    {
                        actionOcto = false;
                        if(geste == "Sydney")
                        {
                            tempsExp[11] = timeGeste;

                            stop = true;
                        }
                        else
                        {
                            erreurExp[11] += 1;
                        }
                    }
                }
                startExpMenu12();
                mThread21.interrupt();
            }
        });
        //endregion

        //region THREAD22
        mThread22 = new Thread(new Runnable() {
            @Override
            public void run() {
                boolean stop = false;
                // a potentially  time consuming task
                while(!stop) {
                    try {
                        mThread22.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if(actionOcto == true)
                    {
                        actionOcto = false;
                        if(geste == "Dublin")
                        {
                            tempsExp[12] = timeGeste;

                            stop = true;
                        }
                        else
                        {
                            erreurExp[12] += 1;
                        }
                    }
                }
                startExpMenu13();
                mThread22.interrupt();
            }
        });
        //endregion

        //region THREAD23
        mThread23 = new Thread(new Runnable() {
            @Override
            public void run() {
                boolean stop = false;
                // a potentially  time consuming task
                while(!stop) {
                    try {
                        mThread23.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if(actionOcto == true)
                    {
                        actionOcto = false;
                        if(geste == "Rome")
                        {
                            tempsExp[13] = timeGeste;

                            stop = true;
                        }
                        else
                        {
                            erreurExp[13] += 1;
                        }
                    }
                }
                startExpMenu14();
                mThread23.interrupt();
            }
        });
        //endregion

        //region THREAD24
        mThread24 = new Thread(new Runnable() {
            @Override
            public void run() {
                boolean stop = false;
                // a potentially  time consuming task
                while(!stop) {
                    try {
                        mThread24.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if(actionOcto == true)
                    {
                        actionOcto = false;
                        if(geste == "Berlin")
                        {
                            tempsExp[14] = timeGeste;

                            stop = true;
                        }
                        else
                        {
                            erreurExp[14] += 1;
                        }
                    }
                }
                startExpMenu15();
                mThread24.interrupt();
            }
        });
        //endregion

        //region THREAD25
        mThread25 = new Thread(new Runnable() {
            @Override
            public void run() {
                boolean stop = false;
                // a potentially  time consuming task
                while(!stop) {
                    try {
                        mThread25.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if(actionOcto == true)
                    {
                        actionOcto = false;
                        if(geste == "Paris")
                        {
                            tempsExp[15] = timeGeste;

                            stop = true;
                        }
                        else
                        {
                            erreurExp[15] += 1;
                        }
                    }
                }
                startExpMenu16();
                mThread25.interrupt();
            }
        });
        //endregion

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
                btnTest.setVisibility(View.INVISIBLE);
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
                resultat = data.getStringExtra("result");
                objectText.setText("Action: " + resultat + " Temps: " + totalAction);

            }
            if (resultCode == Activity.RESULT_CANCELED) {
                //Gestion d'erreur ?
            }
        }
        validationResultat();
    }

    public void validationResultat()
    {
        if(test1){
            if(resultat.equals("Paris")) {
                tempsPriseEnMainM[0] = totalAction;
                test1 = false;
                SecondTest();
            }
            else
            {
                erreurPriseEnMainM[0] += 1;
            }
        }
        else if(test2){
            if(resultat.equals("Berlin")) {
                tempsPriseEnMainM[1] = totalAction;
                test2 = false;
                troisiemeTest();
            }
            else
            {
                erreurPriseEnMainM[1] += 1;
            }
        }
        else if(test3){
            if(resultat.equals("Rome")) {
                tempsPriseEnMainM[2] = totalAction;
                test3 = false;
                quatriemeTest();
            }
            else
            {
                erreurPriseEnMainM[2] += 1;
            }
        }
        else if(test4){
            if(resultat.equals("Dublin")) {
                tempsPriseEnMainM[3] = totalAction;
                test4 = false;
                cinquiemeTest();
            }
            else
            {
                erreurPriseEnMainM[3] += 1;
            }
        }
        else if(test5){
            if(resultat.equals("Sydney")) {
                tempsPriseEnMainM[4] = totalAction;
                test5 = false;
                sixiemeTest();
            }
            else
            {
                erreurPriseEnMainM[4] += 1;
            }
        }
        else if(test6){
            if(resultat.equals("Miami")) {
                tempsPriseEnMainM[5] = totalAction;
                test6 = false;
                septiemeTest();
            }
            else
            {
                erreurPriseEnMainM[5] += 1;
            }
        }
        else if(test7 == true){
            if(resultat.equals("Toronto")) {
                tempsPriseEnMainM[6] = totalAction;
                test7 = false;
                huitiemeTest();
            }
            else
            {
                erreurPriseEnMainM[6] += 1;
            }
        }
        else if(test8 == true){
            if(resultat.equals("Oslo")) {
                tempsPriseEnMainM[7] = totalAction;
                test8 = false;
                startExperimentation();
            }
            else
            {
                erreurPriseEnMainM[7] += 1;
            }
        }
        //******************************************************************************************
        //                  TEST SUR EXPERIMENTATION MENU
        //******************************************************************************************
        else if(exp1)
        {
            if(resultat.equals("Athens")) {
                tempsExpM[0] = totalAction;
                exp1 = false;
                Experimentation2();
            }
            else
            {
                erreurExpM[0] += 1;
            }
        }
        else if(exp2)
        {
            if(resultat.equals("Rio")) {
                tempsExpM[1] = totalAction;
                exp2 = false;
                Experimentation3();
            }
            else
            {
                erreurExpM[1] += 1;
            }
        }
        else if(exp3)
        {
            if(resultat.equals("Brussels")) {
                tempsExpM[2] = totalAction;
                exp3 = false;
                Experimentation4();
            }
            else
            {
                erreurExpM[2] += 1;
            }
        }
        else if(exp4)
        {
            if(resultat.equals("Sofia")) {
                tempsExpM[3] = totalAction;
                exp4 = false;
                Experimentation5();
            }
            else
            {
                erreurExpM[3] += 1;
            }
        }
        else if(exp5)
        {
            if(resultat.equals("London")) {
                tempsExpM[4] = totalAction;
                exp5 = false;
                Experimentation6();
            }
            else
            {
                erreurExpM[4] += 1;
            }
        }
        else if(exp6)
        {
            if(resultat.equals("Tokyo")) {
                tempsExpM[5] = totalAction;
                exp6 = false;
                Experimentation7();
            }
            else
            {
                erreurExpM[5] += 1;
            }
        }
        else if(exp7)
        {
            if(resultat.equals("Moscow")) {
                tempsExpM[6] = totalAction;
                exp7 = false;
                Experimentation8();
            }
            else
            {
                erreurExpM[6] += 1;
            }
        }
        else if(exp8)
        {
            if(resultat.equals("Vienna")) {
                tempsExpM[7] = totalAction;
                exp8 = false;
                Experimentation9();
            }
            else
            {
                erreurExpM[7] += 1;
            }
        }
        else if(exp9)
        {
            if(resultat.equals("Oslo")) {
                tempsExpM[8] = totalAction;
                exp9 = false;
                Experimentation10();
            }
            else
            {
                erreurExpM[8] += 1;
            }
        }
        else if(exp10)
        {
            if(resultat.equals("Toronto")) {
                tempsExpM[9] = totalAction;
                exp10 = false;
                Experimentation11();
            }
            else
            {
                erreurExpM[9] += 1;
            }
        }
        else if(exp11)
        {
            if(resultat.equals("Miami")) {
                tempsExpM[10] = totalAction;
                exp11 = false;
                Experimentation12();
            }
            else
            {
                erreurExpM[10] += 1;
            }
        }
        else if(exp12)
        {
            if(resultat.equals("Sydney")) {
                tempsExpM[11] = totalAction;
                exp12 = false;
                Experimentation13();
            }
            else
            {
                erreurExpM[11] += 1;
            }
        }
        else if(exp13)
        {
            if(resultat.equals("Dublin")) {
                tempsExpM[12] = totalAction;
                exp13 = false;
                Experimentation14();
            }
            else
            {
                erreurExpM[12] += 1;
            }
        }
        else if(exp14)
        {
            if(resultat.equals("Rome")) {
                tempsExpM[13] = totalAction;
                exp14 = false;
                Experimentation15();
            }
            else
            {
                erreurExpM[13] += 1;
            }
        }
        else if(exp15)
        {
            if(resultat.equals("Berlin")) {
                tempsExpM[14] = totalAction;
                exp15 = false;
                Experimentation16();
            }
            else
            {
                erreurExpM[14] += 1;
            }
        }
        else if(exp16)
        {
            if(resultat.equals("Paris")) {
                tempsExpM[15] = totalAction;
                exp16 = false;
                ResultExperimentation();
            }
            else
            {
                erreurExpM[15] += 1;
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

    public void startTestMenu()
    {

        MainActivity.this.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                AlertDialog.Builder dlgTest1 = new AlertDialog.Builder(MainActivity.this);
                dlgTest1.setTitle("Prise en main");
                dlgTest1.setMessage("Menu: Paris");
                //Création d'un bouton "OK" dans notre fenetre Dialog
                dlgTest1.setPositiveButton("OK", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int wichButton){
                        dialog.dismiss();
                    }
                });
                dlgTest1.setCancelable(true);
                dlgTest1.create().show();
            }
        });
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
    public void startTestMenu2()
    {

        MainActivity.this.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                AlertDialog.Builder dlgTest1 = new AlertDialog.Builder(MainActivity.this);
                dlgTest1.setTitle("Prise en main");
                dlgTest1.setMessage("Menu: Berlin");
                //Création d'un bouton "OK" dans notre fenetre Dialog
                dlgTest1.setPositiveButton("OK", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int wichButton){
                        dialog.dismiss();
                    }
                });
                dlgTest1.setCancelable(true);
                dlgTest1.create().show();
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
    public void startTestMenu3()
    {

        MainActivity.this.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                AlertDialog.Builder dlgTest1 = new AlertDialog.Builder(MainActivity.this);
                dlgTest1.setTitle("Prise en main");
                dlgTest1.setMessage("Menu: Rome");
                //Création d'un bouton "OK" dans notre fenetre Dialog
                dlgTest1.setPositiveButton("OK", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int wichButton){
                        dialog.dismiss();
                    }
                });
                dlgTest1.setCancelable(true);
                dlgTest1.create().show();
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
    public void startTestMenu4()
    {

        MainActivity.this.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                AlertDialog.Builder dlgTest1 = new AlertDialog.Builder(MainActivity.this);
                dlgTest1.setTitle("Prise en main");
                dlgTest1.setMessage("Menu: Dublin");
                //Création d'un bouton "OK" dans notre fenetre Dialog
                dlgTest1.setPositiveButton("OK", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int wichButton){
                        dialog.dismiss();
                    }
                });
                dlgTest1.setCancelable(true);
                dlgTest1.create().show();
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
    public void startTestMenu5()
    {

        MainActivity.this.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                AlertDialog.Builder dlgTest1 = new AlertDialog.Builder(MainActivity.this);
                dlgTest1.setTitle("Prise en main");
                dlgTest1.setMessage("Menu: Sydney");
                //Création d'un bouton "OK" dans notre fenetre Dialog
                dlgTest1.setPositiveButton("OK", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int wichButton){
                        dialog.dismiss();
                    }
                });
                dlgTest1.setCancelable(true);
                dlgTest1.create().show();
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
    public void startTestMenu6()
    {

        MainActivity.this.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                AlertDialog.Builder dlgTest1 = new AlertDialog.Builder(MainActivity.this);
                dlgTest1.setTitle("Prise en main");
                dlgTest1.setMessage("Menu: Miami");
                //Création d'un bouton "OK" dans notre fenetre Dialog
                dlgTest1.setPositiveButton("OK", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int wichButton){
                        dialog.dismiss();
                    }
                });
                dlgTest1.setCancelable(true);
                dlgTest1.create().show();
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
    public void startTestMenu7()
    {

        MainActivity.this.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                AlertDialog.Builder dlgTest1 = new AlertDialog.Builder(MainActivity.this);
                dlgTest1.setTitle("Prise en main");
                dlgTest1.setMessage("Menu: Toronto");
                //Création d'un bouton "OK" dans notre fenetre Dialog
                dlgTest1.setPositiveButton("OK", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int wichButton){
                        dialog.dismiss();
                    }
                });
                dlgTest1.setCancelable(true);
                dlgTest1.create().show();
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
    public void startTestMenu8()
    {

        MainActivity.this.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                AlertDialog.Builder dlgTest1 = new AlertDialog.Builder(MainActivity.this);
                dlgTest1.setTitle("Prise en main");
                dlgTest1.setMessage("Menu: Oslo");
                //Création d'un bouton "OK" dans notre fenetre Dialog
                dlgTest1.setPositiveButton("OK", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int wichButton){
                        dialog.dismiss();
                    }
                });
                dlgTest1.setCancelable(true);
                dlgTest1.create().show();
            }
        });
    }
    public void afficherResult()
    {
        for(int i = 0; i < 8; i++)
        {
            Log.i("TEMPS+ERREUR", "Test Octopocus n°"+ i +" Erreur: " + erreurPriseEnMain[i] + " Temps: " + tempsPriseEnMain[i]);
        }
        for(int i = 0; i < 8; i++)
        {
            Log.i("TEMPS+ERREUR", "Test Menu n°"+ i +" Erreur: " + erreurPriseEnMainM[i] + " Temps: " + tempsPriseEnMainM[i]);
        }

    }
    //**********************************************************************************************
    //          EXPERIMENTATION
    //**********************************************************************************************
    public void startExperimentation()
    {
        MainActivity.this.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                AlertDialog.Builder dlgTest1 = new AlertDialog.Builder(MainActivity.this);
                dlgTest1.setTitle("Expérimentation");
                dlgTest1.setMessage("Octopocus: Athens");
                //Création d'un bouton "OK" dans notre fenetre Dialog
                dlgTest1.setPositiveButton("OK", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int wichButton){
                        dialog.dismiss();
                        mThread10.start();
                    }
                });
                dlgTest1.setCancelable(true);
                dlgTest1.create().show();
            }
        });
    }
    public void startExpMenu() {

        MainActivity.this.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                AlertDialog.Builder dlgTest1 = new AlertDialog.Builder(MainActivity.this);
                dlgTest1.setTitle("Expérimentation");
                dlgTest1.setMessage("Menu: Athens");
                //Création d'un bouton "OK" dans notre fenetre Dialog
                dlgTest1.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int wichButton) {
                        dialog.dismiss();
                    }
                });
                dlgTest1.setCancelable(true);
                dlgTest1.create().show();
            }
        });
    }
    public void Experimentation2()
    {
        MainActivity.this.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                AlertDialog.Builder dlgTest1 = new AlertDialog.Builder(MainActivity.this);
                dlgTest1.setTitle("Expérimentation");
                dlgTest1.setMessage("Octopocus: Rio");
                //Création d'un bouton "OK" dans notre fenetre Dialog
                dlgTest1.setPositiveButton("OK", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int wichButton){
                        dialog.dismiss();
                        mThread11.start();
                    }
                });
                dlgTest1.setCancelable(true);
                dlgTest1.create().show();
            }
        });
    }
    public void startExpMenu2() {

        MainActivity.this.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                AlertDialog.Builder dlgTest1 = new AlertDialog.Builder(MainActivity.this);
                dlgTest1.setTitle("Expérimentation");
                dlgTest1.setMessage("Menu: Rio");
                //Création d'un bouton "OK" dans notre fenetre Dialog
                dlgTest1.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int wichButton) {
                        dialog.dismiss();
                    }
                });
                dlgTest1.setCancelable(true);
                dlgTest1.create().show();
            }
        });
    }
    public void Experimentation3()
    {
        MainActivity.this.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                AlertDialog.Builder dlgTest1 = new AlertDialog.Builder(MainActivity.this);
                dlgTest1.setTitle("Expérimentation");
                dlgTest1.setMessage("Octopocus: Brussels");
                //Création d'un bouton "OK" dans notre fenetre Dialog
                dlgTest1.setPositiveButton("OK", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int wichButton){
                        dialog.dismiss();
                        mThread12.start();
                    }
                });
                dlgTest1.setCancelable(true);
                dlgTest1.create().show();
            }
        });
    }
    public void startExpMenu3() {

        MainActivity.this.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                AlertDialog.Builder dlgTest1 = new AlertDialog.Builder(MainActivity.this);
                dlgTest1.setTitle("Expérimentation");
                dlgTest1.setMessage("Menu: Brussels");
                //Création d'un bouton "OK" dans notre fenetre Dialog
                dlgTest1.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int wichButton) {
                        dialog.dismiss();
                    }
                });
                dlgTest1.setCancelable(true);
                dlgTest1.create().show();
            }
        });
    }
    public void Experimentation4()
    {
        MainActivity.this.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                AlertDialog.Builder dlgTest1 = new AlertDialog.Builder(MainActivity.this);
                dlgTest1.setTitle("Expérimentation");
                dlgTest1.setMessage("Octopocus: Sofia");
                //Création d'un bouton "OK" dans notre fenetre Dialog
                dlgTest1.setPositiveButton("OK", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int wichButton){
                        dialog.dismiss();
                        mThread13.start();
                    }
                });
                dlgTest1.setCancelable(true);
                dlgTest1.create().show();
            }
        });
    }
    public void startExpMenu4() {

        MainActivity.this.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                AlertDialog.Builder dlgTest1 = new AlertDialog.Builder(MainActivity.this);
                dlgTest1.setTitle("Expérimentation");
                dlgTest1.setMessage("Menu: Sofia");
                //Création d'un bouton "OK" dans notre fenetre Dialog
                dlgTest1.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int wichButton) {
                        dialog.dismiss();
                    }
                });
                dlgTest1.setCancelable(true);
                dlgTest1.create().show();
            }
        });
    }
    public void Experimentation5()
    {
        MainActivity.this.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                AlertDialog.Builder dlgTest1 = new AlertDialog.Builder(MainActivity.this);
                dlgTest1.setTitle("Expérimentation");
                dlgTest1.setMessage("Octopocus: London");
                //Création d'un bouton "OK" dans notre fenetre Dialog
                dlgTest1.setPositiveButton("OK", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int wichButton){
                        dialog.dismiss();
                        mThread14.start();
                    }
                });
                dlgTest1.setCancelable(true);
                dlgTest1.create().show();
            }
        });
    }
    public void startExpMenu5() {

        MainActivity.this.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                AlertDialog.Builder dlgTest1 = new AlertDialog.Builder(MainActivity.this);
                dlgTest1.setTitle("Expérimentation");
                dlgTest1.setMessage("Menu: London");
                //Création d'un bouton "OK" dans notre fenetre Dialog
                dlgTest1.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int wichButton) {
                        dialog.dismiss();
                    }
                });
                dlgTest1.setCancelable(true);
                dlgTest1.create().show();
            }
        });
    }
    public void Experimentation6()
    {
        MainActivity.this.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                AlertDialog.Builder dlgTest1 = new AlertDialog.Builder(MainActivity.this);
                dlgTest1.setTitle("Expérimentation");
                dlgTest1.setMessage("Octopocus: Tokyo");
                //Création d'un bouton "OK" dans notre fenetre Dialog
                dlgTest1.setPositiveButton("OK", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int wichButton){
                        dialog.dismiss();
                        mThread15.start();
                    }
                });
                dlgTest1.setCancelable(true);
                dlgTest1.create().show();
            }
        });
    }
    public void startExpMenu6() {

        MainActivity.this.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                AlertDialog.Builder dlgTest1 = new AlertDialog.Builder(MainActivity.this);
                dlgTest1.setTitle("Expérimentation");
                dlgTest1.setMessage("Menu: Tokyo");
                //Création d'un bouton "OK" dans notre fenetre Dialog
                dlgTest1.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int wichButton) {
                        dialog.dismiss();
                    }
                });
                dlgTest1.setCancelable(true);
                dlgTest1.create().show();
            }
        });
    }
    public void Experimentation7()
    {
        MainActivity.this.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                AlertDialog.Builder dlgTest1 = new AlertDialog.Builder(MainActivity.this);
                dlgTest1.setTitle("Expérimentation");
                dlgTest1.setMessage("Octopocus: Moscow");
                //Création d'un bouton "OK" dans notre fenetre Dialog
                dlgTest1.setPositiveButton("OK", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int wichButton){
                        dialog.dismiss();
                        mThread16.start();
                    }
                });
                dlgTest1.setCancelable(true);
                dlgTest1.create().show();
            }
        });
    }
    public void startExpMenu7() {

        MainActivity.this.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                AlertDialog.Builder dlgTest1 = new AlertDialog.Builder(MainActivity.this);
                dlgTest1.setTitle("Expérimentation");
                dlgTest1.setMessage("Menu: Moscow");
                //Création d'un bouton "OK" dans notre fenetre Dialog
                dlgTest1.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int wichButton) {
                        dialog.dismiss();
                    }
                });
                dlgTest1.setCancelable(true);
                dlgTest1.create().show();
            }
        });
    }
    public void Experimentation8()
    {
        MainActivity.this.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                AlertDialog.Builder dlgTest1 = new AlertDialog.Builder(MainActivity.this);
                dlgTest1.setTitle("Expérimentation");
                dlgTest1.setMessage("Octopocus: Vienna");
                //Création d'un bouton "OK" dans notre fenetre Dialog
                dlgTest1.setPositiveButton("OK", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int wichButton){
                        dialog.dismiss();
                        mThread17.start();
                    }
                });
                dlgTest1.setCancelable(true);
                dlgTest1.create().show();
            }
        });
    }
    public void startExpMenu8() {

        MainActivity.this.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                AlertDialog.Builder dlgTest1 = new AlertDialog.Builder(MainActivity.this);
                dlgTest1.setTitle("Expérimentation");
                dlgTest1.setMessage("Menu: Vienna");
                //Création d'un bouton "OK" dans notre fenetre Dialog
                dlgTest1.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int wichButton) {
                        dialog.dismiss();
                    }
                });
                dlgTest1.setCancelable(true);
                dlgTest1.create().show();
            }
        });
    }
    public void Experimentation9()
    {
        MainActivity.this.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                AlertDialog.Builder dlgTest1 = new AlertDialog.Builder(MainActivity.this);
                dlgTest1.setTitle("Expérimentation");
                dlgTest1.setMessage("Octopocus: Oslo");
                //Création d'un bouton "OK" dans notre fenetre Dialog
                dlgTest1.setPositiveButton("OK", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int wichButton){
                        dialog.dismiss();
                        mThread18.start();
                    }
                });
                dlgTest1.setCancelable(true);
                dlgTest1.create().show();
            }
        });
    }
    public void startExpMenu9() {

        MainActivity.this.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                AlertDialog.Builder dlgTest1 = new AlertDialog.Builder(MainActivity.this);
                dlgTest1.setTitle("Expérimentation");
                dlgTest1.setMessage("Menu: Oslo");
                //Création d'un bouton "OK" dans notre fenetre Dialog
                dlgTest1.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int wichButton) {
                        dialog.dismiss();
                    }
                });
                dlgTest1.setCancelable(true);
                dlgTest1.create().show();
            }
        });
    }
    public void Experimentation10()
    {
        MainActivity.this.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                AlertDialog.Builder dlgTest1 = new AlertDialog.Builder(MainActivity.this);
                dlgTest1.setTitle("Expérimentation");
                dlgTest1.setMessage("Octopocus: Toronto");
                //Création d'un bouton "OK" dans notre fenetre Dialog
                dlgTest1.setPositiveButton("OK", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int wichButton){
                        dialog.dismiss();
                        mThread19.start();
                    }
                });
                dlgTest1.setCancelable(true);
                dlgTest1.create().show();
            }
        });
    }
    public void startExpMenu10() {

        MainActivity.this.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                AlertDialog.Builder dlgTest1 = new AlertDialog.Builder(MainActivity.this);
                dlgTest1.setTitle("Expérimentation");
                dlgTest1.setMessage("Menu: Toronto");
                //Création d'un bouton "OK" dans notre fenetre Dialog
                dlgTest1.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int wichButton) {
                        dialog.dismiss();
                    }
                });
                dlgTest1.setCancelable(true);
                dlgTest1.create().show();
            }
        });
    }
    public void Experimentation11()
    {
        MainActivity.this.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                AlertDialog.Builder dlgTest1 = new AlertDialog.Builder(MainActivity.this);
                dlgTest1.setTitle("Expérimentation");
                dlgTest1.setMessage("Octopocus: Miami");
                //Création d'un bouton "OK" dans notre fenetre Dialog
                dlgTest1.setPositiveButton("OK", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int wichButton){
                        dialog.dismiss();
                        mThread20.start();
                    }
                });
                dlgTest1.setCancelable(true);
                dlgTest1.create().show();
            }
        });
    }
    public void startExpMenu11() {

        MainActivity.this.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                AlertDialog.Builder dlgTest1 = new AlertDialog.Builder(MainActivity.this);
                dlgTest1.setTitle("Expérimentation");
                dlgTest1.setMessage("Menu: Miami");
                //Création d'un bouton "OK" dans notre fenetre Dialog
                dlgTest1.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int wichButton) {
                        dialog.dismiss();
                    }
                });
                dlgTest1.setCancelable(true);
                dlgTest1.create().show();
            }
        });
    }
    public void Experimentation12()
    {
        MainActivity.this.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                AlertDialog.Builder dlgTest1 = new AlertDialog.Builder(MainActivity.this);
                dlgTest1.setTitle("Expérimentation");
                dlgTest1.setMessage("Octopocus: Sydney");
                //Création d'un bouton "OK" dans notre fenetre Dialog
                dlgTest1.setPositiveButton("OK", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int wichButton){
                        dialog.dismiss();
                        mThread21.start();
                    }
                });
                dlgTest1.setCancelable(true);
                dlgTest1.create().show();
            }
        });
    }
    public void startExpMenu12() {

        MainActivity.this.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                AlertDialog.Builder dlgTest1 = new AlertDialog.Builder(MainActivity.this);
                dlgTest1.setTitle("Expérimentation");
                dlgTest1.setMessage("Menu: Sydney");
                //Création d'un bouton "OK" dans notre fenetre Dialog
                dlgTest1.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int wichButton) {
                        dialog.dismiss();
                    }
                });
                dlgTest1.setCancelable(true);
                dlgTest1.create().show();
            }
        });
    }
    public void Experimentation13()
    {
        MainActivity.this.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                AlertDialog.Builder dlgTest1 = new AlertDialog.Builder(MainActivity.this);
                dlgTest1.setTitle("Expérimentation");
                dlgTest1.setMessage("Octopocus: Dublin");
                //Création d'un bouton "OK" dans notre fenetre Dialog
                dlgTest1.setPositiveButton("OK", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int wichButton){
                        dialog.dismiss();
                        mThread22.start();
                    }
                });
                dlgTest1.setCancelable(true);
                dlgTest1.create().show();
            }
        });
    }
    public void startExpMenu13() {

        MainActivity.this.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                AlertDialog.Builder dlgTest1 = new AlertDialog.Builder(MainActivity.this);
                dlgTest1.setTitle("Expérimentation");
                dlgTest1.setMessage("Menu: Dublin");
                //Création d'un bouton "OK" dans notre fenetre Dialog
                dlgTest1.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int wichButton) {
                        dialog.dismiss();
                    }
                });
                dlgTest1.setCancelable(true);
                dlgTest1.create().show();
            }
        });
    }
    public void Experimentation14()
    {
        MainActivity.this.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                AlertDialog.Builder dlgTest1 = new AlertDialog.Builder(MainActivity.this);
                dlgTest1.setTitle("Expérimentation");
                dlgTest1.setMessage("Octopocus: Rome");
                //Création d'un bouton "OK" dans notre fenetre Dialog
                dlgTest1.setPositiveButton("OK", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int wichButton){
                        dialog.dismiss();
                        mThread23.start();
                    }
                });
                dlgTest1.setCancelable(true);
                dlgTest1.create().show();
            }
        });
    }
    public void startExpMenu14() {

        MainActivity.this.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                AlertDialog.Builder dlgTest1 = new AlertDialog.Builder(MainActivity.this);
                dlgTest1.setTitle("Expérimentation");
                dlgTest1.setMessage("Menu: Rome");
                //Création d'un bouton "OK" dans notre fenetre Dialog
                dlgTest1.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int wichButton) {
                        dialog.dismiss();
                    }
                });
                dlgTest1.setCancelable(true);
                dlgTest1.create().show();
            }
        });
    }
    public void Experimentation15()
    {
        MainActivity.this.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                AlertDialog.Builder dlgTest1 = new AlertDialog.Builder(MainActivity.this);
                dlgTest1.setTitle("Expérimentation");
                dlgTest1.setMessage("Octopocus: Berlin");
                //Création d'un bouton "OK" dans notre fenetre Dialog
                dlgTest1.setPositiveButton("OK", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int wichButton){
                        dialog.dismiss();
                        mThread24.start();
                    }
                });
                dlgTest1.setCancelable(true);
                dlgTest1.create().show();
            }
        });
    }
    public void startExpMenu15() {

        MainActivity.this.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                AlertDialog.Builder dlgTest1 = new AlertDialog.Builder(MainActivity.this);
                dlgTest1.setTitle("Expérimentation");
                dlgTest1.setMessage("Menu: Berlin");
                //Création d'un bouton "OK" dans notre fenetre Dialog
                dlgTest1.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int wichButton) {
                        dialog.dismiss();
                    }
                });
                dlgTest1.setCancelable(true);
                dlgTest1.create().show();
            }
        });
    }
    public void Experimentation16()
    {
        MainActivity.this.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                AlertDialog.Builder dlgTest1 = new AlertDialog.Builder(MainActivity.this);
                dlgTest1.setTitle("Expérimentation");
                dlgTest1.setMessage("Octopocus: Paris");
                //Création d'un bouton "OK" dans notre fenetre Dialog
                dlgTest1.setPositiveButton("OK", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int wichButton){
                        dialog.dismiss();
                        mThread25.start();
                    }
                });
                dlgTest1.setCancelable(true);
                dlgTest1.create().show();
            }
        });
    }
    public void startExpMenu16() {

        MainActivity.this.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                AlertDialog.Builder dlgTest1 = new AlertDialog.Builder(MainActivity.this);
                dlgTest1.setTitle("Expérimentation");
                dlgTest1.setMessage("Menu: Paris");
                //Création d'un bouton "OK" dans notre fenetre Dialog
                dlgTest1.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int wichButton) {
                        dialog.dismiss();
                    }
                });
                dlgTest1.setCancelable(true);
                dlgTest1.create().show();
            }
        });
    }
    public void ResultExperimentation(){
        for(int i = 0; i < 16; i++)
        {
            Log.i("RESULTAT", "Expérience OctoPocus "+i+": Temps: " + tempsExp[i] + " Erreur: " + erreurExp[i]);
        }
        for(int i = 0; i < 16; i++)
        {
            Log.i("RESULTAT", "Expérience Menu "+i+": Temps: " + tempsExpM[i] + " Erreur: " + erreurExpM[i]);
        }
    }
}
