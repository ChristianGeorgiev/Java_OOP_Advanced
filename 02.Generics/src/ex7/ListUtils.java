package ex7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListUtils {

    public static<T extends Comparable<T>> T getMin(List<T> list){
        if (list.isEmpty()){
            throw new IllegalArgumentException("List must not be empty!");
        }
        T min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (min.compareTo(list.get(i)) > 0){
                min = list.get(i);
            }
        }
        return min;
    }


    public static<T extends Comparable<T>> T getMax(List<T> list){
        if (list.isEmpty()){
            throw new IllegalArgumentException("List must not be empty!");
        }
        T max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).compareTo(max) > 0){
                max = list.get(i);
            }
        }
        return max;
    }


    public static <T> List<Integer> getNullIndices(List<T> list){
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == null){
                indices.add(i);
            }
        }
        return indices;
    }

    public static<T extends Number> void flatten(List<T> dest, List<List<? extends Number>> source){
        for (int i = 0; i < source.size(); i++) {
            for (int j = 0; j < source.get(i).size(); j++) {
                dest.add((T) source.get(i).get(j));
            }
        }
    }

    public static <T> void addAll(List<T> dest, List<T> source){
        for (T t : source) {
            dest.add(t);
        }
    }
}
