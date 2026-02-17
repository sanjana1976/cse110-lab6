package edu.ucsd.maprouter;

public class MapRouter {    
    /**
     * Calculates travel time between two points.
     */
    public double calculateTravelTime(String start, String end) {
        GoogleMapsClient client = new GoogleMapsClient();
        
        double time = client.getMinutesEstimate(start, end);

        System.out.println("Route found: " + time + " minutes.");
        return time;
    }
}