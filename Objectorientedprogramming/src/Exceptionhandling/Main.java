package Exceptionhandling;

public class Main {
    // error - something happened due to lack of resources.ex: stackoverflow.
    // exception - Prevents the program from normal flow.
    // in Java,it handles the error known as throwable classes.
    // throwable classes -  exception handling and error handling.
    // exception handling - checked and unchecked.
    // checked exception can be appeared at compile time.
    // unchecked exception can be appeared at runtime.
    // it uses three keywords  => try catch finally
    //try - specify the block try all the things.
    // catch - if there is any wrong in try then go to catch

    public static void main(String[] args) {
        //1. Arithmetic exception
        int a = 5,b = 0;
//        System.out.println(a/b);
        try {
//            throw new Exception("Just for Fun");
            String name = "Yogaprasad";
            if(name.equals("Yogaprasad")){
                throw new Myexception("Name is Yogaprasad");
            }

        }
        //declare various exception before the normal exception
        // if you declare after normal exception it will give error.

        /*
        catch(Exception e){
            System.out.println("Normal Exception");
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic exception");
        }
         */
        catch (Myexception e) {
            System.out.println(e.getMessage());
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Normal Exception");
        }
        // we need to declare one finally only.

        finally { // finally means no matter it always executes.
            System.out.println("Hi");
        }
    }

//    static int divide(int a,int b){
//        if(b == 0){
//          throw new ArithmeticException(); // output: Null
//
//        }
//        return a / b;

    static int divide(int a,int b) throws ArithmeticException{
        if(b == 0){
          throw new ArithmeticException("Please don't divide by zero");
        }
        return a / b;
    }

    // throw basically means throwing an exception
    // throws basically means to declare exceptions
}
