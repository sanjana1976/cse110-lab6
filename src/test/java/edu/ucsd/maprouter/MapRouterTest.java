package edu.ucsd.maprouter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class MapRouterTest {
    /**
     * Test for calculateTravelTime method in MapRouter class.
     */
    @Test
    void testCalculateTravelTime() {

        // ADDED COMMENT:
        // Create a mock maps client that will always return 12.5.
        // This makes the test predictable and avoids using the random real client.
        MockMapsClient mock = new MockMapsClient(12.5);

        // ADDED COMMENT:
        // Pass the mock into the MapRouter constructor.
        // This is dependency injection: MapRouter is given a client instead of creating one itself.
        MapRouter router = new MapRouter(mock);

        double result = router.calculateTravelTime("UCSD", "Airport");

        assertEquals(12.5, result, "The travel time should be 12.5");
    }

    /**
     * Test for calculateTravelTime method in MapRouter class with different travel
     * times.
     */
    @Test
    void testDifferentTravelTime() {

        // ADDED COMMENT:
        // Start by creating a mock that returns 12.5.
        MockMapsClient mock = new MockMapsClient(12.5);

        // ADDED COMMENT:
        // Inject the mock into MapRouter so the router uses the fake client.
        MapRouter router = new MapRouter(mock);

        double result = router.calculateTravelTime("UCSD", "Airport");

        assertEquals(12.5, result, "The travel time should be 12.5");

        // ADDED COMMENT:
        // Change the mock's return value without creating a new mock object.
        // This is why we added a setter in MockMapsClient.
        mock.setFixedTime(20);

        result = router.calculateTravelTime("UCSD", "Airport");

        assertEquals(20, result, "The travel time should be 20");
    }
}