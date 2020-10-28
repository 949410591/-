package TestArray;

import java.util.Arrays;

public class TestSelectionSort {
    public static void main(String[] args) {
        int [] arr = {3,1,2,4};
        System.out.println(Arrays.toString(selectionSort(arr)));

    }
    public static int[] selectionSort(int arr[]){
        int i;
        int j;
        int n ;
        int index = 0;


        for(i=0;i<arr.length-1;i++){
            System.out.println(Arrays.toString(arr));

            for(j=i;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    index = j+1;
                }
                System.out.println(index);
            }
            n = arr[i];
            arr[i] = arr[index];
            arr[index] = n;
        }




        return arr;
    }
}
