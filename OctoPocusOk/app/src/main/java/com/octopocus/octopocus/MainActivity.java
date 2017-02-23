package com.octopocus.octopocus;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView objectText;
    private EditText editText;

    private ClipboardManager clipboardManager;
    private ClipData clip;

    private MenuItem pasteItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        objectText = (TextView) findViewById(R.id.object_name); // --> not used anymore
        editText = (EditText) findViewById(R.id.editText);

        // source: https://developer.android.com/guide/topics/text/copy-paste.html
        clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
    }



    public void writeDollar(Dollar dollar){   // --> not used anymore
        objectText.setText("Object: " + dollar.result.Name + " Score: " + dollar.result.Score);

    }

    public void executeCommand(String name) {
        String text = editText.getText().toString();


    }
}
