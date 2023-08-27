
package week6;
import java.text.DecimalFormat;

public class TallyCounter {
    private int counter;
    private String pattern = "000";
    private DecimalFormat counterFormat = new DecimalFormat(pattern);
    private String output;

    public TallyCounter(){
        counter = 0;
        output  = counterFormat.format(counter);
    }

    public String toString(){
        updateOutput();
        return output;
    }

    public void increment(){
        if (counter < 999){
            counter += 1;
        }
        else{
            reset();
        }
    }

    public void updateOutput(){
        output = counterFormat.format(counter);
    }

    public int read(){
        return counter;
    }

    private void reset(){
        counter = 0;
    }
}
