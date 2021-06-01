package innerdemo.practice;

import java.util.Arrays;

public class IntegerTest {

    public static void main(String args[]){

        String s  = "91 27 46 38 50";
        String arr[] = s.split("");

        int arr1[] = new int[arr.length];
        for (int i = 0;i<arr1.length;i++){

            arr1[i] = Integer.parseInt(arr[i]);

        }

        Arrays.sort(arr1);


    }
}
