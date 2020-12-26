public class ShopRunner {
    public static void main(String[] args) {
        Shop myShop = new Shop();
        new Producer(myShop);
        new Consumer(myShop);

    }
}
