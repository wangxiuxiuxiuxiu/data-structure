package sort;

import java.util.Random;

//插入排序
public class InsertSort {

    /**
     * 思路
     *
     *  1、将数据分为两个区间 一个已排序好的，一个未排序的
     *  2、初始化已排序好的，默认只有一个元素，即数据左边第一个元素
     *  3、从未排序的区间取元素，与排序好的区间的值比较，如果小于则循环移动数据。
     *  4、移出位置后插入
     *
     *
     * */
    public static void main(String[] args) {

        //int arr[] = {9,5,7,10,13,1,5,6};

        int arr[] = getArray();
        long begin= System.currentTimeMillis();
        System.out.println("开始排序："+begin);
        insert(arr,arr.length);
        long end= System.currentTimeMillis();
        System.out.println("结束排序："+end);
        System.out.println("排序使用时间："+(end-begin));

     /*   for (int key:arr) {
            System.out.println(key);
        }*/
    }

    public  static  int[] getArray(){
        int arr[] = new int[2000];
        Random random = new Random();
        for (int i=0;i<2000;i++){
            int value =  random.nextInt(100);
            arr[i] = value;

        }
        return  arr;
    }
    public static int[] insert(int [] arr,int n){


        for (int i=1;i<n;++i){
            int value = arr[i];
            int j = i-1;
            for (;j>=0;--j){

                if(arr[j]>value){
                    //数据移动
                    arr[j+1] = arr[j];
                }else{
                    break;
                }
            }
            //插入数据
            arr[j+1] = value;
        }
        return  arr;
    }
}
