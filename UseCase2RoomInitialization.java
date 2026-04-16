abstract class RoomUC2 {
    String type;
    int beds;
    double price;

    RoomUC2(String type, int beds, double price) {
        this.type = type;
        this.beds = beds;
        this.price = price;
    }

    void display() {
        System.out.println("Room Type: " + type);
        System.out.println("Beds: " + beds);
        System.out.println("Price: " + price);
    }
}

class SingleRoom extends RoomUC2 {
    SingleRoom() {
        super("Single Room", 1, 1000);
    }
}

class DoubleRoom extends RoomUC2 {
    DoubleRoom() {
        super("Double Room", 2, 2000);
    }
}

class SuiteRoom extends RoomUC2 {
    SuiteRoom() {
        super("Suite Room", 3, 5000);
    }
}

public class UseCase2RoomInitialization {
    public static void main(String[] args) {

        RoomUC2 r1 = new SingleRoom();
        RoomUC2 r2 = new DoubleRoom();
        RoomUC2 r3 = new SuiteRoom();

        int singleAvailable = 5;
        int doubleAvailable = 3;
        int suiteAvailable = 2;

        System.out.println("Welcome to Book My Stay v2.0");

        r1.display();
        System.out.println("Available: " + singleAvailable);
        System.out.println();

        r2.display();
        System.out.println("Available: " + doubleAvailable);
        System.out.println();

        r3.display();
        System.out.println("Available: " + suiteAvailable);
    }
}