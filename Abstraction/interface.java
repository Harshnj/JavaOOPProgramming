package Interface;
// Define the Drawable interface
interface Drawable {
    void draw();
}

// Define the Resizable interface
interface Resizable {
    void resize(int width, int height);
}

// Define the Shape interface, extending Drawable and Resizable
interface Shape extends Drawable, Resizable {
    double area();
}

// Create a class Rectangle that implements the Shape interface
class Rectangle implements Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }

    @Override
    public void resize(int newWidth, int newHeight) {
        this.width = newWidth;
        this.height = newHeight;
        System.out.println("Resizing the rectangle to " + newWidth + "x" + newHeight);
    }

    @Override
    public double area() {
        return width * height;
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 3);

        // Call methods from the implemented interfaces
        rectangle.draw();
        rectangle.resize(8, 4);
        System.out.println("Area: " + rectangle.area());
    }
}
