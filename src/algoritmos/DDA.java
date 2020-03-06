package algoritmos;

import entities.Image;
import entities.Point;

public class DDA {
	
	private Image img;
	
	public DDA(Image img) {
		setImg(img);
	}

	public Image getImg() {
		return img;
	}

	public void setImg(Image img) {
		this.img = img;
	}
	
	public void raster(Point first, Point last) {
		
		Integer step = (Math.abs(last.getX() - first.getX()) > Math.abs(last.getY() - first.getY())) 
				? Math.abs(last.getX() - first.getX()) 
						: Math.abs(last.getY() - first.getY());
				
		float Xinc = (last.getX() - first.getX());
		Xinc /= step;
		
		float Yinc = last.getY() - first.getY();
		Yinc /= step;
		
		float x = first.getX();
		float y = first.getY();
		
		for(int i = 0 ; i <= step; i ++) {
			getImg().setPixel(new Point(Math.round(x), Math.round(y)));
			x += Xinc;
			y += Yinc;
		}
		
	}
	
	@Override
	public String toString() {
		return getImg().toString();
	}
	
}
