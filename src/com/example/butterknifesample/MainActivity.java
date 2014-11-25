package com.example.butterknifesample;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {

	private int clickIndex = 0;
	
	@InjectView(R.id.text)
	TextView mTextView;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
    }
    
    @Override
    protected void onDestroy() {
    	super.onDestroy();
    	ButterKnife.reset(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    
    @OnClick(R.id.button)
    void onClickButton(View v) {
    	clickIndex += 1;
    	mTextView.setText(String.valueOf(clickIndex));
    	
    	Toast.makeText(this, "On click!!", Toast.LENGTH_SHORT).show();
    }
}
