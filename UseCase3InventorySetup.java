import java.util.HashMap;

class RoomInventory {

    private HashMap<String, Integer> inventory;

    RoomInventory() {
        inventory = new HashMap<>();
        inventory.put("Single Room", 5);
        inventory.put("Double Room", 3);
        inventory.put("Suite Room", 2);
    }

    public int getAvailability(String roomType) {
        return inventory.getOrDefault(roomType, 0);
    }

    public void updateAvailability(String roomType, int count) {
        inventory.put(roomType, count);
    }

    public void displayInventory() {
        for (String room : inventory.keySet()) {
            System.out.println(room + " Available: " + inventory.get(room));
        }
    }
}

public class UseCase3InventorySetup {
    public static void main(String[] args) {

        RoomInventory inventory = new RoomInventory();

        System.out.println("Welcome to Book My Stay v3.0");

        inventory.displayInventory();

        System.out.println();

        inventory.updateAvailability("Single Room", 4);

        System.out.println("After Update:");
        inventory.displayInventory();
    }
}