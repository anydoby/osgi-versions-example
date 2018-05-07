package osgitest.model;

public class Person {

    String firstName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName + "F";
    }

}
