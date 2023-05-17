
    class SuperClass {
        SuperClass() {
            System.out.println("Super class constructor is called.");
        }
    }
    
    class SubClass extends SuperClass {
        SubClass() {
            System.out.println("Sub class constructor is called.");
        }
    }
    public class SuperConstructor {
        public static void main(String[] args) {
            SubClass subClass = new SubClass();
        }
    }
    