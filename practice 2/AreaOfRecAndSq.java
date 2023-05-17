class Area {
    public void printArea(int length, int breadth) {
        int area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }

    public void printArea(int side) {
        int area = side * side;
        System.out.println("Area of Square: " + area);
    }
}

public class AreaOfRecAndSq {
    public static void main(String[] args) {
        Area areaObj = new Area();
        areaObj.printArea(2, 4);
        areaObj.printArea(6);
    }
}
