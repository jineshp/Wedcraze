package com.app.wedcraze;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class CreateInvitations extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		this.setContentView(R.layout.activity_create_invitations);
	}
	
	public void createyourstory(View view) {
		  Intent intent = new Intent(this, CreateYourStory.class);
		  startActivity(intent);
		}
}
