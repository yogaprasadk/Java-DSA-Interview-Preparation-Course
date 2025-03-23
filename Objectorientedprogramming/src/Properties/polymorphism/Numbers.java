package Properties.polymorphism;

public class Numbers {
   // here it automatically get resolved int to double
    double sum(int a,int b){
        return a;
    }
    int sum(int a,int b,int c){
        return a + b;
    }

    public static void main(String[] args) {
        Numbers n = new Numbers();
        //but if you pass double here it will give error
        n.sum(4,3);
        n.sum(3,6,3);
    }
}
