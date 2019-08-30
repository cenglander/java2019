package cirkel;

public class Triangle {

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

    public Triangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double area() {
        double area = (width * height) / 2;
        return area;
    }

    public double circumference() {
        double x2 = width * width + height * height;
        double x = Math.sqrt(x2);
        double circumference = width + height + x;
        return circumference;
    }
}
