package Accesscontrol;

public class Object {
    //the object class contains methods like
    /*
    object
    hashcode
    equals
    tostring
    finalize
     */
    //it is present inside java.lang.object package.
    //with in the package it is inside the override methods.
    //because it is topmost class in inheritance.
    int num;
    float gpa;
    public Object(int num) {
        this.num = num;
    }

    public Object(float gpa, int num) {
        this.gpa = gpa;
        this.num = num;
    }

    public Object() {
        super();
    }

//    @Override
//    public boolean equals(java.lang.Object obj) {
//        return super.equals(obj);
//    }


    public boolean equals(Object obj) {
        return this.num == ((Object)obj).num;
    }

    @Override
    // hashcode basically means unique representation number of an object.
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    protected java.lang.Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

//    @Override
//    protected void finalize() throws Throwable {
//        super.finalize();
//    }

    public static void main(String[] args) {
        //hashcode example
        Object n = new Object(34);
        System.out.println(n.hashCode());

        //equals example.
        Object obj = new Object(34.5f,3);
        Object ob1 = new Object(43.6f,1);

        if(obj == ob1){
            System.out.println("Less than");
        }
        if(obj.equals(ob1)){
            System.out.println("Les Than");
        }

        // getclass - it is used to get the particular class of the represent object.
        System.out.println(ob1.getClass());
    }
}
