package uppg2_8;

public class Room {

    private final String roomName;
    private final int capacity;
    private boolean isBooked;

    public Room(String roomName, int capacity) {
        this.roomName = roomName;
        this.capacity = capacity;
        this.isBooked = false;
    }


    public String getRoomName() {
        return roomName;
    }
    public int getCapacity() {
        return capacity;
    }
    public boolean isBooked() {
        return isBooked;
    }

    public boolean book() {
        if (this.isBooked) {
            return false; // Det gick inte att boka, rummet var redan upptaget!
        }

        this.isBooked = true;
        return true; // Bokningen lyckades!
    }

    public void cancelBooking(Room room) {
        if (!room.isBooked()) {
            System.out.println("Room is not booked");
        }
        this.isBooked = false;
    }

}
