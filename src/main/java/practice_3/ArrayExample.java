package practice_3;

import java.lang.reflect.Array;
import java.util.Arrays;

// input is a string and you want to sort the array and output the array
public class ArrayExample {

    public static void main(String[] args) {

        String data = "12,23,43,56,6,7,32,56,1,0";
        String[] arr = data.split(",");
        int[] arr_int = new int[arr.length];

        for(int i=0;i<arr.length;i++){
            arr_int[i]  = Integer.parseInt(arr[i]);
        }


        for(int i:arr_int){
            System.out.print(i+" ");
        }
        System.out.println();

        Arrays.sort(arr_int);

        for(int i:arr_int){
            System.out.print(i+" ");
        }

        System.out.println(Arrays.toString(arr_int));




    }
}
