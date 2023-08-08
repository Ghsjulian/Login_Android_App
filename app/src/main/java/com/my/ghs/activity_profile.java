package com.my.ghs;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.app.Activity;
import android.os.Bundle;
import com.android.volley.toolbox.Volley;

public class activity_profile extends Activity{
	    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
       getActionBar().hide();
	   }
}