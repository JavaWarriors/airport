import java.util.Random;




public class Simulator {
private Airport airport;
private PlaneGenerator planeGenerator;
private Random gen;
public Simulator(){
	double commercialProb = 0.4;
	double lightAircraftProb = 0.3;
	double gliderProb = 0.3;
	airport = new Airport();
	planeGenerator = new PlaneGenerator(gen, commercialProb, lightAircraftProb, gliderProb);
	airport.addPlane(planeGenerator);
	
	
}

public static void main(String[] args) {
	int seed = 1729;
	// Set parameters to default values
	int g = 20;
	double carProb = 0.07;
	double truckProb = 0.01;
	double busProb = 0.003;
	int numTicks = 3600;
	
	try {
		if (args.length > 0) {
			if (args[0].equals("-help")) {
				System.out.println("Usage: java TextMain <g>");
				System.exit(0);
			}
			else
				g = Integer.parseInt(args[0]);
		}
		
		Junction j = null;
		
		for (int m = 0; m < 2; m++) {
			if (m == 0) 
				j = new CrossRoads(seed, g, carProb, truckProb, busProb);
			else
				j = new TJunction(seed, g, carProb, truckProb, busProb);
			
			for (int i = 0; i < numTicks; i++) {
				j.tick();
			}
			System.out.print(j.report());
		}
		
	}
	catch (Exception e) {
		System.err.println("Something has gone wrong.");
		System.err.println(e);
	}
}
}
