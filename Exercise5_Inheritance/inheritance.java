package practical;

public class inheritance {
    public static void main(String[] args) {
    	System.out.println("REG NO:2462602");
        Exp_6 generic = new Exp_6("Generic");
        generic.speak();
        Exp_7 d = new Exp_7("Buddy", "Alice");
        d.speak();
        d.play();
        d.info();
        d.wagTail();

        // Polymorphism : treat Exp_7 as Exp_6
        Exp_6 petAsExp_6 = new Exp_7("Rex", "Bob");
        petAsExp_6.speak();

        // To call play(), cast needed
        if (petAsExp_6 instanceof Exp_7) {
            ((Exp_7) petAsExp_6).play();
        }
    }
}