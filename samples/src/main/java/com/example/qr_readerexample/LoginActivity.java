package com.example.qr_readerexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Anton on 12.05.2017.
 */

public class LoginActivity extends AppCompatActivity
{
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_login);
		initButtons();
	}

	private void initButtons()
	{
		((Button) findViewById(R.id.login)).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v)
			{
				startActivity(new Intent(LoginActivity.this, MainActivity.class));
			}
		});
	}
}
