public class Smartphone {


    String mobileName;
    double price;
String phoneColour;
    public Smartphone(String mobileName, double price , String phoneColour) {
        this.mobileName = mobileName;
        this.price = price;
        this.phoneColour = phoneColour;
    }


    public String toString() {
        return this.mobileName + " " + this.price + " " + this.phoneColour;
    }
}