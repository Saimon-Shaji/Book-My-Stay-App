import java.util.*;

class Room {
    private String type;
    private double price;
    private List<String> amenities;

    public Room(String type, double price, List<String> amenities) {
        this.type = type;
        this.price = price;
        this.amenities = amenities;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public List<String> getAmenities() {
        return amenities;
    }
}

class Inventory {
    private Map<String, Integer> availability = new HashMap<>();

    public void addRoom(String type, int count) {
        availability.put(type, count);
    }

    public int getAvailability(String type) {
        return availability.getOrDefault(type, 0);
    }

    public Set<String> getAllRoomTypes() {
        return availability.keySet();
    }
}

class SearchService {

    public static void searchRooms(Inventory inventory, Map<String, Room> roomMap) {

        System.out.println("\nAvailable Rooms:\n");

        for (String type : inventory.getAllRoomTypes()) {

            int available = inventory.getAvailability(type);

            if (available > 0) {
                Room room = roomMap.get(type);

                System.out.println("Room Type: " + room.getType());
                System.out.println("Price: ₹" + room.getPrice());
                System.out.println("Amenities: " + room.getAmenities());
                System.out.println("Available Rooms: " + available);
                System.out.println("-----------------------------");
            }
        }
    }
}

public class UseCase4RoomSearch {

    public static void main(String[] args) {

        Room deluxe = new Room("Deluxe", 3000, Arrays.asList("WiFi", "AC", "TV"));
        Room suite = new Room("Suite", 5000, Arrays.asList("WiFi", "AC", "TV", "Mini Bar"));
        Room standard = new Room("Standard", 2000, Arrays.asList("WiFi", "Fan"));

        Map<String, Room> roomMap = new HashMap<>();
        roomMap.put("Deluxe", deluxe);
        roomMap.put("Suite", suite);
        roomMap.put("Standard", standard);

        Inventory inventory = new Inventory();
        inventory.addRoom("Deluxe", 3);
        inventory.addRoom("Suite", 0);
        inventory.addRoom("Standard", 5);

        SearchService.searchRooms(inventory, roomMap);
    }
}
