package net.albertogarrido.buildvariants;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class BuildVariantsMainActivity extends ActionBarActivity implements ClientConfiguration {

    private static final String TAG = "MainActivity";

    private TextView mConfigTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_build_variants_main);

        mConfigTextView = (TextView) findViewById(R.id.configDemo);
        mConfigTextView.setText(CLIENT_NAME);

        Log.d(TAG, "BuildConfig.FLAVOR: " + BuildConfig.FLAVOR);
        Log.d(TAG, "BuildConfig.APPLICATION_ID: " + BuildConfig.APPLICATION_ID);
        Log.d(TAG, "BuildConfig.BUILD_TYPE: " + BuildConfig.BUILD_TYPE);
        Log.d(TAG, "BuildConfig.VERSION_CODE: " + BuildConfig.VERSION_CODE);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_build_variants_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
