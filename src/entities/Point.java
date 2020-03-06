package entities;

public class Point {

	private Integer x;
	private Integer y;
	
	public Point(Integer x, Integer y) {
		this.x = x;
		this.y = y;
	}
	
	public Integer getX() {
		return this.x;
	}
	public Integer getY() {
		return this.y;
	}
	
	@Override
	public String toString() {
		return "Point [x=" + this.x + ", y=" + this.y + "]";
	}

}
