package com.my.ghs;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Button;
import java.security.PublicKey;

public class MainActivity extends Activity {
	public static final String MSG = "com.my.ghs.LOGIN_INFO";
	EditText email, password;
	TextView error;
	Button login_btn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		getActionBar().hide();

		error = (TextView) findViewById(R.id.error);
		email = (EditText) findViewById(R.id.email);
		password = (EditText) findViewById(R.id.password);
		login_btn = (Button) findViewById(R.id.login_btn);

		login_btn.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				login_btn.setText("Processing");
				String uemail = email.getText().toString();
				String pass = password.getText().toString();
				if (uemail.length() == 0) {

					error.setVisibility(1);
					error.setText("Enter Email Please !");
				}
				if (pass.length() == 0) {

					error.setVisibility(1);
					error.setText("Enter Your Password !");
				} else {
					error.setVisibility(1);

					//Toast.makeText(getBaseContext(), uemail, Toast.LENGTH_LONG).show();

					Intent Homeintent = new Intent(MainActivity.this, home.class);
					String LoginInfo = uemail + "   " + pass;
					Homeintent.putExtra(MSG, LoginInfo);
					startActivity(Homeintent);
				}
			}
		});
	}
}