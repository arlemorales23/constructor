package ejemplo5;

public class Person5 {
    private String name;
    private int age;

    public Person5(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person5(String name) {
        this.name = name;
    }

    public Person5() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
