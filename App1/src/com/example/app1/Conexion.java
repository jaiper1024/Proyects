package com.example.app1;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;

public class Conexion {
	Point puntoInicial;
	Point puntoFinal;
	
	public Conexion(Point puntoInicial, Point puntoFinal) {
		super();
		this.puntoInicial = puntoInicial;
		this.puntoFinal = puntoFinal;
	}

	public void graficar(Canvas canvas, Paint paint)
	{
	//	int offSetY=130;
		canvas.drawLine(puntoFinal.x, puntoFinal.y,
				puntoInicial.x, puntoInicial.y, paint);
	}

}
