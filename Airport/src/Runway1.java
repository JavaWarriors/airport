import java.util.*;

public class Runway1 {
	private Boolean runwayIsVacant = false;
	private int takeoffindex = 0;
	private int landingindex = 0;
	
	public SingleRunway(){
		Random b = new Random();
		Queue<Plane> takeoffQueue = new LinkedList<Plane>();
		Queue<Plane> landingQueue = new LinkedList<Plane>();
		Queue<Plane> breakdownQueue = new LinkedList<Plane>();
		Queue<Plane> runwaySpace = new LinkedList<Plane>();
		RunwayStats runwaystats = new RunwayStats();
	}

	public void addToTakeOff(Plane p){
		takeoffQueue.add(p);
	}

	public void addToLanding(Plane p){
		landingQueue.add(p);
	}

	public void clearRunway(){
		//delete the plane in the runway space after x number of ticks
		//this method will be called by a
		//set runwayisvacant to true
		runwaySpace.pop();
		runwayIsVacant = true;

	}

	//public void releasePlane(){
	//if (runwayIsVacant == true){
	//runwayIsVacant = false;
	//for(int i = 0; i < takeoffQueue.size(); i++){
	//double val = b.nextDouble();
	//Plane p = takeoffQueue.get(i);
	//if (val <= 0.0001){
	//breakdownQueue.add(p);	
	//}
	//else{
	//runwaySpace.add(p);
	//takeoffQueue.remove(i);	
	//}
//	}
//	}


	public void releasePlane(){
		if(runwayIsVacant == true){
			Plane p = takeoffQueue.get(i);
			runwaySpace.add(p);
			takeoffQueue.remove(i);
			runwayIsVacant = false;
			takeoffindex++;
		}
	}

	public void landPlane(){
		if (runwayIsVacant == true){
			runwayIsVacant = false;
			for(int i = 0; i < landingQueue.size(); i++){
				Plane p = landingQueue.get(i);
				runwaySpace.add(p);
				landingQueue.remove(i);
			}

		}


	}







}
