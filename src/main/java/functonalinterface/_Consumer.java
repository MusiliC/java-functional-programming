package functonalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

    //consumer - is like void - takes one argument and returns nothing!!
    public static void main(String[] args) {
        Customer musili = new Customer("Musili", "+254768676");
        greetCustomer(musili);

        greetCustomerConsumer.accept(musili);
        greetCustomerBiConsumer.accept(musili, false);

    }

    //imperative programming
    static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.customerName + " thanks for registering number " + customer.customerNumber);
    }

    //functional
    static Consumer<Customer> greetCustomerConsumer = customer ->  {
        System.out.println("Hello " + customer.customerName + " thanks for registering number " + customer.customerNumber);
    };

    static BiConsumer<Customer, Boolean> greetCustomerBiConsumer = (customer, showNumber) ->  {
        System.out.println("Hello " + customer.customerName + " thanks for registering number " + (showNumber ?  customer.customerNumber : "*****"));
    };

    static class Customer {
        private final String customerName;
        private final String customerNumber;

        Customer(String customerName, String customerNumber) {
            this.customerName = customerName;
            this.customerNumber = customerNumber;
        }
    }
}
