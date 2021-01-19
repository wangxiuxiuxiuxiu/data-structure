package sort;

//二分查找
public class BinarySearch {

    public static void main(String[] args) {

        int arr[] = {6,9,15,25,68,99,120,120,120,560,666,872};
        //int value = binary(arr,arr.length,560);
       // int value = binarySearch(arr,0,arr.length-1,560);
      //  int value = getFirstElement(arr,0,arr.length-1,120);
       // int value = getLastElement(arr,0,arr.length-1,120);
        int value = getFirstBigElement(arr,0,arr.length-1,60);
        //int value = getLastLessElement(arr,0,arr.length-1,60);
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
        int mid = low + ((hight-low)>>1);
        if(arr[mid]==value){
            return arr[mid] ;
        }else if(arr[mid]>value){
            return binarySearch(arr,low, mid-1,value);
        }else {
            return binarySearch(arr, mid + 1,hight,value);
        }
    }

    //变体二分查找
    //变体一：查找第一个值等于给定值的元素

    public static  int getFirstElement(int arr[],int low,int hight,int value){

        while (low<=hight){
            int mid = low + ((hight-low)>>1);
            if (arr[mid]>value){
                hight = mid-1;
            }else if(arr[mid]<value){
                low = mid+1;
            }else {
                //如果中间值等于给定值，判断mid 是否是数组第一个值，或mid 的前一个值是否等于给定值
                if(mid==0||arr[mid-1]!=value){
                    System.out.println("数组角标："+mid);
                    return arr[mid];
                }else {
                    hight = mid-1;
                }
            }
        }

        return -1;
    }
    //变体二：查找最后一个值等于给定值的元素

    public static  int getLastElement(int arr[],int low,int hight,int value){
        while (low<=hight){
            int mid = low + ((hight-low)>>1);
            if (arr[mid]>value){
                hight = mid-1;
            }else if(arr[mid]<value){
                low = mid+1;
            }else {
                //如果中间值等于给定值，判断mid 是否是数组最后一个值，或mid 的后一个值是否等于给定值
                if(mid==arr.length-1||arr[mid+1]!=value){
                    System.out.println("数组角标："+mid);
                    return arr[mid];
                }else {
                    low = mid+1;
                }
            }
        }

        return -1;
    }
    //变体三：查找第一个大于等于给定值的元素

    public static  int getFirstBigElement(int arr[],int low,int hight,int value){
        while (low<=hight){
            int mid = low + ((hight-low)>>1);

            if ((arr[mid]<value)){
                low = mid+1;
            }else{
               if (mid==0||arr[mid-1]<value){
                   System.out.println("数组角标："+mid);
                   return arr[mid];
               }else {
                   hight = mid-1;
               }
            }
        }

        return -1;
    }

    //变体四：查找最后一个小于等于给定值的元素

    public static  int getLastLessElement(int arr[],int low,int hight,int value){

        while (low<=hight){
            int mid = low + ((hight-low)>>1);
            if ((arr[mid]>value)){
                hight = mid-1;
            }else{
                if (mid==arr.length-1||arr[mid+1]>value){
                    System.out.println("数组角标："+mid);
                    return arr[mid];
                }else {
                    low = mid+1;
                }
            }
        }

        return -1;
    }
}

