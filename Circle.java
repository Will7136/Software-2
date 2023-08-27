package week5;

public class Circle extends shape{
    private double radius;

    public Circle(){
        super();
        radius = 1.0;
    }

    public Circle(double newRadius){
        super();
        radius = newRadius;
    }

    public Circle(double newRadius, String newColor, boolean isFilled){
        super(newColor, isFilled);
        radius = newRadius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getArea(){
        return (Math.pow(radius, 2) * Math.PI);
    }

    public double getPerimeter(){
        return (radius * 2 * Math.PI);
    }

    public String toString(){
            return ("A Circle with radius " + radius + ", which is a subclass of " + super.toString());
    }
}
