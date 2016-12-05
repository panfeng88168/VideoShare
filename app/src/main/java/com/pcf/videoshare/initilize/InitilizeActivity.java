package com.pcf.videoshare.initilize;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.pcf.videoshare.R;

public class InitilizeActivity extends Activity {

    private String mInt;

    public String getmInt() {
        return mInt;
    }

    public void setmInt(String mInt) {
        this.mInt = mInt;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //TODO asdfasdfasdf
        TextView tv= (TextView) findViewById(R.id.tv);
        tv.setText("TEST!!!");
    }
}
