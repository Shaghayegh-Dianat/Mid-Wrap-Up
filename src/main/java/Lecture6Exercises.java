import javax.swing.*;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Lecture6Exercises {

    /*
     *   implement a function that takes an array of int and return sum of
     *   elements at even positions
     *   lecture 6 page  16
     */
    public long calculateEvenSum(int[] arr) {
        long sum=0;
        for(int i=0;i<arr.length;i=i+2){
            sum=sum+arr[i];
        }
        return sum;
    }


    /*
     *   implement a function that takes an array of int and return that
     *   array in reverse order
     *   lecture 6 page 16
     */
    public int[] reverseArray(int[] arr) {
        int n=arr.length;
        int[] result=new int[n];
        for (int i=0;i<n;i++){
            result[i]=arr[n-1-i];
        }
        return result;
    }

    /*
     *   implement a function that calculate product of two 2-dim matrices
     *   lecture 6 page 21
     */
    public double[][] matrixProduct(double[][] m1, double[][] m2) throws RuntimeException {

        if (m1[0].length != m2.length) {
            throw new IllegalArgumentException("Matrices cannot be multiplied");
        }    // check if number of the column of m1=! number of the row of m2 throw exception

        int m = m1.length;
        int n = m2[0].length;
        int p = m2.length;
        double[][] matrix = new double[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                for (int k = 0; k < p; k++) {
                    matrix[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }

        return matrix;
    }
    /*
     *   implement a function that return array list of array list of string
     *   from a 2-dim string array
     *   lecture 6 page 30
     */
    public List<List<String>> arrayToList(String[][] names) {
        List<List<String>> list = new ArrayList<>();

        for (int i = 0; i < names.length; i++) {
            ArrayList<String> sublist = new ArrayList<>();

            for (int j = 0; j < names[i].length; j++) {
                sublist.add(names[i][j]);
            }

            list.add(sublist);
        }

        return list;
    }


    /*
     *   implement a function that return a list of prime factor of integer n
     *   in ascending order
     *   lecture 6 page 30
     */
    public List<Integer> primeFactors(int n) {

        List<Integer> factors = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                if (!factors.contains(i)) {
                    factors.add(i);
                }
                n /= i;
            }
        }
        return factors;
    }


    /*
     *   implement a function that return a list of words in a given string
     *   lecture 6 page 30
     */
    public List<String> extractWord(String line) {
        String convertLine=line.replaceAll("[^a-zA-Z\\s]","");
        String[] wordsArray = convertLine.split("\\s+");
        List<String> words=new ArrayList<>(Arrays.asList(wordsArray));
        return words;
    }
}

