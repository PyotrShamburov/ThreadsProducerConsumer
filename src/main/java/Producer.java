public class Producer implements Runnable{
    private Shop shop;

    public Producer(Shop shop){
        this.shop = shop;
        new Thread(this,"Producer").start();

    }

    public void run() {
        for (int i = 0; i <=6 ; i++) {
            shop.put();
        }
    }
}
