public class Main {
    int number;
    float distance;

    Player player;

    public static void main(String[] args) {
        Person p1 = new Player();
        p1.naam = "Ferdi";

    }
}


class Person{
    String naam;
}

class Player extends Person {
    int rugnummer;

    void play(){
        System.out.print("play");
    }
    public void support(){
        System.out.print(naam + "geeft schouderklopje");
    }

}


class coach extends Person{
    int salaris;

    public void support(){
        System.out.print(naam + "ren harder");
    }

    interface Supporter{
        void support();
    }

}