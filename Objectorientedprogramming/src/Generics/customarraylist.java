package Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class customarraylist {
    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public customarraylist() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        int[] temp = new int[data.length * 2];
        // copy the items in new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data =  temp;
    }

    public int remove(){
        int removed = data[--size];
        return removed;
    }

    public int getindex(int index){
        return data[index];
    }

    public int size(){
        return size;
    }

    public void setindex(int index,int value){
        data[index] = value;
    }

    private boolean isFull() {
        return size == data.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(data) + " "+size;
    }

    public static void main(String[] args) {
//        ArrayList n = new ArrayList();
//        n.add(4);
//        n.add(0, 3);
//        n.get(1);
//        n.set(1, 3);
//        n.remove(1);
//        n.contains(3);
//        n.isEmpty();
//        System.out.println(n);
        customarraylist list = new customarraylist();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.size();
//        System.out.println(list);
        for (int i = 0; i < 14; i++) {
            list.add( 2 * i);
        }
        System.out.println(list);

        // ArrayList<Integer> --> here Integer is a generics.
        // generics help us in providing type for Arraylist.
        // generics is introduced in Java Language  to provide tighter type checks at compile time and support generic programming.

        // cannot add primitive datatypes as generics in Arraylist.
        // cannot declare static fields whose type are as type parameters.
        // cannot use Casts or Instanceof with parameterized types.
        // cannot create arrays of parameterized types.
        // cannot create catch,throw or objects of Parameterized types.
        // cannot overload a method where the formal parameter types of Each overload Erase to the same Raw type.

    }
}
