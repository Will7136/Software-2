package week5;

public class Rectangle extends shape{
    private double width;
    private double length;

    public Rectangle(){
        super();
        width = 1.0;
        length = 1.0;
    }

    public Rectangle(double newWidth, double newLength){
        super();
        width = newWidth;
        length = newLength;
    }

    public Rectangle(double newWidth, double newLength, String color, boolean isFilled){
        super(color, isFilled);
        width = newWidth;
        length = newLength;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        return (length * width);
    }

    public double getPerimeter(){
        return (2 * (length + width));
    }

    public String toString(){
        return ("A rectangle woth width=" + width + " and length=" + length + ", which is a subclass of " + super.toString());
    }
}
