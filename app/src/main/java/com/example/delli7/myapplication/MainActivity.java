package com.example.delli7.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity implements View.OnClickListener{

    Button one,two,three,four,five,six;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        one=(Button)findViewById(R.id.first);
        two=(Button)findViewById(R.id.second);
        three=(Button)findViewById(R.id.third);
        four=(Button)findViewById(R.id.fourth);
        five=(Button)findViewById(R.id.fifth);
        six=(Button)findViewById(R.id.sixth);

        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
switch (v.getId()){
    case R.id.first:
        Toast.makeText(getApplicationContext(),"this is my spotify streamer application",Toast.LENGTH_SHORT).show();
        break;
    case R.id.second:
        Toast.makeText(getApplicationContext(),"this is my scores app application",Toast.LENGTH_SHORT).show();
        break;
    case R.id.third:
        Toast.makeText(getApplicationContext(),"this is my library app application",Toast.LENGTH_SHORT).show();
        break;
    case R.id.fourth:
        Toast.makeText(getApplicationContext(),"this is my build it bigger application",Toast.LENGTH_SHORT).show();
        break;
    case R.id.fifth:
        Toast.makeText(getApplicationContext(),"this is my xyz reader application",Toast.LENGTH_SHORT).show();
        break;
    case R.id.sixth:
        Toast.makeText(getApplicationContext(),"this is my capstone application",Toast.LENGTH_SHORT).show();
        break;
}
    }
}
