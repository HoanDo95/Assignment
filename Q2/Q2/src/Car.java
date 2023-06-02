

/**
 *
 * @author HOAN DO
 */
public class Car {
   protected String maker;
   protected int price;

   public Car(){
       maker = "";
       price = 0;
   }
   
    public Car(String maker, int price) {
        this.maker = maker;
        this.price = price;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public int getPrice() {
        return price;
    }

   

    @Override
    public String toString() {
        return maker + price ;
    }
   
   
}
