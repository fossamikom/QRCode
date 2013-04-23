package com.aji.myapps;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainWall extends Activity {
	 
	   
	   @Override
	   protected void onCreate(Bundle savedInstanceState) {
	      super.onCreate(savedInstanceState);
	      setContentView(R.layout.mainwall);
	      Button tentang = (Button) findViewById(R.id.btntentang);
	      tentang.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent ketentang = new Intent(getApplicationContext(), tentang.class);
				startActivity(ketentang);
			
			}
		});
	      
	   	}
	   
	 
	}
