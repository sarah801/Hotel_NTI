public class DeluxeRoom extends Room
{
    //Deluxe
    public DeluxeRoom(String roomNumber, double baseRate) {
        super(roomNumber, baseRate);
    }
    public String getDescription()
    {
        return "Deluxe room " ;
    }
}
