class Base {
    void displayBase() {
        System.out.println("This is Base method.");
    }
}

class Derived extends Base {
    void displayDerived() {
        System.out.println("This is Derived method.");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Derived derived = new Derived();
        derived.displayBase();
        derived.displayDerived();
    }
}
