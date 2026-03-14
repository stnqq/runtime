package Eleven.Practice;

public class PersonName {
    private String firstName;
    private String lastName;

    public static PersonName parse(String fullName) {
        String[] parts = fullName.split(" ");
        return new PersonName(parts[0], parts[1]);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public PersonName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
