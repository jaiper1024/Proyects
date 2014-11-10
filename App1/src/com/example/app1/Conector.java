package com.example.app1;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Conector extends LinearLayout{
	TextView valor;
	float globalX;
	float globalY;
	GradientDrawable fondo;
	boolean conectado=false;
	public static String COLOR_UNO="#088A08";
	public static String COLOR_CERO="#B40404";
//	public static String COLOR_CONEXION="#756B6B";
	public static String COLOR_CONEXION="#000000";
	public static String COLOR_SIN_CONEXION="#FFFFFF";
	
	
	public Conector(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
		LayoutInflater  mInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mInflater.inflate(R.layout.conector, this, true);
        this.valor = (TextView) this.findViewById(R.id.TextViewValor);
        View ovalo = this.findViewById(R.id.View1);
        this.fondo= (GradientDrawable)ovalo.getBackground();
        
	}
	
	public void setConectado(boolean estado)
	{
		this.conectado=estado;
		this.valor.setText("");
		if(conectado)
		this.fondo.setColor(Color.parseColor(COLOR_CONEXION));
		else
		this.fondo.setColor(Color.parseColor(COLOR_SIN_CONEXION));	
	}

	

}
