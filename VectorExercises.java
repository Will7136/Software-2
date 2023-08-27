package Algebra;

public class VectorExercises {


    private double[] vectorVals;
    private int vectorDimension;

    public VectorExercises(double[] values){
        vectorVals = values;
        vectorDimension = vectorVals.length;
    }

    public String toString(){
        String outputString = "[";

        for(int x = 0; x < vectorDimension;x++){
            if (x < (vectorDimension - 1)){
                outputString += Double.toString(vectorVals[x]) + ", ";
            }
            else{
                outputString += Double.toString(vectorVals[x]) + "]";
            }
        }
        return outputString;
    }

    public int size(){
        return vectorDimension;
    }

    public Double get(int index){
            if ((index >= vectorDimension) || (index < 0)){
                throw new InvalidDimensionException("The extered index value is invalid");
            }
            else{
                return vectorVals[index];
            }
        
    }

    public Double set(int index, double value){
        if ((index >= vectorDimension) || (index < 0)){
            throw new InvalidDimensionException("The extered index value is invalid");
        }
        else{
            double preVal = vectorVals[index];
            vectorVals[index] = value;
            return preVal;
        }
    }

    public VectorExercises scalarProduct(double scalar){
        VectorExercises newVec = new VectorExercises(new double[vectorDimension]);

        for (int x = 0; x < vectorDimension; x++){
            newVec.set(x, (vectorVals[x]*scalar));
        }

        return newVec;
    }

    public VectorExercises add(VectorExercises otherVector) throws IncompatibleDimensionException{
        if (otherVector.size() != vectorDimension){
            throw new IncompatibleDimensionException("Dimensions not compatible");
        }
        VectorExercises newVec = new VectorExercises(new double[vectorDimension]);

        for (int x = 0; x < vectorDimension; x++){
            newVec.set(x, (vectorVals[x] + otherVector.get(x)));
        }

        return newVec;
    }

    public boolean equals(Object other){

        if (other.getClass() != this.getClass()){
            return false;
        }
        VectorExercises newVec = (VectorExercises)other;

        for (int x = 0; x < vectorDimension; x++){
            if (newVec.get(x) != vectorVals[x]){
                return false;
            }
        }
        return true;
        
    }



    public static void main(String[] args) throws IncompatibleDimensionException{
        VectorExercises vecTest = new VectorExercises(new double[]{4.0, 3.0, 7.0});
        int testDim = vecTest.size();
        VectorExercises testScal = vecTest.scalarProduct(3);
        VectorExercises testAdd = vecTest.add(testScal);
        double testGet = vecTest.get(1);
        double testSet = vecTest.set(1, 6.0);
        System.out.println(vecTest.toString());
        VectorExercises testEquals1 = new VectorExercises(new double[]{4.0, 3.0, 7.0});
        VectorExercises testEquals2 = new VectorExercises(new double[]{4.0, 2.0, 7.0});
        // Object testEquals3 = null;

        boolean test1 = vecTest.equals(testEquals1);
        boolean test2 = vecTest.equals(testEquals2);
        // boolean test3 = vecTest.equals(testEquals3);

        double testGetException = vecTest.get(2);
        double testSetException = vecTest.set(5, 6.0);
    }

    
}