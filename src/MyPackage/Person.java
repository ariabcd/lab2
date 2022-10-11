package MyPackage;

public class Person {
    private String FirstName;
    private String LastName;
    private String Job;
/*
    public Person(String firstName) {
        FirstName = firstName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;

 */

    public Person(String firstName, String lastName, String job) {
        FirstName = firstName;
        LastName = lastName;
        Job = job;
    }

    public Person() {

    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getJob() {
        return Job;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setJob(String job) {
        Job = job;
    }
}

