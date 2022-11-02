package week3.homework1;

public class Main {
    public static void main(String[] args) {
        int sayi = 10;
        int sayi1 = 20;
        sayi = sayi1;
        sayi1 = 100;

        System.out.println(sayi);

        int[] sayilar = {1,2,3};
        int[] sayilar1 = {10,20,30};
        sayilar = sayilar1;
        sayilar1[0] =1000;

        System.out.println(sayilar[0]);

        CreditManager creditManager = new CreditManager();

        Person customer = new Person();//instance creation
        customer.id = 1;
        customer.firstName = "Rana";
        customer.lastName = "Yılmaz";

        CustomerManager customerManager = new CustomerManager(customer);
        customerManager.save();
    }
}

class CreditManager{
    public void calculate(){
        System.out.println("Hesaplandı.");
    }

    public void save(){
        System.out.println("Kredi verildi.");
    }


}

class Customer {
     int id;
     /*String firstName;
     String lastName;
     String nationalIdentity;*/
     String city;
}

class CustomerManager {

    private Customer customer;
    public CustomerManager(Customer customer){
        this.customer = customer;
    }

    public void save() {
        System.out.println("Müşteri kaydedildi: ");
    }

    public void delete(){
        System.out.println("");
    }
}

class Person extends Customer{
    String firstName;
    String lastName;
    String nationalIdentity;

}

class Company extends Customer{
    String companyName;
    String taxNumber;
}
