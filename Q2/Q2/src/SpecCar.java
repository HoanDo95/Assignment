

/**
 *
 * @author HOAN DO
 */
public class SpecCar extends Car{
    private int type;
   
    public SpecCar(){
        type = 0;
    }

    public SpecCar(String maker, int price, int type) {
        super(maker,price);
        this.type = type;
    }

    @Override
    public String toString() {
        return type + maker + price ;
    }
    
    public void setData(){
        maker = "XZ" + maker;
        price += 20;
    }
    
    public int getValue(){
        int inc;
        if(type<7){
            inc = 10;
        }
        else 
            inc = 15;
        return (int) (price + inc);
    }
    
}
