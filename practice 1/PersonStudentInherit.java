
    class Person {
        String name;
        int age;
    
        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
    
    class Student extends Person {
        int studentId;
    
        Student(String name, int age, int studentId) {
            super(name, age);
            this.studentId = studentId;
        }
    
        void displayStudentInfo() {
            System.out.println("Student ID: " + studentId);
            System.out.println("Student Name: " + name);
            System.out.println("Student Age: " + age);
        }
    }
    
    public class PersonStudentInherit {
        public static void main(String[] args) {
            Student student = new Student("James Adam", 22, 1);
            student.displayStudentInfo();
        }
    }
    
