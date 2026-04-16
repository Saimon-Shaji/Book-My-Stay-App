import java.util.*;

class Reservation {
    private String guestName;
    private String roomType;

    public Reservation(String guestName, String roomType) {
        this.guestName = guestName;
        this.roomType = roomType;
    }

    public String getGuestName() {
        return guestName;
    }

    public String getRoomType() {
        return roomType;
    }
}

class BookingQueue {
    private Queue<Reservation> queue = new LinkedList<>();

    public void addRequest(Reservation reservation) {
        queue.offer(reservation);
        System.out.println("Booking request added for " + reservation.getGuestName());
    }

    public void displayQueue() {
        System.out.println("\nCurrent Booking Queue:\n");
        for (Reservation r : queue) {
            System.out.println("Guest: " + r.getGuestName() + " | Room Type: " + r.getRoomType());
        }
    }
}

public class UseCase5BookingRequestQueue {

    public static void main(String[] args) {

        BookingQueue bookingQueue = new BookingQueue();

        bookingQueue.addRequest(new Reservation("Alice", "Deluxe"));
        bookingQueue.addRequest(new Reservation("Bob", "Suite"));
        bookingQueue.addRequest(new Reservation("Charlie", "Standard"));

        bookingQueue.displayQueue();
    }
}