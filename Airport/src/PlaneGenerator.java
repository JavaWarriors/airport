import java.util.Random;


public class PlaneGenerator {
	private Random gen;

//	Plane, landing and take off probabilities commercial, light aircraft and glider.
	private double commercialProb;
	private double lightAircraftProb;
	private double gliderProb;
	private static final double TAKEOFF_PROB = 0.5;
	private static final double LANDING_PROB = 0.5;
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
			double commercialProb, double lightAircraftProb, double gliderProb){
		this.gen = gen;
		this.commercialProb = commercialProb;
		this.gliderProb = gliderProb;
		this.lightAircraftProb = lightAircraftProb;
		
	}
	/**
	 * plane generator constructor.
	 * @return vehicle of the correct type governed by the probabilities
	 */
	public Plane generatePlane(){
		double planeProb = gen.nextDouble();;
		double planeDirection = gen.nextDouble();
		int flyingTime = 0;
		int takingOff = 0;
		plane = null;
		//Assign direction
		if(planeDirection < TAKEOFF_PROB){
			//assign direction, need to change the plane class for direction
			takingOff = 0;
			
		}
		else if (planeDirection < TAKEOFF_PROB + LANDING_PROB){
			//assign direction, need to change the plane class for direction
			takingOff = 1;
		}
		//Create plane
		if(planeProb < commercialProb){
			flyingTime = gen.nextInt(40) + 40;
			plane = new CommercialPlane(flyingTime, takingOff); 
			
		}
		else if (planeProb < commercialProb + lightAircraftProb){
			flyingTime = gen.nextInt(10) + 10;
			plane = new LightAircraft(flyingTime, takingOff);
			
		}
		else if (planeProb < commercialProb + lightAircraftProb + gliderProb){
			
			plane = new Glider(takingOff);
		}
		
		return plane;

	}
	
	public void tick(){
		plane.tick();
		
		
	}


}