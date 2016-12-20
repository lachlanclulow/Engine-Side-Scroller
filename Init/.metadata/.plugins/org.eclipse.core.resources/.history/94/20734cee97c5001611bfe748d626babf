import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Unit extends Entity implements traverseConstants {
	
	/*	Unit's x coordinate	*/
	private double x;
	/*	Unit's y coordinate	*/
	private double y;
	private float speed;
	
	private static float DefSpeed = 0.2f;
	
	private Image sprite;
	private Image spriteFlipped;	
	
	/**
	 *	@param x starting x coordinate
	 *	@param y starting y coordinate
	 *	@param spriteRef file reference of sprite file
	 */
	Unit(double x, double y, String spriteRef, float speed) throws SlickException
	{
		this.x = x;
		this.y = y;
		sprite = new Image(spriteRef);
		spriteFlipped = sprite.getFlippedCopy(false, true);
		this.speed = speed;
	}
	
	public void render() {
		sprite.draw((float) x, (float) y);
	}

	public void update(double dirX, double dirY, int delta) {
	}
	
	private void gravity() {
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
