import org.newdawn.slick.SlickException;
import org.newdawn.slick.tiled.TiledMap;

/** Represents the camera that controls our viewpoint.
 */
public class Camera
{

    /** The unit this camera is following */
    private Player unitFollow;
    
    /** The width and height of the screen */
    /** Screen width, in pixels. */
    public final int screenwidth = Engine.screenwidth;
    /** Screen height, in pixels. */
    public final int screenheight = Engine.screenheight;

    /** The camera's location within the world. */
    /** The camera's x coordinate. */
    private double xPos;
    /** The camera's y coordinate. */
    private double yPos;

    /** Create a new Camera object. 
     * @param player Player object that the camera will follow
     * @throws SlickException */
    public Camera(Player player) throws SlickException {

        followUnit(player);
        xPos = unitFollow.getX();
        yPos = unitFollow.getY();
    }
    
    /** Return cameras x coordinate */
    public double getxPos() {
        return xPos;
    }

    /** Return cameras y coordinate */
    public double getyPos() {
        return yPos;
    }

    /** Update the game camera to recentre it's viewpoint around the player
     *  without also viewing areas outside of the map boundaries 
     *  
     *  @param map current map object
     *  @throws SlickException
     */
    public void update(TiledMap map)
    throws SlickException
    {
    	// Check x bounds
    	if (unitFollow.getX() > screenwidth/2 &&
    			unitFollow.getX() < map.getWidth()* map.getTileWidth() -
    			screenwidth/2) 
    	{
    		xPos = unitFollow.getX();
    	}
    	// Check y bounds
    	if (unitFollow.getY() > screenheight/2 &&
    			unitFollow.getY() < map.getHeight()* map.getTileHeight() -
    			screenheight/2) 
    	{
    		yPos = unitFollow.getY();
    	}
        
    }
    
    /** Returns the minimum x value on screen */
    public double getMinX(){
        return xPos - screenwidth/2;
    }
    
    /** Returns the maximum x value on screen */
    public double getMaxX(){
        return xPos + screenwidth/2;
    }
    
    /** Returns the minimum y value on screen */
    public double getMinY(){
        return yPos - screenheight/2;
    }
    
    /** Returns the maximum y value on screen */
    public double getMaxY(){
        return yPos + screenheight/2;
    }

    /** Tells the camera to follow a given unit. 
     * 
     * @param unit Player object for the camera to follow
     * @throws SlickException
     */
    public void followUnit(Player unit)
    throws SlickException
    {
        unitFollow = unit;
    }
    
}