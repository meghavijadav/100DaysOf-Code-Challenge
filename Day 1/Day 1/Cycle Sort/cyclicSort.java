import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class cyclicSort {
    public static void main(String[] args) {
        //Approach
        //1. Start looking from i
        //2. Put i in the correct index
        //3. only move i when it is in the correct index
        //check swap move

        int[] arr = {3, 5, 2, 1, 4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort (int[] arr){
        int i = 0;
        while (i < arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]){
                swap(arr, i , correctIndex);
            }else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
