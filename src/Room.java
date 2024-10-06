import java.util.ArrayList;

public abstract class Room
{
    String roomNumber ;
    String Type ;
    double baseRate ;
    ArrayList<Service> Services = new ArrayList<>();;


    public Room(String roomNumber, double baseRate)
    {
        this.roomNumber = roomNumber;
        this.baseRate = baseRate;
    }

    public void addService(Service service){
        Services.add(service);
    }
    public double getTotalCost(){
        double totalCost = baseRate  ;
        for (Service  service : Services){
            totalCost += service.getCost();

        }
        return totalCost ;
    }
    public abstract String getDescription() ;

    public String getRoomNumber(){
        return roomNumber ;

    }
}