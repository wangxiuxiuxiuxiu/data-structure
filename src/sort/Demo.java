package sort;

import java.util.Random;

//排序  冒泡排序
public class Demo {
    public static void main(String[] args) {
       // int []arr = {6,9,8,5,2,1,7,7,9};
      // arr =  blu(arr);
        //bubbleSort(arr,arr.length);
        System.out.println();

        //打印
     /*   for (int key=0;key<arr.length;key++) {
            System.out.println(arr[key]);
        }*/

        int arr[] = getArray();
        long begin= System.currentTimeMillis();
        System.out.println("开始排序："+begin);
        blu(arr);
        long end= System.currentTimeMillis();
        System.out.println("结束排序："+end);
        System.out.println("排序使用时间："+(end-begin));
    }

    //冒泡排序
    public static  int[] blu(int []arr){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        return arr;
    }


    // 冒泡排序，a表示数组，n表示数组大小  升级版
    public static void bubbleSort(int[] a, int n) {
        if (n <= 1) return;

        for (int i = 0; i < n; ++i) {
            // 提前退出冒泡循环的标志位
            boolean flag = false;
            for (int j = 0; j < n - i - 1; ++j) {
                if (a[j] > a[j+1]) { // 交换
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                    flag = true;  // 表示有数据交换
                }
            }
            if (!flag) break;  // 没有数据交换，提前退出
        }
    }

    public  static  int[] getArray(){
        int arr[] = new int[2000];
        Random R = new Random();
        for (int i=0;i<2000;i++){
            int value =  R.nextInt(100);
            arr[i] = value;

        }
        return  arr;
    }
}

