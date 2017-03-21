package ex3;

public class Scale<T extends Comparable<T>> {
    private T left;
    private T right;

    public Scale(T left, T right){
        this.left = left;
        this.right = right;
    }

    public T getHeavier(){
      if (this.right.compareTo(this.left) > 0){
          return right;
      }else if (this.right.compareTo(this.left) == 0){
          return null;
      }
      return left;
    }
}
