package constructor;

public class MainGame {
    public static void main(String[] args) {
        Character valquiria=new Character("valquiria",1200,150,4);
        Character minipekka=new Character("minipekka",1000,999,4);
        Deck deck1=new Deck(8,4,"exotico",13);
       Arena arena = new Arena();
       Arena arena2 = new Arena(23);
       Arena arena3 = new Arena(23,5);
       Arena arena4 = new Arena(2, 4, 7);
    }
}
