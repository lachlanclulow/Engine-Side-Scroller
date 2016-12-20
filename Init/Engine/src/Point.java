
public abstract class Point {
	/**	y coordinate	*/
	private double x;
	/**	x coordinate	*/
	private double y;
	
	/** Constructor for point
	 * 
	 * @param x x coordinate
	 * @param y y coordinate
	 */
	Point(double x, double y) { setCoordinates(x, y); }
	
	/**
	 * @return x coordinate
	 */
	public double getX() { return x; }
	
	/**
	 * @param x value to set x coordinate
	 */
	public void setX(double x) { this.x = x; }
	
	/**
	 * @return y coordinate
	 */
	public double getY() { return y; }
	
	/**
	 * @param y value to set y coordinate
	 */
	public void setY(double y) { this.y = y; }
	
	/** Sets coordinates of point
	 * 
	 * @param x x coordinate
	 * @param y y coordinate
	 */
	public void setCoordinates(double x, double y) {
		setX(x);
		setY(y);
	}
	
	/** Changes the position of the point
	 * 
	 * @param moveX increment to move x coordinate
	 * @param moveY increment to move y coordinate
	 */
	public void changePos(double moveX, double moveY)
	{
		x += moveX;
		y += moveY;
	}
	
	public abstract void render();
	
	public abstract void update();
	
}