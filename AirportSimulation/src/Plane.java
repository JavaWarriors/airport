
public abstract class Plane {
	protected int ID, flyingTime, takeOffTime, landingTime;
	protected static int planeID;
	protected boolean takingOff;
	
	
	
	public Plane(int flyingTime, int takeOffTime, int landingTime){
		ID = planeID++;
		this.flyingTime = flyingTime;
		this.takeOffTime = takeOffTime;
		this.landingTime = landingTime;
		
		
	}
	
	//For the Glider
	public Plane(int takeOffTime, int landingTime){
		this.takeOffTime = takeOffTime;
		this.landingTime = landingTime;
		
	}
	
	public int getFliyingTime(){
		
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
		return takingOff;
		
	}
	
	/**
	 * Returns Plane information
	 */
	
	public String toString(){
		
		
		
		return  "Landing Time = " + landingTime + "Take Off Time = " + takeOffTime;
	}
	

}
