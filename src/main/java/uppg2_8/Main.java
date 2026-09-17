package uppg2_8;

public class Main {
    static void main() {

        Office office = new Office();
        /*
        Room room1 = new Room("Kontorsrum", 1);
        Room room2 = new Room("Gruppkontorsrum", 5);
        Room room3 = new Room("Konferensrum", 100);
        Room room4 = new Room("Stora konferensrummet", 350);

        office.addRoomToList(room1);
        office.addRoomToList(room2);
        office.addRoomToList(room3);
        office.addRoomToList(room4);
        */

        office.addRoomToList(new Room("Kontorsrum", 1));
        office.addRoomToList(new Room("Gruppkontorsrum", 5));
        office.addRoomToList(new Room("Konferensrum", 100));
        office.addRoomToList(new Room("Stora konferensrummet", 350));

        Room room = office.findAvailableRoom(35);
        IO.println("Available Room: " + room.getRoomName());
        if (room.book())
            IO.println("Booking successful!");
        else
            IO.println("Booking failed!");



        IO.println("Booked rooms: ");



        IO.println("Available rooms: ");



        //System.out.println(Office.getRoomCount());

        //System.out.println(office.roomsList.get(0).getRoomName());

        //System.out.println(office.findAvailableRoom(3).getRoomName());




    }
}
