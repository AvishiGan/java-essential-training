package inheritance;

public class Rectangle {
    protected double length;
    protected double width;
    protected double sides = 4;

    public double getLength() {
        return length;
    }

    public double setLength(double length) {
        return this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double setWidth(double width) {
        return this.width = width;
    }

    public double getSides() {
        return sides;
    }

    public void setSides(double sides) {
        this.sides = sides;
    }

    public double calculatePerimeter() {
        return (2 * length) + (2 * width);
    }

    public void print(){
        System.out.println("I am a rectangle");
    }
}

