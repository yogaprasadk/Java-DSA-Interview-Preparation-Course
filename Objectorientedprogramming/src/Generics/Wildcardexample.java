package Generics;

import java.util.Arrays;
import java.util.List;

//here T should be either NUmber or its custom classes.
public class Wildcardexample<T extends Number> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    // this is wildcard example.
    public void getList(List<? extends Number> list){
        // when you pass List<Integer> list -  you can pass only Number type
        // when you pass List<? extends Number> List - you can pass integer or float.
    }

    public Wildcardexample() {
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
        Wildcardexample<Number> list = new Wildcardexample<>();
        list.add(44);
        list.add(345);
        System.out.println(list);
        System.out.println(list.getindex(1));
    }

    public static interface Genericinterface<T>{

    }
}
