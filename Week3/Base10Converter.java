package week3;

public class Base10Converter {        

    public static int toBase10(String binary){
        int denaryValue = 0;
        int binLen = binary.length();
        double charVal = 0;

        for (int x = 0; x< binary.length(); x++){
            if (binary.charAt(x) == '1'){
                charVal = Math.pow(2, (binLen - x - 1));
                denaryValue = denaryValue + (int)charVal;
            }
        }
        return denaryValue;
    }
    
    public static void main(String[] args) {

        String test1 = "10010011";
        String test2 = "01111111";


        String den1 = Integer.toString(toBase10(test1));
        String den2 = Integer.toString(toBase10(test2));

        System.out.println(den1);
        System.out.println(den2);
    }
 
}
