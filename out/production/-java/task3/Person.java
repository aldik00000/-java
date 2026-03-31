package task3;

public class Person {
    protected String firstName;
    protected String lastName;
    protected int age;
    protected String email;

    public Person(String firstName, String lastName, int age, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
    }

    public void displayInfo() {
        System.out.println("Аты-жөні: " + firstName + " " + lastName);
        System.out.println("Жасы: " + age + ", Email: " + email);
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}