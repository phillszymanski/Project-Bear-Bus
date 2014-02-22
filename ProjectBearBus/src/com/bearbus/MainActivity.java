package com.bearbus;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

import com.parse.Parse;
import com.parse.PushService;

public class MainActivity extends Activity {

	private final String PARSE_APP_ID = "Hr5DPwQzhmzzST1sNzME8ssu3zaDxRZgtLO10Zxk";
	private final String PARSE_CLIENT_KEY = "49AgCaNyWzaFFCgHFPgS3NK0lEjTpLNPDDYBrswX";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Parse.initialize(this, PARSE_APP_ID, PARSE_APP_ID);
		PushService.setDefaultPushCallback(this, MainActivity.class);
		
		// test
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
