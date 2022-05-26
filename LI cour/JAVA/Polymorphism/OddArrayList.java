package Polymorphism;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collector;

public class OddArrayList extends ArrayList {
    private int index;

    @Override
    public void add(int index, Integer element) {
        if (isOdd(element)) {
            super.add(index, element);

        }
    }

    @Override
    public boolean add(Integer element) {
        if (isOdd(element)) {
            return super.add(element);
        } else {
            return false;
        }

    }

    public static boolean isOdd(Integer element) {
        return Math.abs(element) % 2 == 1;
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        // TODO Auto-generated method stub
        return super.addAll(index, c.stream().filter(OddArrayList::isOdd).collect(Collectors.toList()));
    }

}
