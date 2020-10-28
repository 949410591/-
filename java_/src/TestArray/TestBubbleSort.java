package TestArray;

import java.util.Arrays;

public class TestBubbleSort {
    public static void main(String[] args) {
        int[] arr = {9,8,10,7,6,0,11};

        System.out.println(Arrays.toString(bubbleSort(arr)));
    }

    public static int[] bubbleSort(int[] arr) {
        int n = 0;
        int i;
        int j;
        for(i=0; i<arr.length-1;i++){
            for(j=0; j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    n = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = n;

                }
                System.out.println(Arrays.toString(arr));
            }
        }
        //写法一


        for(i=arr.length-1;i>0;i--){
            for(j=0; j<i;j++){
                if(arr[j]>arr[j+1]){
                    n = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = n;

                }
                System.out.println(Arrays.toString(arr));
            }
        }
        //写法二

        return arr;
    }
}