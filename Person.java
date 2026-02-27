public class Person {

    private String firstName;
    private String lastName;
    private String gender;

    public Person() {}

    public Person(String firstName, String lastName, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public String toString() {
        return "Person: " + firstName + " " + lastName + ", Gender: " + gender;
    }

    // also another equals method for Person class.
    public boolean equals(Person p) {
        return firstName.equals(p.firstName) &&
               lastName.equals(p.lastName) &&
               gender.equals(p.gender);
    }
}