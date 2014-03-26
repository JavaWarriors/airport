
public class CommercialPlane extends Plane {
	
	
	
	public CommercialPlane(int flyingTime, int takeOffTime, int landingTime){
		super(flyingTime, takeOffTime, landingTime);
		
	}
	
	public boolean isTakingOff (){
		return super.isTakingOff();
		
	}
	/**
	 * Returns a String representation of the Commercial Plane.
	 */
	public String toString() {
		return "Commercial Plane "+ID+" "+super.toString();
	}
	

}
