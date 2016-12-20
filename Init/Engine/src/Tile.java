import org.newdawn.slick.Graphics;

public class Tile extends Entity {

	Tile(double x, double y, double width, double height) {
		super(x, y);
		setColliderDimensions(width, height);
	}
	
	@Override
	public void render(Graphics g) {}

	@Override
	public void update() {}

	@Override
	public void render() {}

}
