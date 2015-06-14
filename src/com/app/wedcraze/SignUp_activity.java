package com.app.wedcraze;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SignUp_activity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.signup);
	}


	public void Create_join_wedding(View view) {
		  Intent intent = new Intent(this, Create_join_wedding.class);
		  startActivity(intent);
		}
}
