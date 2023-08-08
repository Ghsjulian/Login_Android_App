package com.my.ghs;

import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.app.Activity;

public class splash extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		getActionBar().hide();

		/*   SPLASH SCREEN CODES   */
		Thread thread = new Thread() {
			public void run() {
				try {
					sleep(2000);
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					Intent intent = new Intent(splash.this, MainActivity.class);
					startActivity(intent);
					finish();
				}
			}
		};
		thread.start();
	}
}