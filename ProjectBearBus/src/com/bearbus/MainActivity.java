package com.bearbus;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.Menu;
import android.widget.AdapterView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import java.util.ArrayList;
import java.util.List;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.content.DialogInterface;
import com.parse.Parse;
import com.parse.PushService;
import android.widget.TextView;

public class MainActivity extends Activity {


	private final String PARSE_APP_ID = "Hr5DPwQzhmzzST1sNzME8ssu3zaDxRZgtLO10Zxk";
	private final String PARSE_CLIENT_KEY = "49AgCaNyWzaFFCgHFPgS3NK0lEjTpLNPDDYBrswX";
    ArrayList stops= new ArrayList();
    private Spinner spinner;
    private Button btnRequest;




	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Parse.initialize(this, PARSE_APP_ID, PARSE_APP_ID);
		PushService.setDefaultPushCallback(this, MainActivity.class);
        //button
        this.btnRequest = (Button) this.findViewById(R.id.request);
        this.btnRequest.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

            }
        });

        //List for stops
        List<String> SpinnerArray = new ArrayList<String>();
        SpinnerArray.add("Parking Lot 3");
        SpinnerArray.add("Parking Lot 11");
        SpinnerArray.add("Parking Lot 35");
        SpinnerArray.add("Rercreation Center");
        SpinnerArray.add("Meadow Brook Road");


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, SpinnerArray);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner spinner = (Spinner) findViewById(R.id.pspinner);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3) {
                // TODO Auto-generated method stub
                Object item = arg0.getItemAtPosition(arg2);
                if (item!=null) {
                    Toast.makeText(MainActivity.this, item.toString(),
                            Toast.LENGTH_SHORT).show();
                }
                Toast.makeText(MainActivity.this, "Selected",
                        Toast.LENGTH_SHORT).show();

            }





            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub

            }
        });

        // test
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}



    public void addListenerOnSpinnerItemSelection() {
        spinner = (Spinner) findViewById(R.id.pspinner);
        spinner.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) this);
    }



}
