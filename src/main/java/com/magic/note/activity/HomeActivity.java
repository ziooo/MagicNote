package com.magic.note.activity;


import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.magic.note.R;

public class HomeActivity extends Activity {

	   @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_home);
	    }

	    @Override
	    public void onStart() {
	        super.onStart();
	        TextView textView = (TextView) findViewById(R.id.text_view);
	        textView.setText("Hello world!");
	    }


}
