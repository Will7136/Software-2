package week5;

public class shape {
    private boolean filled;
    private String color;

    public shape(){
        filled = true;
        color = "red";
    }

    public shape(String newColor, boolean isFilled){
        filled = isFilled;
        color = newColor;
    }

    public String getColor(){
        return color;
    }

    public boolean isFilled(){
        return filled;
    }

    public String toString(){
        if (filled){
            return ("A Shape with color of " + color + " and filled.");
        }
        else{
            return ("A Shape with color of " + color + "and not filled");
        }
    }
}


