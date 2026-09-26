public class Emplyoee {

    String name;
    int id;

    public Emplyoee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void sellPhone(Coustomer cm, Smartphone smartphone) {

        if (cm.cash >= smartphone.price) {
            System.out.println("Phone sold to customer: " + cm.name);
            System.out.println("Phone: " + smartphone);
        } else {
            emi(smartphone);
        }
    }

    public void emi(Smartphone smartphone) {

        double emi = smartphone.price / 12;

        System.out.println("Your monthly EMI is: " + emi);
    }
}