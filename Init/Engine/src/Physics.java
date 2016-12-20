
public interface Physics {

	/**	Maximum Speed at which bodies fall	*/
	public final float TERMINAL_VELOCITY = 10.0f;
	/** Downward acceleration on all bodies	*/
	public final float GRAVITY = 0.001f;
	
	/**  Applies some acceleration to a body and its new velocity
	 *   Mass always assumed to be 1
	 * @param acceleration vertical acceleration
	 * @param velocity current velocity of body
	 * @param delta time since last frame (milliseconds)
	 * @return final velocity
	 */
	public default double vertAccelerate(double velocity, int delta) 
	{
		double retVel = velocity + (-GRAVITY)*delta;
		if (retVel >= TERMINAL_VELOCITY)
			return TERMINAL_VELOCITY;
		return retVel;
	}
}
