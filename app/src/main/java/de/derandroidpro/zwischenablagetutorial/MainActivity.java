package de.derandroidpro.zwischenablagetutorial;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    Button btn1;

    ClipboardManager cbm;
    ClipData clipData1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cbm = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);

        btn1 = (Button) findViewById(R.id.button);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            clipData1 = ClipData.newPlainText("Kanalemfehlung:", getResources().getString(R.string.kopiertext));
                cbm.setPrimaryClip(clipData1);
                Toast.makeText(getApplicationContext(), "Text wurde kopiert", Toast.LENGTH_SHORT).show();


            }
        });
    }



}
