package com.app.wedcraze;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

public class Create_join_wedding extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		this.setContentView(R.layout.create_join_wedding);
	}

	
}
