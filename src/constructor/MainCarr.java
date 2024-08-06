package constructor;

public class MainCarr {
    public static void main(String[] args) {
        Carr car = new Carr("gfd451",2023); // instancia
        Carr car2 = new Carr("dfe451", 1995);
        car.setPlate("xxx123");
        System.out.println(car.getPlate());
    }
}
