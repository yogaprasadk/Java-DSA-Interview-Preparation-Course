import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    private int[] num;
    private int size = 0;
    private int DEFAULT_SIZE = 10;

    public Main(){
        this.num = new int[DEFAULT_SIZE];
    }

    public void add(int n){
          if (isFull()){
              resize();
          }
          num[size++] = n;
    }

    private boolean isFull() {
        return num.length == size;
    }

    private void resize() {
        int[] temp = new int[num.length * 2];
        for (int i = 0; i < num.length; i++) {
            temp[i] = num[i];
        }
        num = temp;
    }

    private int get(int index){
        return num[index];
    }

    private void set(int n,int index){
        num[index] = n;
    }

    private int size(){
        return size;
    }

    private int remove(){
        int removed = num[--size];
        return removed;
    }

    @Override
    public String toString() {
        return "Main{" +
                "num=" + Arrays.toString(num) +
                ", size=" + size +
                ", DEFAULT_SIZE=" + DEFAULT_SIZE +
                '}';
    }

    public static void main(String[] args) {
        Main list = new Main();
        list.add(4);
        list.add(2);
        System.out.println(list.remove());
        System.out.println(list);
    }
}
