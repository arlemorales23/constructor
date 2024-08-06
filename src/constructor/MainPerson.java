package constructor;

public class MainPerson {
    public static void main(String[] args) {
        Person person=new Person("Johan Bonito",18);
        person.setName("Delgadillo feo");
        System.out.println(person.getName());
    }
}
