package week5;

public class Square extends Rectangle{

    public Square(){
        super();
    }

    public Square(double side){
        super(side, side);
    }

    public Square(double side, String newColor, boolean isFilled){
        super(side, side, newColor, isFilled);
    }

    public double getSide(){
        return super.getLength();
    }

    public void setLength(double length){
        super.setLength(length);
        super.setWidth(length);
    }

    public void setWidth(double width) {
        super.setLength(width);
        super.setWidth(width);
    }

    public String toString(){
        return ("A square with side=" + this.getSide() + ", which is a subclass of " + super.toString());
    }
}
