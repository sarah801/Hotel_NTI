public class SuiteRoom extends Room
{
    //suite
    public SuiteRoom(String roomNumber, double baseRate) {
        super(roomNumber, baseRate);
    }

    public String getDescription()
    {
        return "Suite room " ;
    }
}