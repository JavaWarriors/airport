
public class Glider extends Plane{
	
	public Glider(int takingOff){
		super(6, 8, takingOff);
	}
	
	public int getFlyingTime(){
		return flyingTime;
	}

	public int getTakeOffTime(){
		return takeOffTime;
	}

	public int getLandingTime(){
		return landingTime;
	}

	public int getID(){
		return ID;
	}
	
	public void tick(){
		super.tick();
		
		
	}

	/**
	 * Returns a String representation of the Commercial Plane.
	 */

	public String toString() {
		return "Commercial Plane " + ID + " "+super.toString();
	}

}
