package com.aji.myapps;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;

public class SplashActivity extends Activity {

	private static String TAG = SplashActivity.class.getName();
	private static long SLEEP_TIME = 5; 
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.splash);
		
		IntentLouncher louncher = new IntentLouncher();
		louncher.start();
		
		
	}

	private class IntentLouncher extends Thread {
			
		public void run() {
			try {
				Thread.sleep(SLEEP_TIME*1000);
			} catch ( Exception e){
				Log.e(TAG, e.getMessage());
			}
			
			Intent main = new Intent(SplashActivity.this, MainWall.class);
			SplashActivity.this.startActivity(main);
			SplashActivity.this.finish();
		}
		
	}
}
