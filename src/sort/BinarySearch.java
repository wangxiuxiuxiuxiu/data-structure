package sort;

//二分查找
public class BinarySearch {

    public static void main(String[] args) {

        int arr[] = {6,9,15,25,68,99,120,560,666,872};
        //int value = binary(arr,arr.length,560);
        int value = binarySearch(arr,0,arr.length-1,560);
        System.out.println(value);
    }

    //非递归二分查找
    public static int binary(int arr[],int n,int value){

        int low = 0;
        int hight= n-1;
        while (low<=hight){
            int mid = low + (hight-low)/2;
            if(arr[mid]==value){
                return arr[mid] ;
            }else if(arr[mid]>value){
                hight = mid-1;
            }else {
                low = mid + 1;
            }
        }

        return 0;
    }


    //递归二分查找
    public static int binarySearch(int arr[],int low,int hight,int value){
        if(low>hight) return 0;
        int mid = low + ((hight-low)>>2);
        if(arr[mid]==value){
            return arr[mid] ;
        }else if(arr[mid]>value){
            return binarySearch(arr,low, mid-1,value);
        }else {
            return binarySearch(arr, mid + 1,hight,value);
        }
    }
}

