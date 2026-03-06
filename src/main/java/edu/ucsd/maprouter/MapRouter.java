package edu.ucsd.maprouter;

public class MapRouter {

    private IMapsClient mapsClient;

    public MapRouter(IMapsClient mapsClient) {
        this.mapsClient = mapsClient;
    }

    /**
     * Calculates travel time between two points.
     */
    public double calculateTravelTime(String start, String end) {

        double time = mapsClient.getMinutesEstimate(start, end);

        System.out.println("Route found: " + time + " minutes.");

        return time;
    }
}