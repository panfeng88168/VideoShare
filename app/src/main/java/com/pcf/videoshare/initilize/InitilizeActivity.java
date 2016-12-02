package com.pcf.videoshare.initilize;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.pcf.videoshare.R;

import org.w3c.dom.Text;

public class InitilizeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //TODO asdfasdfasdf
        TextView tv=(TextView)findViewById(R.id.tv);
        tv.setText("test!!!");
    }
}
