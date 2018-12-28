package com.practice.practice;


import android.app.*;
import android.content.*;
import android.os.*;
import android.view.*;
import android.widget.*;

public class Activity2 extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout2);
		
		Intent intent=getIntent();
		String message=intent.getStringExtra("test");
		TextView textView=(TextView) findViewById(R.id.TextView2);
		textView.setText(message);
    }
	public void nextPage(View view){
		 startActivity(new Intent(this,Activity3.class));
		
	}
	
	
	}



