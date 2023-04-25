package practice_1;

import java.util.Arrays;

public class bubbleSort {

    public void bubbleSort_1(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {4, 3, 2, 1};

        System.out.print(Arrays.stream(arr).toArray());
        System.out.println();

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        // Bubble Sort
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i -1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.println(Arrays.stream(arr).toArray());


        // Binary search: you have to have the list sorted already in order to perform binary search
        int left = 0;
        int right = arr.length -1;
        int mid = (right - left) /2;
        int target=3;

        while(left <= right){
            if(target == arr[mid]){
                System.out.println("Found at "+mid);
            }
            else if(target < arr[mid]){
                right = mid - 1;
            }
            else{
                left = mid+1;
            }
        }


    }
}
