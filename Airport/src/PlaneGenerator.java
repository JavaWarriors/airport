import java.util.Random;


public class PlaneGenerator {
	private Random gen;

//	this variable will be a parameter because we have to change the value of this!
	private double commercialProbability;
	
	private Plane plane;

//	set the seed to keep consistent results
	public PlaneGenerator(int seed){
		gen = new Random(seed);
		plane = null;
	}
	@SuppressWarnings
	public Plane generatePlane(){
		double value = gen.nextDouble();
		if(value <= 0.002){
			//create glider
			//generate the flying time and/or fuel left
			//takeoff or landing as well
			
			
		}
		else if (value > 0.002 && value <= 0.007){
			//create light aircraft	
			
		}
		
		else if(value > 0.007 && value <= commercialProbability){
			//create commercial plane
			
		}

	}

	public void setCommercialProbability(double p){
		
	}
}