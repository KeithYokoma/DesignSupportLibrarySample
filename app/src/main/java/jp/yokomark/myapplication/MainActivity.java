package jp.yokomark.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * @author KeishinYokomaku
 */
public class MainActivity extends AppCompatActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void onFabClick(View v) {
		startActivity(new Intent(this, FabActivity.class));
	}

	public void onSnackBarClick(View v) {
		startActivity(new Intent(this, SnackBarActivity.class));
	}

	public void onFloatingLabelsClick(View v) {
		startActivity(new Intent(this, FloatingLabelsActivity.class));
	}
}
