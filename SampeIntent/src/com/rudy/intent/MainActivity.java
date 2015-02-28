package com.rudy.intent;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.content.Intent;

public class MainActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
	public void Klik(View v){
		Intent A=new Intent(MainActivity.this,Layout2.class);
		startActivity(A);
	}
}
