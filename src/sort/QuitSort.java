package sort;


import java.lang.reflect.Array;
import java.util.Collections;

//快速排序
public class QuitSort {
    /**
     *
     * 思想 ：
     *      分区：在一组数据p-r 中，随机取一个元素q ,在数组中依次取出元素和q 比较
     *          小于q元素的放在左边，大于q 的放在右边。
     *
     *      分治：使用递归方式，将左边和右边排序好。
     *
     *
     *      推出递推公式 f(p..r) = f(p..q-1)+f(q+1..r)
     *                  终止条件 p>r
     *
     *
     *
     * */

    public static void main(String[] args) {

        int arr[] = {6,26,2,99,15,5,8,9,88,26};
        merge(arr,0,arr.length-1);

        print(arr);
    }



    //分治

    public static void merge(int arr[],int p,int right){
        if(p>right)return;
        int q = deArea(arr,p,right);//获取分区点
        merge(arr, p, q-1);
        merge(arr, q+1, right);
    }


    //分区
    public static int deArea(int arr[],int p,int right){
        int rand = arr[right];//这里取最后一个元素
        int i=p;
        int j=p;
        for (;j<right;j++){
            if(arr[j]<rand){//交换
                swap(arr, i, j); // 交换
                i++;
            }
        }
        swap(arr, i, right); // 交换
        //返回据点
        return i;
    }
    //交换
    public static void swap(int arr[],int i,int j){
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    public static void print(int arr[]){
        for (int key:arr
        ) {
            System.out.println(key);
        }
    }
}
