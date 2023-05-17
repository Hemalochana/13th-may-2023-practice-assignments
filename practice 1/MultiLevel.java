    class Base {
        void displayBase() {
            System.out.println("This is Base method.");
        }
    }
    
    class Derived1 extends Base {
        void displayDerived1() {
            System.out.println("This is Derived1 method.");
        }
    }
    
    class Derived2 extends Derived1 {
        void displayDerived2() {
            System.out.println("This is Derived2 method.");
        }
    }
    public class MultiLevel {
        public static void main(String[] args) {
            Derived2 derived2 = new Derived2();
            derived2.displayBase();
            derived2.displayDerived1();
            derived2.displayDerived2();
        }
    }
    
