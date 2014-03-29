
public class LightAircraft extends Plane {

	//same take off and landing times as commercial aircraft
	public LightAircraft(int flyingTime){
		super(flyingTime, 4, 6);
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
