public class DeluxeRoom extends Room
{
    public DeluxeRoom(String roomNumber, double baseRate) {
        super(roomNumber, baseRate);
    }
    public String getDescription()
    {
        return "Deluxe room " ;
    }
}
