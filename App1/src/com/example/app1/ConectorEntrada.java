package com.example.app1;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

public class ConectorEntrada extends Conector {

	public ConectorEntrada(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
		if(this.getParent()==null)
		Log.v("conector", "conector null");
		else
			Log.v("conector", "conector NO null");	
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		// TODO Auto-generaethod stub
		 if(this.conectado) return super.onTouchEvent(event);
		 this.globalX=event.getRawX();
		 this.globalY=event.getRawY();
		switch(event.getAction())
		{
		
		case MotionEvent.ACTION_DOWN:
	   
		if(ElementoActivo.conectorActivo==null)
		{	
			if(this.valor.getText().toString().equals("1"))
			{
				this.valor.setText("0");
				this.valor.setTextColor(Color.parseColor(COLOR_CERO));
			}
			else
			{
				this.valor.setText("1");
				this.valor.setTextColor(Color.parseColor(COLOR_UNO));
			}
			break;
		}
		else
		{
			this.setConectado(true);
			ElementoActivo.capaConexiones.conectar((ConectorSalida)ElementoActivo.conectorActivo, this);
			ElementoActivo.conectorActivo=null;
		}
		}
		return super.onTouchEvent(event);
	}

}
