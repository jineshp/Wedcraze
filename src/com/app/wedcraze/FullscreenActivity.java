package com.app.wedcraze;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

import com.app.wedcraze.util.SystemUiHider;


/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 *
 * @see SystemUiHider
 */
public class FullscreenActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);

		//setContentView(R.layout.activity_fullscreen);
		//Remove title bar
		this.setContentView(R.layout.activity_fullscreen);

	}
	
	public void signup(View view) {
		  Intent intent = new Intent(this, SignUp_activity.class);
		  startActivity(intent);
		}
}
		