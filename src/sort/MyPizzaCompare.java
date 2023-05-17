package sort;

import java.util.Comparator;

public class MyPizzaCompare implements Comparator<Pizza> {
    @Override
    public int compare(Pizza o1, Pizza o2) {
        if (o1.getSlices()<o2.getSlices())
            return 1;
        if (o1.getSlices()>o2.getSlices())
            return -1;
        else
        return 0;
    }
}
