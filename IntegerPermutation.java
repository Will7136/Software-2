package SummerTerm;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javafx.css.Size;

public class IntegerPermutation {
    
    static List<Integer> nextPermutation(List<Integer> sequence){
        Integer i = 0;
        Integer j = 0;
        List<Integer> permutation = sequence;
        List<Integer> newPermutation = new ArrayList<Integer>();
        List<Integer> firstPartPermutation = new ArrayList<Integer>();
        List<Integer> otherPartPermutation = new ArrayList<Integer>();

        for (int x = 1; x < sequence.size();x++){
            if (sequence.get(x-1) < sequence.get(x)){
                i = x;
            }
            else{
                return null;
            }
        }
        for (int y = i-1; y < sequence.size(); y++){
            if (sequence.get(y) > sequence.get(i -1)){
                j = y;
            }
        }
        Integer preIVal = permutation.get(i-1);
        permutation.set(i-1, permutation.get(j));
        permutation.set(j, preIVal);

        firstPartPermutation = permutation.subList(0, i);
        otherPartPermutation = permutation.subList(i, sequence.size());
        otherPartPermutation = Reverse(otherPartPermutation);


        newPermutation.addAll(firstPartPermutation);
        newPermutation.addAll(otherPartPermutation);



        

        return newPermutation;
    }

    static Set<List<Integer>> allPermutations(int n) throws IllegalArgumentException{
        if (n <= 0){
            throw new IllegalArgumentException();
        }

        Set<List<Integer>> permutations = new HashSet<List<Integer>>();
        List<Integer> previousTerm = FirstPermutation(n);
        Integer loopNum = Factorial(n);


        permutations.add(previousTerm);
        for (int x = 1; x < loopNum; x++){
            List<Integer> currentTerm = nextPermutation(previousTerm);
            permutations.add(currentTerm);
            previousTerm = currentTerm;
        }

        return permutations;
    }

    static List<Integer> FirstPermutation(int n){
        List<Integer> perm = new ArrayList<>();
        for(Integer x = 0; x < n; x++){
            perm.add(x);
        }
        return perm;
    }

    static Integer Factorial(int n){
        Integer nFactorial = 1;
        for(int x = 1; x <= n; x++){
            nFactorial = nFactorial * x;
        }
        return nFactorial;
    }

    static List<Integer> Reverse(List<Integer> oldList){
        List<Integer> newList = new ArrayList<>();
        for (int x = 1; x <= oldList.size(); x++){
            newList.add(oldList.get(oldList.size() - x));
        }
        return newList;
    }


    public static void main(String[] args) {
        Set<List<Integer>> permSet = allPermutations(4);
        for (int x = 0; x < permSet.size(); x++){
            System.out.println(permSet.toString());
        }
    }
}
