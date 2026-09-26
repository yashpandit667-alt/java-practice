public class PhoneDealershipProject {

    static void main(String[] args) {

        Smartphone smartphone1 = new Smartphone("Z fold 6", 189000.16, " Red");
        Smartphone smartphone2 = new Smartphone("IP 16", 173500.44, "Silver");
        Smartphone smartphone3 = new Smartphone("Redmi", 18000, " blue");
        Smartphone smartphone4 = new Smartphone("Vivo", 48900.16, " Red");
        Smartphone smartphone5 = new Smartphone("Oppo", 559000.16, " black");

        Emplyoee emplyoee1 = new Emplyoee("Yash", 1);
        Emplyoee emplyoee2 = new Emplyoee("Raja", 2);
        Emplyoee emplyoee3 = new Emplyoee("Akif", 3);

        Coustomer coustomer1 = new Coustomer("Anil", 245600);
        Coustomer coustomer2 = new Coustomer("Sunil", 55000);
        Coustomer coustomer3 = new Coustomer("Ankit", 2000);

        coustomer1.buyphone(smartphone1);
        emplyoee1.sellPhone(coustomer1, smartphone1);
        coustomer2.buyphone(smartphone2);
        emplyoee2.sellPhone(coustomer2, smartphone2);
        coustomer3.buyphone(smartphone3);
        emplyoee3.sellPhone(coustomer3, smartphone3);

    }
}
