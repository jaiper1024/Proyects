package com.example.app1;

import android.support.v7.app.ActionBarActivity;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.GridLayout;
import android.widget.RelativeLayout;


public class MainActivity extends ActionBarActivity {
	float iniY;
    float iniX;
    float iniLeft;
    float iniTop;
    RelativeLayout mainScreen;
    View activa=null;
    And a1,a2,a3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ElementoActivo.capaConexiones = (CapaConexiones) this.findViewById(R.id.capaConexiones);
        
        this.mainScreen =  (RelativeLayout) this.findViewById(R.id.RelativeLayout1);
        
    }
    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
    	DisplayMetrics displayMetrics = new DisplayMetrics();
	    getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
	    
    	ElementoActivo.capaConexiones.offsetY = displayMetrics.heightPixels - mainScreen.getMeasuredHeight();
   	    //Log.v("offsetY", "offsetY"+ElementoActivo.capaConexiones.offsetY);
        
        super.onWindowFocusChanged(hasFocus);
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
	@Override
	public boolean onTouchEvent(MotionEvent event) {
		// TODO Auto-generated method stub
		
		switch(event.getAction())
		{
		case MotionEvent.ACTION_MOVE:
			break;
		case MotionEvent.ACTION_DOWN:
			
			break;
		case MotionEvent.ACTION_UP:
			
			break;
		
		
		}
		return true;
	}

    }
