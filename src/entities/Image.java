package entities;

public class Image {

	private Integer[][] img;
	private Integer x;
	private Integer y;
	
	public Image(int x, int y) {
		this.img = new Integer[x][y];
		this.x = x;
		this.y = y;
		
		for(int i = 0; i < x; i ++)
			for(int j = 0; j < y; j ++)
				this.img[i][j] = 0;
	}

	public Integer[][] getImg() {
		return img;
	}
	
	public void setPixel(Point p) {
		this.img[p.getX()][p.getY()] = 1;
	}
	
	@Override
	public String toString() {
		int height = 0;
		String image = "";
		
		while(height < y) {
			String line = "";
			for(int i = 0; i < this.x; i ++) {
				line += img[i][height].toString() + " ";
			}
			image += String.format("%s\n", line);
			height += 1;
		}
				
		return image;
	}
	
}
