public class Shop {
    private int amountOfProduct = 0;

    public synchronized int get(){
        while (amountOfProduct < 1){
            try{
                wait();
            }catch (InterruptedException exception){
                System.out.println(exception.toString());
            }
        }
        System.out.println("Consumer got product!");
        amountOfProduct--;
        System.out.println("Amount of products on warehouse: "+amountOfProduct);
        notify();
        return amountOfProduct;
    }

    public synchronized void put(){
        while (amountOfProduct > 2){
            try{
                wait();
            }catch (InterruptedException exception){
                System.out.println(exception.toString());
            }
        }
        System.out.println("Producer put product!");
        amountOfProduct++;
        System.out.println("Amount of products on warehouse: "+amountOfProduct);
        notify();
    }

}
