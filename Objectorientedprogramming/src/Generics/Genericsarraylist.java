package Generics;

import java.util.Arrays;
import java.util.List;

public class Genericsarraylist<T> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;


    public Genericsarraylist() {
        data = new Object[DEFAULT_SIZE];
    }

    public void add(T num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

        // copy the items in new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }

        data =  temp;
    }

    public T remove(){
        T removed = (T)(data[--size]);
        return removed;
    }

    public T getindex(int index){
        return (T)data[index];
    }

    public int size(){
        return size;
    }

    public void setindex(int index, T value){
        data[index] = value;
    }

    private boolean isFull() {
        return size == data.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(data) + " "+ size;
    }

    public static void main(String[] args) {
        Genericsarraylist<Integer> list = new Genericsarraylist();
        for (int i = 0; i < 14; i++) {
                list.add(i);
        }
        System.out.println(list);
    }
}
