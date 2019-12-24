package transport;

import java.util.Comparator;

public class SortByFuel implements Comparator<Car> {


    @Override
    public int compare(Car o1, Car o2) {
        if (o1.getFuelFlow() < o2.getFuelFlow()){
            return 1;
        }
        if (o1.getFuelFlow() > o2.getFuelFlow()) {
            return -1;
        }

        return 0;
    }
}
