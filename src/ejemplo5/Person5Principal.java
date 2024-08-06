package ejemplo5;

public class Person5Principal {
    public static void main(String[] args) {
        Person5 person5 = new Person5("juan",23);
        Person5 y = new  Person5("Lina");
        System.out.println(y.getName());
        Person5 x = new  Person5();
        System.out.println(person5.getName()+ person5.getAge());
    }
}
