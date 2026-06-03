interface Playable {
    void play();
}

class Guitar implements Playable {
    public void play() {
        System.out.println("Playing Guitar");
    }
}

class Piano implements Playable {
    public void play() {
        System.out.println("Playing Piano");
    }
}

public class InterfaceImplementation {
    public static void main(String[] args) {
        Playable item1 = new Guitar();
        Playable item2 = new Piano();

        item1.play();
        item2.play();
    }
}