package main;

import algoritmos.Bresenham;
import algoritmos.DDA;
import entities.Image;
import entities.Point;

public class Application {
	public static void main(String[] args) {
		
		//Pontos a serem ligados
		Point first = new Point(0, 0);
		Point last = new Point(3, 8);
		
		System.out.println("--------DDA--------");
		
		DDA dda = new DDA(new Image(10,10));
		dda.raster(first, last);
		System.out.println(dda.toString());
		
		System.out.println("-----Bresenham-----");
		
		Bresenham bresenham = new Bresenham(new Image(10, 10));
		bresenham.raster(first, last);
		System.out.println(bresenham.toString());
		
	}
}
