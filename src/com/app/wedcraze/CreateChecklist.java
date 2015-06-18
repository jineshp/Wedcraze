package com.app.wedcraze;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class CreateChecklist extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		this.setContentView(R.layout.activity_create_checklist);
	}

	public void createinvitations(View view) {
		  Intent intent = new Intent(this, CreateInvitations.class);
		  startActivity(intent);
		}
}
