
import java.util.HashMap;
import java.util.Map;
public class Hotel {
    private HashMap<String, Room> rooms;
    public Hotel() {
        rooms = new HashMap<>();
    }

    public void addRoom(Room room )
    {

        rooms.put(room.getRoomNumber(),room);
        System.out.println("Room " + room.getRoomNumber() +" "
                + room.getDescription()+ "added successfully");
    }
    public Room  getRoom(String roomNumber)
    {

        return rooms.get(roomNumber);
    }
    public void bookRoom(String roomNumber, Service service)
    {
       Room  room = rooms.get(roomNumber);
        room.addService(service);
        System.out.println("Service " + service.getName() +  " added to "+room.getDescription()+"- Rome "+ room.getRoomNumber());

    }
    public void displayBookingDetails(String roomNumber)
    {
        Room room = rooms.get(roomNumber);
        System.out.println("Reservation Details as follows : ");
        System.out.println("Room Type : " + room.getDescription());
        System.out.println("Total Cost :  " +room.getTotalCost());
        System.out.println("Room No:  "+ room.getRoomNumber());

    }
}
