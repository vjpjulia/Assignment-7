public class HotelApp {
    public static void main(String[] args) {
        FrontDesk frontDesk = new FrontDesk();

        frontDesk.useValetService("TAE254");
        frontDesk.useHouseKeepingService(187);
        frontDesk.useCartService(3);
    }
}