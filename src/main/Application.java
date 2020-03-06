package main;

import algoritmos.DDA;
import entities.Image;
import entities.Point;

public class Application {
	public static void main(String[] args) {
		
		DDA dda = new DDA(new Image(10,10));
		
		dda.raster(new Point(9, 2), new Point(8, 8));
		
		System.out.println(dda.toString());
		
	}
}
