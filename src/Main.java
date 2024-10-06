public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        hotel.addRoom(new StandardRoom("101", 200));   // Create Standard Room
        hotel.addRoom(new DeluxeRoom("102", 300));     // Create Deluxe Room
        hotel.addRoom(new SuiteRoom("103", 500));      // Create Suite Room

        hotel.bookRoom("101", new SpaService());       // Add Spa service to Standard Room
        hotel.bookRoom("102", new DiningService());    // Add Dining service to Deluxe Room
        hotel.bookRoom("103", new GymService());

        hotel.displayBookingDetails("101");
        hotel.displayBookingDetails("102");
        hotel.displayBookingDetails("103");

    }
}