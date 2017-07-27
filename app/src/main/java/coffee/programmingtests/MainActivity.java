package coffee.programmingtests;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.content.Context;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // EditText Name = (EditText) findViewById(R.id.Name);
    // EditText Nr = (EditText) findViewById(R.id.Nr);
    // Button Add = (Button) findViewById(R.id.Add);
    // LinearLayout Anzeige = (LinearLayout) findViewById(R.id.Anzeige);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        // ArrayList testArrayList = new ArrayList();

        // listEntry testEntry = new listEntry();

        // testArrayList.add(testEntry);
    }

    public void OnClickHinzufuegen (View v)
    {
        LinearLayout test = (LinearLayout) findViewById(R.id.Anzeige);
        // LinearLayout test = new LinearLayout(this);
        // TextView Hinzufügen1 = new TextView(this);
        // Hinzufügen1.setTextKeepState("Test");
        //test.addView(Hinzufügen1);

        LinearLayout Eingabe1 = new LinearLayout(this);
        Eingabe1.setOrientation(LinearLayout.HORIZONTAL);

        TextView text1 = new TextView(this);
        text1.setText("Test 1");
        TextView text2 = new TextView(this);
        text2.setText("Test 2");

        Eingabe1.addView(text1);
        Eingabe1.addView(text2);

        test.addView(Eingabe1);


        // Textanzeige.setText("TestAnzeige");

        // TextView Anzeige = new TextView();
        // Anzeige.setText("TestAnzeige");

    }


}
