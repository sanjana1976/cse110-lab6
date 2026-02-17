package edu.ucsd.maprouter;

public class App {
    public static void main(String[] args) {
        MapRouter router = new MapRouter();

        System.out.println("--- Starting Navigation System ---");

        double time = router.calculateTravelTime("Price Center", "Geisel Library");

        System.out.println("Estimated arrival in: " + time + " minutes.");
    }
}
