import controller.CustomerController;
import controller.impl.CustomerControllerImpl;
import model.Customer;

public class Main {
    public static void main(String[] args) {
// repository database ile bağlantılı katman
        // servis katmanı : iş yükünün tutulduğu katmandır / gercek kodlamanın yapıldığı katmandır.
        // controler katmanı : son katmandır herşey doğruysa kodları çalıştırır.
        // model katmanı : Database deki tabloların ve kolonların oluşturulduğu katmandır.


        CustomerController controller = new CustomerControllerImpl();
        controller.create(new Customer(6,"Furkan","furkan@gmail.com"));
        controller.create(new Customer(7,"Batuhan","Batuhan@gmail.com"));
        controller.create(new Customer(8,"Metehan","Metehan@gmail.com"));
        System.out.println("id si 6 olan müşteri:  " + controller.ByCustomerId(6));

        for(Customer customer : controller.findAll()){
            System.out.println("Tüm müşteriler :  " + customer);
        }
            controller.update(new Customer(6,"Esma","esma@gmail.com"));
            controller.delete(6);
        for(Customer customer : controller.findAll()){
            System.out.println("Güncel Müşteriler :  " + customer);
        }

        }

    }
