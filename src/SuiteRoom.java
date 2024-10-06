public class SuiteRoom extends Room
{
    public SuiteRoom(String roomNumber, double baseRate) {
        super(roomNumber, baseRate);
    }

    public String getDescription()
    {
        return "Suite room " ;
    }
}