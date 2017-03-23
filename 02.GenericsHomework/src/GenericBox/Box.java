package GenericBox;

import java.util.List;

public class Box<T extends Comparable<T>> {
    private T data;
    public Box(T data){
        this.data = data;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static <T extends Comparable<T>> int greaterThanCount(List<T> list, T element){
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).compareTo(element) > 0){
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString() {
        return this.data.getClass().getName() + ": " + this.data;
    }
}
