public class StandardRoom extends Room {
    public  StandardRoom(String roomNumber, double baseRate) {
    super(roomNumber, baseRate);
    }
    public String getDescription()
    {
        return "Standard room " ;
    }
}

