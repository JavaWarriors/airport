
public class Glider extends Plane{
	
	public Glider(){
		super(6, 8);
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

	public void setTakeOff(boolean takingOff){
		this.takingOff = takingOff;
	}



	public boolean isTakingOff (){
		return super.isTakingOff();
	}


	/**
	 * Returns a String representation of the Commercial Plane.
	 */

	public String toString() {
		return "Commercial Plane " + ID + " "+super.toString();
	}

}
