package com.Login;
import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import android.widget.Toast;

public class LoginActivity extends Activity {
	Button b1,b2; 	   
	EditText ed1,ed2;
	    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
           
        ed1 = (EditText)findViewById(R.id.editText1);
        ed2 = (EditText)findViewById(R.id.editText2);
        b1=(Button)findViewById(R.id.button1);
        
        b1.setOnClickListener(new View.OnClickListener()
        {
        	 public void onClick(View v) 
            {
            if(ed1.getText().toString().equals("hi") &&  ed2.getText().toString().equals("mas"))
                {                     
            	Toast.makeText(LoginActivity.this, "Login Successful",                       
                        Toast.LENGTH_SHORT).show();
                } 
            else 
            {
               // If incorrect, show a toast message
               Toast.makeText(LoginActivity.this, "Incorrect username or password",                       
                Toast.LENGTH_SHORT).show();
             }
            }
         });
         b2=(Button)findViewById(R.id.button2);
         b2.setOnClickListener(new View.OnClickListener() {
              public void onClick(View v) 
              {
               finish();
            }
         });
      }
   }
