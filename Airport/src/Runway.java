public class Runway{
    private int takeoffCount;
    private int landingCount;
    private Boolean empty;
    private Plane plane;

    public Runway(){
        takeoffCount=0;
        landingCount=0;
        empty=true;
        plane = null;
    }

    public void addToRunway(Plane plane){
        //add plane to runway
        if(empty){
          this.plane = plane;
           empty = false;
        }

    }

public void incrementLand(){
landingCount++;
}

public void incrementTakeoff(){
takeoffCount++;
}
    public void releasePlane(){
        //remove plane to runway
        if(!empty){
        	if(plane.isTakingOff()){
            takeoffCount++;
            
        	}else{
        		landingCount++;
        	}
        	plane = null;
        	empty=true;
        }
        

        //isFree=true;
    }

    public boolean isRunwayFree(){
        return empty;
    }


    public int getTakeoffCount(){
        return takeoffCount;
    }

    public int getLandingCount(){
        return landingCount;
    }


}