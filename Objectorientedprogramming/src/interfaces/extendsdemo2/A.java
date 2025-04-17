package interfaces.extendsdemo2;

public interface A {
//     static interface methods cannot be overridden.so the static methods should have body.
     // you cant have like this -> static void fun();
     static void funp(){
          System.out.println("Fun Panna Poram");
     }
      default void fun(){
           System.out.println("I am in default");
      }
}
