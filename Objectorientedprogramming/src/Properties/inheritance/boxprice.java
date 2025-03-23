package Properties.inheritance;

// multilevel inheritance example
public class boxprice extends boxweight{
    double price;

    public boxprice() {
        super();
        this.price = -1;
    }

    boxprice(boxprice other){
        super(other);
        this.price = other.price;
    }

    public boxprice(double a, double b, double c, double d, double price) {
        super(a, b, c, d);
        this.price = price;
    }

    public boxprice(double side, double weight,double price) {
        super(side,weight);
        this.price = price;
    }
}
