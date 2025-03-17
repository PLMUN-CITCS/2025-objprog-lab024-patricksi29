public class PersonDemo {
    public static void main(String[] args) {
        // Step 5: Create Person objects
        Person person1 = new Person("Bob", 30);  // Using the parameterized constructor
        Person person2 = new Person();           // Using the default constructor

        // Step 6: Call the displayPerson() method to print details
        person1.displayPerson();  // Display details of person1
        person2.displayPerson();  // Display details of person2
    }
}
