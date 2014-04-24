import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.*;

public class Airport {

	private Queue<Plane> takeoff;
	private Queue<Plane> landing;
	private Queue<Plane> breakdown;
	private Runway runway;
	private int step;
	private Random gen;
	private static final double BREAKDOWN_PROB = 0.0001;
	private int totalWaitingTime = 0;
	private int totalBreakdown = 0;

	public Airport() {
		takeoff = new LinkedList<Plane>();
		landing = new LinkedList<Plane>();
		breakdown = new LinkedList<Plane>();
		runway = new Runway();

	}

	public void addPlane(PlaneGenerator generate) {
		Plane plane = generate.generatePlane();
		if (plane.isTakingOff()) {
			takeoff.add(plane);
		} else if (!plane.isTakingOff()) {
			landing.add(plane);
		}

	}

	public void planeBreakdown() {
		double breakdownProb = gen.nextDouble();
		if (breakdownProb < BREAKDOWN_PROB) {
			if (!takeoff.isEmpty()) {

				Plane plane = takeoff.remove();
				breakdown.add(plane);
				totalBreakdown++;
			}

		}

	}

	public void addToRunway(Plane plane) {
		if (runway.isRunwayFree()) {
			runway.addToRunway(plane);

		}

	}

	public void tick() {
		for (Iterator<Plane> p = takeoff.iterator(); p.hasNext();) {
			Plane plane = p.next();
			plane.tick();
		}
		for (Iterator<Plane> p = landing.iterator(); p.hasNext();) {
			Plane plane = p.next();
			plane.tick();
		}
		for (Iterator<Plane> p = breakdown.iterator(); p.hasNext();) {
			Plane plane = p.next();
			plane.tick();
			if (plane.getWaitingTime() <= 120) {
				Plane bPlane = breakdown.remove();
				if (bPlane.isTakingOff()) {
					takeoff.add(bPlane);
				} else {
					landing.add(bPlane);
				}

			}

		}

	}

	public int getWaitingTime() {
		return totalWaitingTime;

	}

	public int getBreakdown() {

		return totalBreakdown;

	}

}
