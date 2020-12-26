public class Consumer implements Runnable{
    private Shop shop;

    public Consumer(Shop shop){
        this.shop = shop;
        new Thread(this,"Consumer").start();
    }

    public void run() {
        for (int i = 2; i <=6 ; i++) {
            shop.get();
        }
    }
}
