package com.practice.practice;

import android.app.*;
import android.content.*;
import android.os.*;
import android.view.*;
import android.widget.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		getActionBar().setDisplayHomeAsUpEnabled(true);
	
    }
	public void sendMessage(View view){
		EditText editText=(EditText) findViewById(R.id.textBox1);
		String message=editText.getText().toString();
		
		Intent intent=new Intent(this,Activity2.class);
		intent.putExtra("test",message);
		startActivity(intent);
	}
}
