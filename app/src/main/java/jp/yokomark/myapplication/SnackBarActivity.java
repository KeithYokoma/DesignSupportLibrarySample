package jp.yokomark.myapplication;

import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * @author KeishinYokomaku
 */
public class SnackBarActivity extends AppCompatActivity {
	private CoordinatorLayout mRoot;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_snack);
		mRoot = (CoordinatorLayout) findViewById(R.id.root);
	}

	public void onShowSnackBar(View v) {
		Snackbar.make(mRoot, "This is a snack bar", Snackbar.LENGTH_LONG).show();
	}
}
