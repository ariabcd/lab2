import MyPackage.Person;

public class Main {
    public static void main(String[] args) {

    }
    private static Person Database(){
        Person person = new Person();
        person.setFirstName("Pop");
        person.setLastName("Ana");
        person.setJob("Sofer");
        return person;
    }
}