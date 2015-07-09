package com.example.intranet;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class Main1Activity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main1);
		
		 Button btnLinear = (Button) findViewById(R.id.btnBoletaNotas);
	        btnLinear.setOnClickListener(new View.OnClickListener() {
	    		
	    		@Override
	    		public void onClick(View v) {
	    			// TODO Auto-generated method stub
	    		Intent linearIntent = new Intent(Main1Activity.this , Main3Activity.class);
	    		Main1Activity.this.startActivity(linearIntent);
	        
	    		
	    		}
	    	});
	        
	        
	        Button btnLinear1 = (Button) findViewById(R.id.btnRol);
	        btnLinear1.setOnClickListener(new View.OnClickListener() {
	    		
	    		@Override
	    		public void onClick(View v) {
	    			// TODO Auto-generated method stub
	    		Intent linearIntent = new Intent(Main1Activity.this , Main2Activity.class);
	    		Main1Activity.this.startActivity(linearIntent);
	        
	    		
	    		}
	    	});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main1, menu);
		return true;
	}

}
