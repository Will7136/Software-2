package tsp;

import java.util.Collections;
import java.util.Arrays;

public class Hamiltonian {

    boolean isHamiltonian(int[][] adjacencyMatrix) throws IllegalArgumentException{
        if (isUndirected(adjacencyMatrix) == false){
            throw new IllegalArgumentException();
        }

        return true;
    }


    static int[] NextPermutation(int[] currentPerm){
        int i = 0;
        int j;

        for (int x=1;x<currentPerm.length;x++){
            if(currentPerm[x-1] < currentPerm[x]){
                i = x;
            }
        }

        j = i;

        for (int y=i;y<currentPerm.length;y++){
            if (currentPerm[y] > currentPerm[i - 1]){
                j = y;
            }
        }

        int val = currentPerm[j];
        currentPerm[j] = currentPerm[i-1];
        currentPerm[i-1] = val;

        int[] firstPart = Arrays.copyOfRange(currentPerm, 0, i);
        int[] otherPart = Arrays.copyOfRange(firstPart, i, currentPerm.length);

        otherPart = ReverseArr(otherPart);
        int[] nextPerm = ConcatArr(firstPart, otherPart);
        return nextPerm;
    }

    static int[] ReverseArr(int[] arr){
        int size = arr.length;
        int[] newArr = new int[size];

        for (int x = 0; x < size;x++){
            newArr[size - 1 - x] = arr[x];
        }
        return newArr;
    }

    static int[] ConcatArr(int[] arr1, int[] arr2){
        int newLength = arr1.length + arr2.length;
        int[] newArr = new int[newLength];

        for (int x=0;x< arr1.length;x++){
            newArr[x] = arr1[x];
        }
        for (int y=0;y < arr2.length;y++){
            newArr[arr1.length + y] = arr2[y];
        }
        return newArr;
    }

    int[] FirstPermutation(int[][] mat){
        int matLength = mat.length;
        int[] perm = new int[matLength];

        for(int x=0;x<matLength;x++){
            perm[x] = x;
        }
        return perm;
    }


    //works
    static boolean isUndirected(int[][] adjMat){
        int width = (adjMat).length;
        int height = adjMat[0].length;

        if (width != height){
            return false;
        }

        for (int x =0; x < width; x++){
            for  (int y = 0; y < height; y++){
                if(adjMat[x][y] != adjMat[y][x]){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] mat1 = {{0,1,0,1}, {1,0,0,0}, {0,0,0,1}, {1,0,1,0}};
        int[][] mat2 = {{0,1,0,1}, {1,0,0,1}, {0,0,0,1}, {1,0,0,0}};

        System.out.println(isUndirected(mat1));
        System.out.println(isUndirected(mat2));
        int[] testCurPerm = {0,1,2,3,4};
        int[] testCurPerm2 = {1,0,3,4,2};
        int[] testNextPerm = NextPermutation(testCurPerm);
        int[] testNextPerm2 = NextPermutation(testCurPerm2);
        System.out.println("");
        
    }
}

