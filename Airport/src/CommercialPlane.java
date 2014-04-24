
public class CommercialPlane extends Plane {

	
	//commercial flights take off time = 2 minutes (4 ticks)
	//landing time = 3 minutes (6 ticks)
	public CommercialPlane(int flyingTime, int takingOff){
		super(flyingTime, 4, 6, takingOff);
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

	public boolean isTakingOff(){
		
		return super.isTakingOff();
	}
	
	public void tick(){
		super.tick();
		
		
	}

	/**
	 * Returns a String representation of the Commercial Plane.
	 */

	public String toString() {
		return "Commercial Plane " + ID + " "+super.toString() + "Take Off Time = " + takeOffTime + "Flying Time = " + flyingTime;
	}


}
