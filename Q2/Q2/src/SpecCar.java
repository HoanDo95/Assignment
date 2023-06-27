

/**
 *
 * @author HOAN DO
 */
public class SpecCar extends Car{
    private int type;
   
    public SpecCar(){
        super();
        type = 0;
    }

    public SpecCar(String maker, int price, int type) {
        super(maker,price);
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString()+ "," + type ;
    }
    
    public void setData(){
        setMaker("XZ" + getMaker());
        setPrice(20 + getPrice());
    }
    
    public int getValue(){
        int inc;
        if(type<7){
            inc = 10;
        }
        else 
            inc = 15;
        return (int) (getPrice() + inc);
    }
    
}
