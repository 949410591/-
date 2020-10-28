package TestArray;



public class TestBinarySearch {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        binarySearch(arr,3);

    }

    public static void binarySearch(int[] arr, int num) {
        int result;
        int start =0;
        int end = arr.length-1;
        int mid = (start+end)/2;


        while(start <=end){
            System.out.println(start+" "+mid+" "+end);

            if(num == arr[mid]){
                System.out.println("index = "+mid);
                return;
            }

            else if(num<arr[mid]){
                end = mid-1;
                mid = (start+(end-start)/2);
            }
            else{
                start = mid+1;
                mid = (start+(end-start)/2);


            }


        }
        System.out.println("没有找到");
        return;



    }
}


