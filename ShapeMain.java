/*design a shape class with attribute colour and area,create a circle class that inherits shape and 
add atribute radius and print area*/
// Base class Shape
class Shape {
    String color;
    double area;

    // Constructor for Shape
    public Shape(String color) {
        this.color = color;
        this.area = 0.0;  // Default area
    }

    // Method to display the area
    public void printArea() {
        System.out.println("Area: " + area);
    }

    // Method to display color
    public void printColor() {
        System.out.println("Color: " + color);
    }
}

// Circle class inherits Shape
class Circle extends Shape {
    double radius;

    // Constructor for Circle
    public Circle(String color, double radius) {
        super(color); // Call parent constructor
        this.radius = radius;
        this.area = Math.PI * radius * radius;
    }

    // Override printArea to show circle-specific area
    @Override
    public void printArea() {
        System.out.println("Circle Area: " + area);
    }
}

// Main class to test
public class ShapeMain {
    public static void main(String[] args) {
        Circle circle = new Circle("Gery", 15.0);
        circle.printColor();
        circle.printArea();
    }
}
