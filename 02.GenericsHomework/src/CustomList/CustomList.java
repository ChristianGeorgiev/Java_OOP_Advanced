package CustomList;


import java.lang.reflect.Array;
import java.util.Arrays;

public class CustomList<T extends Comparable<T>> {
    private static final int DEFAULT_SIZE = 8;

    private T[] data;

    public CustomList(){
        this.data = initialize();
    }

    private T[] initialize(){
        T[] array = (T[]) Array.newInstance(this.data.getClass(), DEFAULT_SIZE);
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
        }
        return array;
    }

    private void increaseSize(){
        T[] newArr = (T[]) new Object[this.data.length * 2];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = null;
        }
        for (int i = 0; i < this.data.length; i++) {
            newArr[i] = this.data[i];
        }

        this.data = newArr;
    }

    public void add(T element){
        for (int i = 0; i < this.data.length; i++) {
            if (this.data[i] == null){
                this.data[i] = element;
                return;
            }
        }
        increaseSize();
        add(element);
    }

    public T remove(int index){
        T element = this.data[index];
        T[] newArr = (T[]) new Object[this.data.length - 1];
        for (int i = 0; i < index; i++) {
            newArr[i] = this.data[i];
        }

        for (int i = index+1; i < this.data.length; i++) {
            newArr[i - 1] = this.data[i];
        }

        this.data = newArr;
        return element;
    }

    public boolean contains(T element){
        for (int i = 0; i < this.data.length; i++) {
            if (this.data[i] == element){
                return true;
            }
        }
        return false;
    }

    public void swap(int index, int index2){
        T temp = this.data[index];
        this.data[index] = this.data[index2];
        this.data[index2] = temp;
    }

    public int countGreaterThan(T element){
        int count = 0;
        for (int i = 0; i < this.data.length; i++) {
            if (this.data[i].compareTo(element) > 0){
                count++;
            }
        }
        return count;
    }

    public T getMax(){
        T max = this.data[0];
        for (int i = 1; i < this.data.length; i++) {
            if (this.data[i].compareTo(max) > 0){
                max = this.data[i];
            }
        }
        return max;
    }

    public T getMin(){
        T min = this.data[0];
        for (int i = 1; i < this.data.length; i++) {
            if (this.data[i].compareTo(min) < 0){
                min = this.data[i];
            }
        }
        return min;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.data.length; i++) {
            if (this.data[i] != null){
                sb.append(this.data[i]).append(System.lineSeparator());
            }
        }
        return sb.toString();
    }
}
