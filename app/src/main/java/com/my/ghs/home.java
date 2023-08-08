package com.my.ghs;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.app.Activity;
import android.os.Bundle;

public class home extends Activity {
	Button profile_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
       getActionBar().hide();
	    Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.MSG);
		
		profile_btn = (Button) findViewById(R.id.profile_btn);
		
		profile_btn.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(home.this, activity_profile.class);
					startActivity(intent);
				}
		});
    }
}
