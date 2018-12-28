package com.practice.practice;


import android.app.*;
import android.content.*;
import android.os.*;
import android.view.*;

public class Activity3 extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout3);}
		
	public void finalPage(View view){
     startActivity(new Intent(this,Activity4.class));
	}
		}
		
