package Accesscontrol;

public class A {

    // when u declare a variable as private you can be able to access in this class only.
    // if u need to access it to different class file u can use get and set method.

    // here private is declared.
    private int num;

    // if the variable is declared as public you can be able to access it anywhere.
    public int var;

    // here you didn't specify any modifier.So it is considered as default access modifier.
    // default access modifier it is also known as no modifier.
    // you can be able to access it in this package only.
    // you can't able to access it in other packages.
    String name;

    //here declared protected
    protected int naa;

    int[] arr;

    // you can able to access private using getter and setter method.

    // this method is public so you can be able to access everywhere.
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}
