public class Author {
    private String firstName;
    private String lastName;

    public Author () {
    }

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }


    @Override
    public String toString() {
        return "Автор: " + firstName + " " + lastName;
    }
}