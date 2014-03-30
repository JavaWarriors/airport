import java.util.Random;


public class PlaneGenerator {
	private Random gen;

//	Plane, landing and take off probabilities commercial, light aircraft and glider.
	private double commercialProb;
	private double lightAircraftProb;
	private double gliderProb;
	private double takeoffProb;
	private double landingProb;
	/*
	 * Generator class that creates planes with given probabilities and
	 * their directions in specified proportions.
	 *
	 * @author
	 */
	
	private Plane plane;

	/**
	 * Creates a generator for plane objects
	 *
	 * @param gen a random number generator
	 * @param commercialProb probability of creating a car
	 * @param lightAircraftProb probability of creating a truck
	 * @param gliderProb probability of creating a bus
	 * @param takeoffProb probability of a right turn
	 * @param landingProb probability of going straight on
	 */
	public PlaneGenerator(Random gen,
			double commercialProb, double lightAircraftProb, double gliderProb,
			double takeoffProb, double landingProb){
		this.gen = gen;
		this.commercialProb = commercialProb;
		this.gliderProb = gliderProb;
		this.lightAircraftProb = lightAircraftProb;
		this.landingProb = landingProb;
		this.takeoffProb = takeoffProb;
		
	}
	/**
	 * plane generator constructor.
	 * @return vehicle of the correct type governed by the probabilities
	 */
	public Plane generatePlane(){
		double planeProb = gen.nextDouble();;
		double planeDirection = gen.nextDouble();
		int flyingTime = gen.nextInt(40) + 40;
		int direction = 0;
		plane = null;
		//Assign direction
		if(planeDirection < takeoffProb){
			//assign direction, need to change the plane class for diection
			
			
		}
		else if (planeDirection < takeoffProb + landingProb){
			//assign direction, need to change the plane class for diection
			
		}
		//Create plane
		if(planeProb < commercialProb){
			plane = new CommercialPlane(flyingTime); 
			
		}
		else if (planeProb < commercialProb + lightAircraftProb){
			
			plane = new LightAircraft(20);
			
		}
		else if (planeProb < commercialProb + lightAircraftProb + gliderProb){
			
			plane = new Glider();
		}
		
		return plane;

	}

	public void setCommercialProbability(double p){
		
	}
}