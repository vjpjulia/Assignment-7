public class FrontDesk {
    public void useValetService(String plateNumber) {
        HotelService valet = new Valet(plateNumber);
        valet.execute();
    }

    public void useHouseKeepingService(int roomNumber) {
        HotelService houseKeeping = new HouseKeeping(roomNumber);
        houseKeeping.execute();
    }

    public void useCartService(int numberOfCarts) {
        HotelService cart = new Cart(numberOfCarts);
        cart.execute();
    }
}