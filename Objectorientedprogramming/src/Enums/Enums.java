package Enums;
//enum is present in java.lang package.
public class Enums {


    //    Enums is a group of variables that can not be changed.
    //        TO use enums we need to declare Enum Keyword.
    enum Week implements A {
        // these are enum constant.
        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;
        // By default, it is - Static,public and final.
        // Since it is final you cant able to create child enums.
        // Type is week

        // constructor
        Week(){
            System.out.println("THe COnstructor"+this);
        }

        @Override
        public void hello() {
            System.out.println("Hello World");
        }
    }
    // first the constructor will be printed then the class Week will be printed.

    // enum is not public or protected,this is private or default.
//    why? beacuse if we declare public or protected it allow to create more than one object.
    //enums in internally like: public static final week Monday = new Week();

    public static void main(String[] args) {
        Week week = Week.Monday;
        for (Week day: Week.values()){
            System.out.print(day +" ");
        }
        System.out.println(week);

        // To check position
        System.out.println(week.ordinal());

        week.hello();
    }
}