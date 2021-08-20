package OOPS.Encapsulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class NonNegativeArrayList extends ArrayList<Integer> {

    public NonNegativeArrayList(Integer... numbers){
        super(Arrays.stream(numbers)
                .filter(n -> n >=0)
                .collect(Collectors.toList()));
    }

    @Override
    public void add(int index, Integer element){
        if (element >= 0) {
            super.add(index,element);
        }
    }
    @Override
    public boolean add(Integer element){
        if (element >= 0) {
           return super.add(element);
        } else {
            return false;
        }
    }

}
