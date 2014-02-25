package com.bearbus;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import java.util.ArrayList;
import java.util.List;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

import com.parse.Parse;
import com.parse.PushService;

public class MainActivity extends Activity {

	private final String PARSE_APP_ID = "Hr5DPwQzhmzzST1sNzME8ssu3zaDxRZgtLO10Zxk";
	private final String PARSE_CLIENT_KEY = "49AgCaNyWzaFFCgHFPgS3NK0lEjTpLNPDDYBrswX";
    private Spinner spinner;
    private ArrayList stops;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Parse.initialize(this, PARSE_APP_ID, PARSE_APP_ID);
		PushService.setDefaultPushCallback(this, MainActivity.class);

        addItemsOnSpinner();
		// test
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

    public void addItemsOnSpinner()
    {
        spinner = (Spinner) findViewById(R.id.spinner);
        stops.add("Parking Lot 3");
        stops.add("Parking Lot 11");
        stops.add("Parking Lot 35");
        stops.add("Meadow Brook Road");
        stops.add("Recreation Center");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, stops);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner Items = (Spinner) findViewById(R.id.spinner);
        Items.setAdapter(adapter);
    }

    public void addListenerOnSpinnerItemSelection() {
        spinner = (Spinner) findViewById(R.id.spinner);
        //spinner.setOnItemSelectedListener();
    }



}
