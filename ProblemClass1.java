package week3;

import java.util.*;

public class ProblemClass1 {
    public static void main(String[] args){

        class LinearInterpolation {


            public int[] resample(int[] datapoints, int scale){
                int newArrLength = datapoints.length + (datapoints.length -1 ) * (scale- 1);
                int[] newData = new int[newArrLength];

                for (int x=0; x < newArrLength; x++){
                    if (x%scale == 0){
                        newData[x] = datapoints[x/scale];
                    }
                    else{

                        int y = 0;
                        int x0 = (x/scale) * scale;
                        int x1 = ((x/scale) + 1) * scale;
                        int y0 = datapoints[x/scale];
                        int y1 = datapoints[(x/scale) + 1];
                        //Linear Interpolation formula values

                        y = y0 + (x - x0)*((y1 - y0)/(x1 - x0));
                        //Linear interpolation formula in use

                        newData[x] = y;

                    }
                }
                return newData;
            }

        }

        /// in dev

        // class BilinearInterpolation {

        //     public int[][] gridResample(int[][] originalGrid, int scale){
        //         int newGridWidth =  originalGrid[0].length + (originalGrid[0].length -1 ) * (scale- 1);
        //         int newGridHeight = originalGrid.length + (originalGrid.length -1 ) * (scale- 1);
        //         int[][] newGrid = new int[newGridHeight][newGridWidth];
        //         LinearInterpolation lineResample = new LinearInterpolation();

        //         for (int x = 0; x<newGridHeight;x +=2){   //deals with all even rows first ie 0, 2, 4 etc
        //             newGrid[x] = lineResample.resample(originalGrid[x/scale], scale);
        //         }


        //         for (int y = 0; y<newGridWidth; y++){
        //             int[] currentColumn = new int[originalGrid.length];
        //             int[] newColumn = new int[newGridHeight];
        //             for (int x = 0; x<newGridHeight; x += 2){
        //                 currentColumn[x/scale] = newGrid[x][y];
        //             }

        //             newColumn = lineResample.resample(currentColumn, scale);

        //             for (int x = 0; x<newGridHeight; x++){
        //                 newGrid[x][y] = newColumn[x];
        //             }
        //         }


        //         return newGrid;
        //     }

        // }
            ///in dev

        int[] testData1 = {1, 5, 13, 21};
        int[][] testData2 = {{1,50,20,20}, {100, 255, 150, 30}, {10, 255, 130, 210}, {10, 255, 130, 210}};
        LinearInterpolation resampleTest = new LinearInterpolation();
        // BilinearInterpolation gridResampleTest = new BilinearInterpolation();
        int[] output = resampleTest.resample(testData1, 2);
        System.out.println(Arrays.toString(output));
        System.out.println("Break");
        System.out.println(Arrays.toString(resampleTest.resample(testData1, 4)));
        System.out.println("Break");
        System.out.println("Break");
        // int[][] newArr1 = gridResampleTest.gridResample(testData2, 2);

        // for(int x = 0; x < newArr1.length; x++){
        //     System.out.println(Arrays.toString(newArr1[x]));
        // }
        
        // System.out.println("Break");
        // System.out.println("Break");

        // int[][] newArr2 = gridResampleTest.gridResample(testData2, 4);

        // for(int x = 0; x < newArr2.length; x++){
        //     System.out.println(Arrays.toString(newArr2[x]));
        // }


    }
}
