package com.example.app1;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.TextView;

public class ConectorSalida extends Conector{

	public ConectorSalida(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
		this.valor = (TextView) this.findViewById(R.id.TextViewValor);
		valor.setText("");
	}
	
	@Override
	public boolean onTouchEvent(MotionEvent event) {
		// TODO Auto-generaethod stub
		
		// if(this.conectado) return super.onTouchEvent(event);	
		 	
		 switch(event.getAction())
		{
		
		case MotionEvent.ACTION_DOWN:
			
	if(ElementoActivo.conectorActivo==null)
	{	
	
			this.setConectado(true);
			ElementoActivo.conectorActivo=this;
	
	}		
			break;
		 	
		}
		return super.onTouchEvent(event);
	}


}
