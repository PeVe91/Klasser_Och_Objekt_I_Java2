package uppg2_8;

import java.util.ArrayList;

public class Office {

    ArrayList<Room> officeRoomsList = new ArrayList<>();
    private static int roomCount;

    static int getRoomCount() {
        return roomCount;
    }

    public Room getRoom(int roomNumber) {
        return officeRoomsList.get(roomNumber);
    }

    public ArrayList<Room> getBookedRooms() {
        var bookedRooms = new ArrayList<Room>();
        for (Room room : officeRoomsList) {
            if (room.isBooked()) {
                bookedRooms.add(room);
            }
        }
        return bookedRooms;
    }

    public ArrayList<Room> getAvailableRooms() {
        var availableRooms = new ArrayList<Room>();
        for (Room room : officeRoomsList) {
            if (!room.isBooked()) {
                availableRooms.add(room);
            }
        }
        return availableRooms;
    }

    public void addRoomToList(Room room) {
        officeRoomsList.add(room);
        roomCount++;
    }
    public Room findAvailableRoom(int minCapacity) {
        for (Room room : officeRoomsList) {
            if (!room.isBooked() && room.getCapacity() >= minCapacity) {
                return room;
            }
        }
        return null;
    }


}
