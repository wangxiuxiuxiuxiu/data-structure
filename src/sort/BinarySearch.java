package sort;

//二分查找
public class BinarySearch {

    public static void main(String[] args) {

        int arr[] = {6,9,15,25,68,99,120,120,120,560,666,872};
        //int value = binary(arr,arr.length,560);
       // int value = binarySearch(arr,0,arr.length-1,560);
      //  int value = getFirstElement(arr,0,arr.length-1,120);
       // int value = getLastElement(arr,0,arr.length-1,120);
        //int value = getFirstBigElement(arr,0,arr.length-1,60);
        //int value = getLastLessElement(arr,0,arr.length-1,60);
        int arr2[] = {12,13,14,1,2,3,4,5,6,7,8,9,10,11};
        int value = think(arr2,0,arr.length-1,14);
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

    //课后思考 如果有序数组是一个循环有序数组，比如 7，8，9,10,11,12,13,14，1，2，3,4,5,6。针对这种情况，如何实现一个求“值等于给定值”的二分查找算法呢？

    public static  int think(int arr[],int low,int hight,int value){

       /* 思路
       *
       *    一、区分有序数据和循环有序数据
       *    二、确定查询数据所在范围。
       *
       *
       * 1 取中间值与最右边值判断，如果中间值大于最右边值。
       *      推出，中间值往左是有序数据，中间值往右是循环有序数据
       *
       *        1.1  确定给定值所在范围（中间值的左边还是右边）
       *             1.2 如果左边的最小值大于查找的值，或者中间值小于查找的值，那么说明查找的值在中间值右边。
       *             1.3 左边指针移到中间位置，否则右指针移到中间位置。
       *    2 如果中间值小于最右边
       *        推出，左边可能是循环有序数据，右边是有序数据
       *
       *        2.1 确定查询值所在的范围
       *        如果最右边的元素小于查询的元素，或者中间值大于查询的值，那么说明查询的数据在左边。
       *        2.2 右指针移到中间位置，否则左边指针移到中间位置。
       *
       *
       *
       *
       * */

        while (low<=hight){
            int mid = low + ((hight-low)>>1);
            if(arr[mid]==value)return arr[mid];

            if(arr[mid]>arr[hight]){
                if(arr[low]>value||arr[mid]<value){
                    low = mid+1;
                }else {
                    hight = mid-1;
                }
            }else {
                if (arr[mid]>value||arr[hight]<value){
                    hight = mid-1;
                }else {
                    low = mid+1;
                }
            }


        }

        return -1;
    }
}

