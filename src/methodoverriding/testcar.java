package methodoverriding;

public class testcar {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        BMW b = new BMW();
        b.stop();
        b.start();
        b.refuel();
        b.theftsafety();

        car c1 = new BMW();
        // only common and parent class methods are called using dynamic
        // polymorphism
        c1.stop();
        c1.refuel();
        c1.start();
        // c1.theftsafety();

    }

}
