public class HouseKeeping implements HotelService {
    private int roomNumber;

    public HouseKeeping(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public void execute() {
        cleanRoom(roomNumber);
    }

    private void cleanRoom(int roomNumber) {
        System.out.println("Housekeeping is cleaning room number: " + roomNumber);
    }
}