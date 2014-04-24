import java.util.Random;


public abstract class Plane {
	protected int ID, flyingTime, takeOffTime, landingTime;
	protected static int planeID;
	protected int takingOff;
	protected int waitingTime = 0;
	

	//constructor for Light aircrafts and commercial planes
	public Plane(int flyingTime, int takeOffTime, int landingTime, int takingOff){
		ID = planeID++;
		this.flyingTime = flyingTime;
		this.takeOffTime = takeOffTime;
		this.landingTime = landingTime;
		this.takingOff = takingOff;
		
	}

	//constructor for the Glider
	public Plane(int takeOffTime, int landingTime, int takingOff){
		ID = planeID++;
		this.takeOffTime = takeOffTime;
		this.landingTime = landingTime;
		flyingTime = Integer.MAX_VALUE;
		this.takingOff = takingOff;
	}

	//remove if wrong
//	public void statusGenerator(){
//		//add seed?
//		statusgenerator = new Random();
//		int digit = statusgenerator.nextInt(1);
//		if(digit == 0){
//			takingOff = false;	
//		}
//		else if(digit == 1){
//			takingOff = true;	
//		}
//	}

	//accessor methods
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
	public int getWaitingTime(){
		
		return waitingTime;
	}
	
	public boolean isTakingOff(){
		if (takingOff == 0){
		return true;}
		else{
			
		return false;	
		}
	}

	//use this method if mines wrong
	//public void setTakeOff(boolean takingOff){
	//this.takingOff = takingOff;
	//}
	
	
	public void tick(){
		waitingTime++;
		
	}

	/**
	 * Returns Plane information
	 */
	public String toString(){
		return  "Landing Time = " + landingTime + "Take Off Time = " + takeOffTime;
	}


}
