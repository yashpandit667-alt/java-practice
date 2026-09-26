public class Coustomer {

    String name;
    int cash;

    public Coustomer(String name, int cash) {
        this.name = name;
        this.cash = cash;
    }
    @Override
    public String toString() {
        return this.name + " " + this.cash;
    }

    public  void buyphone(Smartphone smartphone1){
        System.out.println("The coustomer is buyphone: " + smartphone1);
    }

}
