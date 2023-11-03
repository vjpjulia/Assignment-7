public class Cart implements HotelService {
    private int numberOfCarts;

    public Cart(int numberOfCarts) {
        this.numberOfCarts = numberOfCarts;
    }

    @Override
    public void execute() {
        requestCart(numberOfCarts);
    }

    private void requestCart(int numberOfCarts) {
        System.out.println("Guest requested " + numberOfCarts + " luggage cart(s).");
    }
}