package coffee.programmingtests;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList testArrayList = new ArrayList();

        listEntry testEntry = new listEntry();

        testArrayList.add(testEntry);
    }


}
