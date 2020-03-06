package algoritmos;

import entities.Image;
import entities.Point;

public class Bresenham {
	
	private Image img;
	
	public Bresenham(Image img) {
		setImg(img);
	}

	public Image getImg() {
		return img;
	}

	public void setImg(Image img) {
		this.img = img;
	}
	
    public void raster (Point first, Point last) {
        int x, y;
        int dx, dy;
        int incx, incy;
        int balance;

        if (last.getX() >= first.getX()) {
            dx = last.getX() - first.getX();
            incx = 1;
        } else {
            dx = first.getX() - last.getX();
            incx = -1;
        }

        if (last.getY() >= first.getY()) {
            dy = last.getY() - first.getY();
            incy = 1;
        } else {
            dy = first.getY() - last.getY();
            incy = -1;
        }

        x = first.getX();
        y = first.getY();

        if (dx >= dy) {
            dy <<= 1;
            balance = dy - dx;
            dx <<= 1;

            while (x != last.getX()) {
            	getImg().setPixel(new Point(x, y));
                if (balance >= 0) {
                    y += incy;
                    balance -= dx;
                }
                balance += dy;
                x += incx;
            }
            
            getImg().setPixel(new Point(x, y));
        } else {
            dx <<= 1;
            balance = dx - dy;
            dy <<= 1;

            while (y != last.getY()) {
            	
            	getImg().setPixel(new Point(x, y));
                if (balance >= 0) {
                    x += incx;
                    balance -= dy;
                }
                balance += dx;
                y += incy;
            }
            
            getImg().setPixel(new Point(x, y));
        }

        return;
    }
    
    @Override
    public String toString() {
    	return getImg().toString();
    }
}

