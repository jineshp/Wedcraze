package com.app.wedcraze;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;


public class CreateJoinWedding extends Activity {
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		this.setContentView(R.layout.create_join_wedding);
	}

	public void createwedding(View view) {
		  Intent intent = new Intent(this, CreateWedding.class);
		  startActivity(intent);
		}

	
}
