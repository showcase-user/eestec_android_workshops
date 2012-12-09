package gr.ntua.eestec.first_workshop;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {

	private EditText mEditText;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Button btn = (Button) findViewById(R.id.button1);
		btn.setOnClickListener(this);

		mEditText = (EditText) findViewById(R.id.editText1);
	}

	@Override
	public void onClick(View v) {

		String displayString = "Hello, " + mEditText.getText().toString() + "!";
		Toast.makeText(this, displayString, Toast.LENGTH_LONG).show();
	}
}
