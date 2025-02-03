package InDepth.Section8;

class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void displayPersonDetails() {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Age: " + age);
    }
}

class Address {
    private String street;
    private String city;
    private String state;
    private String zipCode;

    public Address(String street, String city, String state, String zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void displayAddressDetails() {
        System.out.println("Street: " + street);
        System.out.println("City: " + city);
        System.out.println("State: " + state);
        System.out.println("Zip Code: " + zipCode);
    }
}

public class Composition {
    private Person person;
    private Address address;

    public Composition(Person person, Address address) {
        this.person = person;
        this.address = address;
    }

    public void displayCompositionDetails() {
        System.out.println("Person Details:");
        person.displayPersonDetails();
        System.out.println("Address Details:");
        address.displayAddressDetails();
    }

    public static void main(String[] args) {
        Person person = new Person("John", "Doe", 30);
        Address address = new Address("123 Main St", "Springfield", "IL", "62704");

        Composition composition = new Composition(person, address);

        composition.displayCompositionDetails();
    }
}