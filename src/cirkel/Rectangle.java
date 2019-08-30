package cirkel;

public class Rectangle {

    private double width;
    private double height;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double area() {
        double area = width * height;
        return area;
    }

    public double circumference() {
        double circumference = 2 * width + 2 * height;
        return circumference;
    }
}

