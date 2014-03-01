package com.bearbus;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.app.Activity;
import android.widget.AdapterView.OnItemSelectedListener;
import android.view.View;
import android.widget.ArrayAdapter;
/**
 * Created by BryceOld on 3/1/14.
 */
public class SpinnerActivity extends Activity implements AdapterView.OnItemSelectedListener {

    public void populateSpinner()
    {
        spinner = (Spinner) findViewById(R.id.spinner);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.stops, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner.setAdapter(adapter);
    }

    public void onItemSelected(AdapterView<?> parent, View view,
                               int pos, long id) {
        // An item was selected. You can retrieve the selected item using
        // parent.getItemAtPosition(pos)
    }

    public void onNothingSelected(AdapterView<?> parent) {
        // Another interface callback
    }

    Spinner spinner = (Spinner) findViewById(R.id.spinner);
    //spinner.setOnItemSelectedListener(this);

}
