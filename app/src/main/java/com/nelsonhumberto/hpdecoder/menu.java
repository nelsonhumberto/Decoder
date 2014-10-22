package com.nelsonhumberto.hpdecoder;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Arrays;





public class menu extends Activity {
    AutoCompleteTextView atv;
    String Source;
    String[]allmodels={"4310s", "5310m","4410s","4415s","6440b","6445b","4510s","4515s","6540b","6545b","4710s","2530p","2730p","6930p","8530p","8530w","8730w",
    "4720s","6550b","6555b","4520s","4525s","6450b","4420s","4425s","5320m","4320s","2540p","2740p","8440p","8440w","8540p","8540w","8740w",
    "4230s","4330s","5330m","6360b","4430s","4435s","6460b","6465b","4530s","4535s","6560b","6565b","4730s","2560p","2760p","8460p","8460w","8560p","8560w","8760w",
    "4340s","4440s","6470b","6475b","4540s","4545s","6570b","4740s","810 Revolve","2170p","2570p","8470p","8470w","9470m","8570p","8570w","8770w",
    "650 G1","655 G1","450 G1","455 G1","640 G1","645 G1","440 G1","430 G1","820 G1","840 G1","1040 G1 Folio","850 G1","430 G2","440 G2","450 G2","455 G2","820 G2","755 G2","745 G2","725 G2"};


    String[]models09={"4310s", "5310m","4410s","4415s","6440b","6445b","4510s","4515s","6540b","6545b","4710s","2530p","2730p","6930p","8530p","8530w","8730w"};
    String[]models10={"4720s","6550b","6555b","4520s","4525s","6450b","4420s","4425s","5320m","4320s","2540p","2740p","8440p","8440w","8540p","8540w","8740w"};
    String[]models11={"4230s","4330s","5330m","6360b","4430s","4435s","6460b","6465b","4530s","4535s","6560b","6565b","4730s","2560p","2760p","8460p","8460w","8560p","8560w","8760w"};
    String[]models12={"4340s","4440s","6470b","6475b","4540s","4545s","6570b","4740s","810 Revolve","2170p","2570p","8470p","8470w","9470m","8570p","8570w","8770w"};
    String[]models13={"650 G1","655 G1","450 G1","455 G1","640 G1","645 G1","440 G1","430 G1","820 G1","840 G1","1040 G1 Folio","850 G1"};
    String[]models14={"430 G2","440 G2","450 G2","455 G2","820 G2","755 G2","745 G2","725 G2"};








    ArrayAdapter<String> adapter;
    ArrayAdapter<String> adapter2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        atv =(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView);
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,allmodels);
        atv.setAdapter(adapter);




        Button searchbut = (Button) findViewById(R.id.button);
        searchbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Source = atv.getText().toString();

                if (Arrays.asList(models09).contains(Source)) {
                    Intent class09 = new Intent(getBaseContext(), model2009.class);
                    startActivity(class09);
                }
                if (Arrays.asList(models10).contains(Source)) {
                    Intent class10 = new Intent(getBaseContext(), model2010.class);
                    startActivity(class10);
                }
                if (Arrays.asList(models11).contains(Source)) {
                    Intent class11 = new Intent(getBaseContext(), model2011.class);
                    startActivity(class11);
                }

                if (Arrays.asList(models12).contains(Source)) {
                    Intent class12 = new Intent(getBaseContext(), model2012.class);
                    startActivity(class12);
                }

                if (Arrays.asList(models13).contains(Source)) {
                    Intent class13 = new Intent(getBaseContext(), model2013.class);
                    startActivity(class13);
                    //  Intent class12 = new Intent(getBaseContext(),model2012.class);
                    // startActivity(class12);
                }


            }//close onClick
        });//close onClick Listener

    }//close onCreate




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
