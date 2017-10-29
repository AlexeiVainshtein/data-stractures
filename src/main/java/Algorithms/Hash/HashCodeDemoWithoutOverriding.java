package Algorithms.Hash;


import java.util.HashMap;
import java.util.Map;

class Customer {
    private int customerID;
    private String firstName;
    private String lastName;

    public Customer(int customerID, String firstName, String lastName) {
        super();
        this.customerID = customerID;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("in the equals " + super.equals(o));
       return super.equals(o);

    }

    @Override
    public int hashCode() {
        System.out.println("in the hash " + super.hashCode());
       return super.hashCode();
    }
}
public class HashCodeDemoWithoutOverriding {

    public static void main(String[] args) {
        Map<Customer, String> m = new HashMap<Customer, String>();
        Customer cust = new Customer(1, "Roger", "Cox");
        m.put(cust,"Roger Cox");
        // retrieving using another instance
        System.out.println("Starting");
        System.out.println(m.get(new Customer(1, "Roger", "Cox")));
        // retrieving using same instance
        System.out.println(m.get(cust));
    }
}