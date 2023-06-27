
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class MyCar implements ICar {

    private List<Car> t;

    public MyCar() {
    }

    public MyCar(List<Car> t) {

        this.t = t;
    }

    @Override
    public int f1(List<Car> t) {
        int totalRate = 0;
        for (Car car : t) {
            totalRate += (double) car.getRate();
        }
        double averageRate = totalRate / t.size();
        return (int) averageRate;
    }

    @Override
    public void f2(List<Car> t) {
        if (t.isEmpty()) {
            return;
        }

        Car maxRateCar = Collections.max(t, Comparator.comparingInt(Car::getRate));
        Car minRateCar = Collections.min(t, Comparator.comparingInt(Car::getRate));
    
    int maxIndex = t.indexOf(maxRateCar);
    int minIndex = t.indexOf(minRateCar);
    
    Collections.swap(t, maxIndex, minIndex);
    }

    @Override
    public void f3(List<Car> t) {
        Collections.sort(t, Comparator.comparing(Car::getMaker).thenComparing(Comparator.comparingInt(Car::getRate).reversed()));
    }
}
