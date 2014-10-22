package com.nelsonhumberto.hpdecoder;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class model2011 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_model2011);


        Button step = (Button) findViewById(R.id.button);
        step.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent brand09 = new Intent(getBaseContext(), brand09.class);
                startActivity(brand09);
            }//close onClick
        });//close onClick Listener

        Button com = (Button) findViewById(R.id.button2);
        com.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent com12 = new Intent(getBaseContext(), commit12.class);
                startActivity(com12);
            }//close onClick
        });//close onClick Listener

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.model2011, menu);
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
