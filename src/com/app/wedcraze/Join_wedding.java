package com.app.wedcraze;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class Join_wedding extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);

		this.setContentView(R.layout.activity_join_wedding);
	}
	
	public void Main_Admin_Page(View view) {
		  Intent intent = new Intent(this, Main_Admin_Page.class);
		  startActivity(intent);
		}
}
