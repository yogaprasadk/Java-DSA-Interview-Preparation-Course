package staticexample;
/*
// if we give the test class at outside.
class Test{
    static String name;
    public Test(String name){
        this.name = name;
    }
}
 */
// give output as P


//here it is an outside class it can not be static.
public class innerclasses {
//     inner class can be static because it depends on outside class.
    static class Test{
            String name;
            public Test(String name){
                this.name = name;
            }

    @Override // this method is known as anatony method,
    public String toString() {
        return name; // K
         }
    }

    public static void main(String[] args) {
          Test a = new Test("K"); // here it is giving error because the class is in non-static method.
            Test b = new Test("P");
            System.out.println(a.name);
            System.out.println(b.name);

            // now it print hashvalues if need to print K as printing normally using reference variable use override and return it.
        System.out.println(a);//staticexample.innerclasses$Test@6acbcfc0
    }
    // give output as K and P.

}
